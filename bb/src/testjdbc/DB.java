package testjdbc;
import java.sql.*;
public class DB {
	public static void main(String[] args) {
		//��������
		//dasfddsafsd
		new Object();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC"
	,"root","19960206");
			System.out.println("���ӳɹ�");
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��������ʧ��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ������쳣");
		}
		//�������ݿ�String url="jdbc:sqlserver://locallhost:1433";
	}
		

}
