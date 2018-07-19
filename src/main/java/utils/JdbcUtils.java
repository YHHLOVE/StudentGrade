package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JdbcUtils {
	private static String url = null;
	private static String userName = null;
	private static String password = null;
	static{
		url = "jdbc:mysql://localhost:3306/StudentAchievement";
		userName = "root";
		password = "123456";
	}
  /**
   * 获取链接
   * @throws Exception
   ***************************/
	public static Connection getConnection() throws Exception{
		//通过得到字节码对象的方式加载静态代码块，从而注册驱动程序
		Class.forName("org.gjt.mm.mysql.Driver");
		
		//Driver driver2 = new com.oracle.jdbc.Driver();
		//1.注册驱动程序(可以注册多个驱动程序)
		//DriverManager.registerDriver(driver);
		//DriverManager.registerDriver(driver2);
		
		//2.连接到具体的数据库
		Connection conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}
  /**
   * 释放链接
	***************************/
	public static void close(Connection conn,
			PreparedStatement ptmt){
		if(ptmt!=null){
			try {
				ptmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	
  /**
   * 释放链接
   ***************************/
	public static void close(Connection conn,
			PreparedStatement ptmt,ResultSet rs){
		if(rs!=null)
			try {
				rs.close();
			} catch (Exception e1) {
				e1.printStackTrace();
				throw new RuntimeException(e1);
			}
		if(ptmt!=null){
			try {
				ptmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}
