package Gowtham;

import java.sql.*;

public class FetchingQuery {

	public static void main(String[] args) throws Exception {
		
		records();

	}
	
	public static void records() throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/jdbc_learn";
		String username = "root";
		String password = "gowtham@2004";
		String query = "select * from employees";
		Connection c=DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		ResultSet rt = s.executeQuery(query);
		while(rt.next()) {
			System.out.println(rt.getInt(1));
			System.out.println(rt.getString(2));
			System.out.println(rt.getFloat(3));
			System.out.println(rt.getInt(4));
		}
		
		c.close();
	}
	
}
