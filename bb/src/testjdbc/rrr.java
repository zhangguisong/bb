package testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class rrr {
public static void main(String[] args) {
	
	try{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=test",
			"sa","19960206");
	}
	catch(ClassNotFoundException e)
	{ 
		System.out.println("Çý¶¯´íÎó");e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Á¬½Ó´íÎó");e.printStackTrace();
	} 
}

	
}

