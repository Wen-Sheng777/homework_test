package DbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	
	public static Connection Conn() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/cc?useUnicode=true&characterEncoding=UTF-8";
		String user="root";
		String password="1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			
		} catch(ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
			}
		return conn;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Conn.Conn());
		
	}
}
