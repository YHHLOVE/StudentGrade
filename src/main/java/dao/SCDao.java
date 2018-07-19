package dao;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import beans.SC;
import utils.JdbcUtils;
import utils.PropertyUtils;

public class SCDao<T>{
    Class<SC> clazz = SC.class ;
 	@SuppressWarnings("unchecked")
	public SCDao(){
//		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
//		//getActualTypeArguments()方法：获取泛型的真实类型,返回值是Type[]
//		clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}
	/**
	 * @param paramsValues
	 * @return
	 */
	public static List<SC> queryObjectByConditions(Object[] paramsValues) {
		Connection connection =null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		List<SC> list = new ArrayList<SC>();
		try{
			connection = JdbcUtils.getConnection();
			String sql =new String("select Student.studentId,studentName,studentSex,studentClass,Course.courseId,courseName,grade from Student,Course,SC"+
			" where 1=1" );
//			if(whereSql!=null){
//				 sql.append(whereSql);
//			}	
//			pstmt  = connection.prepareStatement(sql.toString());
//			if(whereSql!=null ){
//				  for(int i=1;i<=paramsValues.length;i++){
//					   pstmt.setObject(i,paramsValues[i-1]);
//				  }
//			}
			if(paramsValues[0]!=null&&paramsValues[0]!=""){
				sql+=" and Student.studentId ='"+paramsValues[0]+"'";
			}
			if(paramsValues[1]!=null&&paramsValues[1]!=""){
				sql+=" and studentName ='"+paramsValues[1]+"'";
			}
			if(paramsValues[2]!=null&&paramsValues[2]!=""){
				sql+=" and studentSex ='"+paramsValues[2]+"'";
			}
			if(paramsValues[3]!=null&&paramsValues[3]!=""){
				sql+=" and studentClass ='"+paramsValues[3]+"'";
			}
			if(paramsValues[4]!=null&&paramsValues[4]!=""){
				sql+=" and course.courseId ='"+paramsValues[4]+"'";
			}
			if(paramsValues[5]!=null&&paramsValues[5]!=""){
				sql+=" and courseName ='"+paramsValues[5]+"'";
			}
			if(paramsValues[6]!=null&&paramsValues[6]!=""){
				sql+=" and grade ="+paramsValues[6];
			}
			sql+=" and Student.studentId=SC.studentId and Course.courseId=SC.courseId";
			System.out.println(sql);
			pstmt  = connection.prepareStatement(sql);
		    rs = pstmt.executeQuery();

			while(rs.next()){
				SC sc = new SC();
				sc.setStudentId(rs.getString("Student.studentId"));
				sc.setStudentName(rs.getString("studentName"));
				sc.setStudentSex(rs.getString("studentSex"));
				sc.setStudentClass(rs.getString("studentClass"));
				sc.setCourseId(rs.getString("Course.courseId"));
				sc.setCourseName(rs.getString("courseName"));
				sc.setGrade(rs.getInt("grade"));
				System.out.println(rs.getString("Student.studentId"));
				System.out.println(sc.toString());
				list.add(sc);
			}
			
		      return list;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			 JdbcUtils.close(connection, pstmt, rs);
		}
		return null;
	}
	
	public static List<SC> queryObjectByConditions(String studentId) {
		Connection connection =null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		List<SC> list = new ArrayList<SC>();
		try{
			connection = JdbcUtils.getConnection();
			String sql =new String("select Student.studentId,studentName,studentSex,studentClass,Course.courseId,courseName,grade from Student,Course,SC"+
			" where 1=1" );
			sql+=" and Student.studentId ='"+studentId +"' and Student.studentId=SC.studentId and Course.courseId=SC.courseId";
			System.out.println(sql);
			pstmt  = connection.prepareStatement(sql);
		    rs = pstmt.executeQuery();

			while(rs.next()){
				SC sc = new SC();
				sc.setStudentId(rs.getString("Student.studentId"));
				sc.setStudentName(rs.getString("studentName"));
				sc.setStudentSex(rs.getString("studentSex"));
				sc.setStudentClass(rs.getString("studentClass"));
				sc.setCourseId(rs.getString("Course.courseId"));
				sc.setCourseName(rs.getString("courseName"));
				sc.setGrade(rs.getInt("grade"));
				System.out.println(rs.getString("Student.studentId"));
				System.out.println(sc.toString());
				list.add(sc);
			}
		      return list;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			 JdbcUtils.close(connection, pstmt, rs);
		}
		return null;
	}
                                                                                                           
}
