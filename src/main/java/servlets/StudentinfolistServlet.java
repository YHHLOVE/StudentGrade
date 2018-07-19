package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Student;
import dao.StudentDao;

public class StudentinfolistServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String studentName =new String(req.getParameter("stu_name").getBytes("ISO-8859-1"),"utf-8");
		System.out.println(studentName);
		List<Student> list = StudentDao.studentinfolist(studentName);
		req.setAttribute("studentAll", list);
		if(list.size()>=0){
		    req.getRequestDispatcher("/student_info_list.jsp").forward(req, resp);
		}
		else{
			req.setAttribute("message", "nostu");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String studentName =req.getParameter("stu_name");
		System.out.println("2542"+studentName);
		List<Student> list = StudentDao.studentinfolist(studentName);
		req.setAttribute("studentAll", list);
		if(list.size()>=0){
		    req.getRequestDispatcher("/student_info_list.jsp").forward(req, resp);
		}
		else{
			req.setAttribute("message", "nostu");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
		}	
	}
	
	
	

}

