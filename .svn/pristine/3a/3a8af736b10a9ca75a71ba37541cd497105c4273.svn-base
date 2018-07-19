package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Score;
import utils.JdbcUtils;

public class UpdateScore {

	public static boolean UpdateGrade(Score grade){
		Connection conn = null;
		PreparedStatement ptmt = null;
		int rs ;
		try{
			conn = JdbcUtils.getConnection();
			
			String sql = "update SC set grade=? where studentId=? and courseId=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(3, grade.getCourseId());
			ptmt.setInt(1, grade.getGrade());
			ptmt.setString(2, grade.getStudentId());
			
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
