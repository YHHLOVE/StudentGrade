package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Student;
import dao.UpdateStu;


public class UpdateStuServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = new String(req.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
		String studentclass = new String(req.getParameter("class").getBytes("ISO-8859-1"),"utf-8");
		String sex = new String(req.getParameter("sex").getBytes("ISO-8859-1"),"utf-8");
		
		//Student stu = new Student(name,sex,studentclass,password,id);
		Student stu = new Student();
		stu.setStudentId(id);
		stu.setPassWord(password);
		stu.setStudentName(name);
		stu.setStudentClass(studentclass);
		stu.setStudentSex(sex);
		
		if (UpdateStu.UpdateStuInfo(stu)){
			
			req.setAttribute("message", "success");
			req.getRequestDispatcher("message.jsp").forward(req, resp);
			
		}else{
			
			req.setAttribute("message", "fail");
			req.getRequestDispatcher("message.jsp").forward(req, resp);
		}
			
		
	}
	

}
