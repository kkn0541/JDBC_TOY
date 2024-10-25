package edu.kh.student.controller;

import java.io.IOException;

import edu.kh.student.service.StudentService;
import edu.kh.student.service.StudentServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/student/add")
public class AddServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			StudentService service = new StudentServiceImpl();
					
					
			
			
			String stdName = req.getParameter("stdName");
			int stdAge = Integer.parseInt(req.getParameter("stdAge"));
			String stdGender = req.getParameter("stdGender");
			String stdScore= req.getParameter("stdScore");
			
			int result = service.studentAdd(stdName,stdAge,stdGender,stdScore);
			
			String message =null;
			
			HttpSession session = req.getSession();
			
			
			if(result>0) {
				message="추가성공";
				session.setAttribute("message", message);
				resp.sendRedirect("/");
			}else {
				message="추가실패";
				session.setAttribute("message", message);
				resp.sendRedirect("/student/addView");
				
			}
			
			
			//FOWARD 는 내가또 보여주고자 하는 페이지가 있을때 사용한다 
			//리다이렉트로 메인으로만 보내주려고 하니까 필요없음 
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
