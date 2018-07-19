package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Score;
import dao.DeleteScore;


public class DeleteScoreServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String courseId = req.getParameter("courseId");
		Score scores = new Score();
		scores.setStudentId(id);
		scores.setCourseId(courseId);
		
		if (DeleteScore.DeleteGrade(scores)){
			
			req.setAttribute("message", "success");
			req.getRequestDispatcher("message.jsp").forward(req, resp);
			
		}else{
			
			req.setAttribute("message", "fail");
			req.getRequestDispatcher("message.jsp").forward(req, resp);
		}
			
		
	}
	

}
