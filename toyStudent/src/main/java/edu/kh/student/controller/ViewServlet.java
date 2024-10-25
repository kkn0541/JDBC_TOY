package edu.kh.student.controller;

import java.io.IOException;

import edu.kh.student.dto.Student;
import edu.kh.student.service.StudentService;
import edu.kh.student.service.StudentServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/student/detail")
public class ViewServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			
			int stdNo = Integer.parseInt(req.getParameter("stdNo"));

			StudentService service = new StudentServiceImpl();

			Student student = service.studentDetailView(stdNo);

			if (student == null) {

				// session 객체 생성 후 message 셋팅하기
				HttpSession session = req.getSession();
				session.setAttribute("message", "조회할 학생이 없습니다.");

				resp.sendRedirect("/");
				return;
			}
			
			
			
			req.setAttribute("student", student);

			
			// JSP 파일 경로 (webapp폴더 기준작성)
			String path = "/WEB-INF/views/detail.jsp";

			// 요청 발송자를 이용해서 요청 위임 ( 실제 위임코드 .forward(req, resp);
			req.getRequestDispatcher(path).forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
