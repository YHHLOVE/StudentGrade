package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Admin;
import beans.SC;
import beans.Student;
import dao.SCDao;
import dao.StudentDao;
import dao.loginDao;
import utils.JdbcUtils;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request
			 ,HttpServletResponse response) throws ServletException, IOException {
		String Id = request.getParameter("Id");
		String passWord = request.getParameter("passWord");
		String select = request.getParameter("select");
		String inputRandom = request.getParameter("inputRandom");
		String random = request.getParameter("random");
//		User user = new User(name,passWord);
		if (inputRandom.equals(random)){
		
		if(select.equals("Student")){
			Student stu = new Student();
			stu.setStudentId(Id);
			stu.setPassWord(passWord);
			if(loginDao.isExist(stu)){
				Student student = StudentDao.studentinfo(stu.getStudentId());
				List<SC> list = SCDao.queryObjectByConditions(stu.getStudentId());
				request.setAttribute("stu", student);
				request.setAttribute("course", list);

				request.getRequestDispatcher("/StudentMain.jsp")
				.forward(request, response);
			}else{
				request.getRequestDispatcher("/login.jsp")
				.forward(request, response);
			}
		}else if(select.equals("Admin")){
			Admin adm = new Admin();
			adm.setAdminId(Id);
			adm.setPassWord(passWord);
			if(loginDao.isExist(adm)){
				request.getRequestDispatcher("/index.jsp")
				.forward(request, response);
			}else{
				request.getRequestDispatcher("/login.jsp")
				.forward(request, response);
			}
		}
		}else{
			request.getRequestDispatcher("/login.jsp")
			.forward(request, response);
		}
		
	 }
	
	public void doPost(HttpServletRequest request
			 ,HttpServletResponse response) throws
						ServletException, IOException {
		this.doGet(request, response);
	}
}
