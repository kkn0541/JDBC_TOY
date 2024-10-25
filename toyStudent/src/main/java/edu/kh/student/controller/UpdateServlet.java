package edu.kh.student.controller;

import java.io.IOException;
import java.sql.SQLException;

import edu.kh.student.dto.Student;
import edu.kh.student.service.StudentService;
import edu.kh.student.service.StudentServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/studnet/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 수정 화면 요청

		try {
			int stdNo = Integer.parseInt(req.getParameter("stdNo"));
			StudentService service = new StudentServiceImpl();

			// 이전에 만든 view 서비스 호출
			Student student = service.studentDetailView(stdNo);

			req.setAttribute("student", student);

			String path = "/WEB-INF/views/update.jsp";
			req.getRequestDispatcher(path).forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			String stdName = req.getParameter("name");
			int stdAge = Integer.parseInt(req.getParameter("age"));
			String stdScore = req.getParameter("score");
			int stdNo =Integer.parseInt(req.getParameter("number"));

		//	Student student = new Student(stdName, stdAge, stdGender, stdScore,stdNo);

			
			
			
			StudentService service = new StudentServiceImpl();
			
			int result = service.studentUpdate(stdName,stdAge,stdScore,stdNo);
			
			
			//-----값 넘어온 후 
			
			
			String url = null;
			String message = null;
			
			if(result>0) { // 성공
				url="/";
				message ="수정 되었습니다.";
				
			}else { // 실패
				url="/student/update?stdNo="+stdNo;
				message ="수정 실패";
			}
			
			//req 안에 메서드 뭐있는지
			//session 객체에 속성 추가 
			req.getSession().setAttribute("message", message);
			
			
			
			//redirect get 방식 요청 
			resp.sendRedirect(url);
			
		
		}catch (SQLException sqle) {
			System.out.println();
			sqle.printStackTrace();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
