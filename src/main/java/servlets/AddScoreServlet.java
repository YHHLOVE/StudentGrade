package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Score;
import dao.AddScore;



public class AddScoreServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String courseId = req.getParameter("courseId");
		String Sgrade = req.getParameter("grade");
		int grade = Integer.parseInt(Sgrade);
		Score grades = new Score(id,courseId,grade);
		
		if(grades.getGrade()>=0&&grades.getGrade()<=100){
			if (AddScore.AddGrade(grades)){
			
				req.setAttribute("message", "success");
				req.getRequestDispatcher("message.jsp").forward(req, resp);
			
			}else{
			
				req.setAttribute("message", "fail");
				req.getRequestDispatcher("message.jsp").forward(req, resp);
			}
		}else{
			req.setAttribute("message", "fail");
			req.getRequestDispatcher("message.jsp").forward(req, resp);
		}
			
		
	}
	

}
