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

@WebServlet("/studnet/delete")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int stdNo = Integer.parseInt(req.getParameter("stdNo"));

			StudentService service = new StudentServiceImpl();

			int result = service.stdudentDelete(stdNo);

			System.out.println(stdNo);
			

			String url = null;
			String message = null;
			
			
			HttpSession session = req.getSession();
						
			if(result>0) {
				resp.sendRedirect("/");	
			}else {
				url="/student/update?stdNo="+stdNo;
				session.setAttribute("message", "삭제실패");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
