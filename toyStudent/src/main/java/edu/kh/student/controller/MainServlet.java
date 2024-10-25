package edu.kh.student.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.student.dto.Student;
import edu.kh.student.service.StudentService;
import edu.kh.student.service.StudentServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			StudentService service = new StudentServiceImpl();
			
			List<Student> studentList=  service.StudentFullView();
			
			req.setAttribute("studentList", studentList);
			
			String path="/WEB-INF/views/main.jsp";
			
			req.getRequestDispatcher(path).forward(req, resp);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
