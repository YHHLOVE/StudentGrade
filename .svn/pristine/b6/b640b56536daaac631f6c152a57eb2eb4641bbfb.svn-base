package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Student;
import utils.JdbcUtils;

public class DeleteStu {
	public static boolean DeleteStuInfo(Student stu){
		Connection conn = null;
		PreparedStatement ptmt = null;
		int rs ;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "delete from Student  where studentId=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, stu.getStudentId());
			System.out.println("55"+stu.getStudentId());
			
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
