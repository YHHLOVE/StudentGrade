package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Student;
import dao.DeleteStu;


public class DeleteStuServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Student stu = new Student();
		stu.setStudentId(id);
		
		
		if (DeleteStu.DeleteStuInfo(stu)){
			
			req.setAttribute("message", "success");
			req.getRequestDispatcher("message.jsp").forward(req, resp);
			
		}else{
			
			req.setAttribute("message", "fail");
			req.getRequestDispatcher("message.jsp").forward(req, resp);
		}
			
		
	}
	

}
