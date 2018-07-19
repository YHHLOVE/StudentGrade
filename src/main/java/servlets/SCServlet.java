package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.SC;
import dao.SCDao;

public class SCServlet extends HttpServlet{

	public void doGet(HttpServletRequest request
			 ,HttpServletResponse response) throws ServletException, IOException {
		String studentId = request.getParameter("studentId");
		
		String studentName ;
		String studentSex ;
		if (request.getParameter("studentName")!=null&&request.getParameter("studentName")!=""){
        	studentName = new String(request.getParameter("studentName").getBytes("ISO-8859-1"),"utf-8");
        }else{
        	studentName = request.getParameter("studentName");
        }
        if (request.getParameter("studentSex")!=null&&request.getParameter("studentSex")!=""){
        	studentSex = new String(request.getParameter("studentSex").getBytes("ISO-8859-1"),"utf-8");
        }else{
        	studentSex = request.getParameter("studentSex");
        }

		String studentClass = request.getParameter("studentClass");
		String courseId = request.getParameter("courseId");
		String courseName = request.getParameter("courseName");
		String grade = request.getParameter("grade");
		Object[] obj = new Object[]{studentId,studentName,studentSex,studentClass,courseId,courseName,grade};
		List<SC> list = SCDao.queryObjectByConditions(obj);
		System.out.println("selectok");
		if (list.size()>=0){
		request.setAttribute("studentAll", list);
		request.getRequestDispatcher("/AdminMain.jsp").forward(request, response);
		}
		else{
			request.setAttribute("message","nolist");
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}
	}
}
