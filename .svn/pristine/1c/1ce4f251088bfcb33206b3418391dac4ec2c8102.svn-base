package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Score;
import utils.JdbcUtils;

public class AddScore {

	public static boolean AddGrade(Score grade){
		Connection conn = null;
		PreparedStatement ptmt = null;
		PreparedStatement ptmt1 = null;
		int rs ;
		ResultSet rs1 =null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "insert into SC values(?,?,?)";
			String sql2 = "select Course.courseId from Student,Course,SC where 1=1 and SC.studentId='"
			+grade.getStudentId()+"' and Student.studentId=SC.studentId and Course.courseId=SC.courseId";
			ptmt1 = conn.prepareStatement(sql2);
			rs1 = ptmt1.executeQuery();
			
			while(rs1.next()){
				if(grade.getCourseId().equals(rs1.getString("Course.courseId"))){
					return false;
				}
			}
			
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, grade.getStudentId());
			ptmt.setString(2, grade.getCourseId());
			ptmt.setInt(3, grade.getGrade());
			
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