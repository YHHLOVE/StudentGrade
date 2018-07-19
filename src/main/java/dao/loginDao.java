package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Admin;
import beans.Student;
import utils.JdbcUtils;

public class loginDao{
	
	public static boolean isExist(Student stu){
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "select * from Student "
					+ "where studentId = ? and passWord = ?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, stu.getStudentId());
			ptmt.setString(2, stu.getPassWord());
			rs = ptmt.executeQuery();
			if(rs.next()){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, ptmt, rs);
		}
		return false;
	}
	public static boolean isExist(Admin adm){
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "select * from Admin "
					+ "where adminId = ? and passWord = ?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, adm.getAdminId());
			ptmt.setString(2, adm.getPassWord());
			rs = ptmt.executeQuery();
			if(rs.next()){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, ptmt, rs);
		}
		return false;
	}
	public static boolean isExistofId(Admin adm){
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "select * from Admin "
					+ "where Adminid = ?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, adm.getAdminId());
			rs = ptmt.executeQuery();
			if(rs.next()){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, ptmt, rs);
		}
		return false;
	}
	public static boolean isExistofId(Student stu){
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "select * from Student "
					+ "where studentId = ?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, stu.getStudentId());
			rs = ptmt.executeQuery();
			if(rs.next()){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.close(conn, ptmt, rs);
		}
		return false;
	}
}
