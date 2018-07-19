package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Score;
import utils.JdbcUtils;

public class DeleteScore {

	public static boolean DeleteGrade(Score grade){
		Connection conn = null;
		PreparedStatement ptmt = null;
		int rs ;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "delete from SC  where studentId=? and courseId=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, grade.getStudentId());
			ptmt.setString(2, grade.getCourseId());
			
			
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
