package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Student;
import utils.JdbcUtils;

public class UpdateStu {
	public static boolean UpdateStuInfo(Student stu){
		Connection conn = null;
		PreparedStatement ptmt = null;
		int rs ;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "update Student set studentName=?,studentSex=?,studentClass=?,passWord=? where studentId=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(5, stu.getStudentId());
			ptmt.setString(1, stu.getStudentName());
			ptmt.setString(2, stu.getStudentSex());
			ptmt.setString(3, stu.getStudentClass());
			ptmt.setString(4, stu.getPassWord());
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

}

