package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Student;
import utils.JdbcUtils;

public class StudentDao {
	public static boolean isExistAddStuInfo(Student stu){
		Connection conn = null;
		PreparedStatement ptmt = null;
		int rs ;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "insert into Student values(?,?,?,?,?)";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, stu.getStudentId());
			ptmt.setString(2, stu.getStudentName());
			ptmt.setString(3, stu.getStudentSex());
			ptmt.setString(4, stu.getStudentClass());
			ptmt.setString(5, stu.getPassWord());
			rs = ptmt.executeUpdate();
			if(rs>0){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, ptmt);
		}
		return false;
	}

	public static Student studentinfo(String studentId){
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
		
		try{
			conn = JdbcUtils.getConnection();
			String sql = "select * from Student where studentName ='"+studentId+"'";
			Student student = new Student();
			System.out.println(sql);
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				student.setStudentId(rs.getString("studentId"));
				student.setStudentName(rs.getString("studentName"));
				student.setStudentSex(rs.getString("studentSex"));
				student.setStudentClass(rs.getString("studentClass"));
				student.setPassWord(rs.getString("passWord"));
			}
			return student;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			 JdbcUtils.close(conn, ptmt, rs);
		}
		return null;
		
	}

	public static List<Student> studentinfolist(String studentName){
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
		List<Student> list = new ArrayList<Student>();
		
		try{
			conn = JdbcUtils.getConnection();
			String sql = "select * from Student ";
			if (studentName!=null&&studentName!=" "&&studentName!=""){
				sql+="where studentName ='"+studentName+"'";
			}
			System.out.println(sql);
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				Student student = new Student();
				student.setStudentId(rs.getString("studentId"));
				student.setStudentName(rs.getString("studentName"));
				student.setStudentSex(rs.getString("studentSex"));
				student.setStudentClass(rs.getString("studentClass"));
				student.setPassWord(rs.getString("passWord"));
				list.add(student);
			}
			return list;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			 JdbcUtils.close(conn, ptmt, rs);
		}
		return null;
		
	}


}
