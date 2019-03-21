package testjdbc;
import java.sql.*;
public class DB {
	public static void main(String[] args) {
		//加载驱动
		//dasfddsafsd
		new Object();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC"
	,"root","19960206");
			System.out.println("连接成功");
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("驱动加载失败");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接异常");
		}
		//连接数据库String url="jdbc:sqlserver://locallhost:1433";
	}
		

}
