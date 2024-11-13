package Gowtham;
import java.util.*;
import java.sql.*;

public class Connectivity { 
	static void add(String name,int id,float salary,int age) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc_learn";
		String username = "root";
		String password = "gowtham@2004";
		String qurey = "insert into employees(employee_id, name, salary, age) values(?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url,username,password);
				PreparedStatement ps = con.prepareStatement(qurey)){
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3,salary);
			ps.setInt(4, age);
			if(ps.executeUpdate()==1) {
				System.out.println("Added Successfully...");
			}
			con.close();
		}
	}

	static void del(int del) throws SQLException {
		String url = "jdbc:mysql//localhost:3306/jdbc_learn";
		String username = "root";
		String password = "gowtham@2004"

		String q = "delete from employees where employee_id = ",+del+" ;";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = com.prepareStatement(q);
		if(ps.executeUpdate()==1) {
			System.out.println("Successfully Deleted");
		}
		con.close();
	}
	
	static void display() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc_learn";
		String username = "root";
		String password = "gowtham@2004";
		String q = "select * from employees";
		try (Connection con = DriverManager.getConnection(url,username,password);
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(q)){
			int i = 1;
			while(rs.next()) {
				System.out.println(".....................Employee"+i+"....................");
				System.out.println("Employee Id:"+rs.getInt("employee_id"));
				System.out.println("Name:"+rs.getString("name"));
				System.out.println("Salary:"+rs.getFloat("salary"));
				System.out.println("Age:"+rs.getInt("age"));
				i++;
			}
		}
		catch(SQLException e) {
			System.out.println("Error Occured : "+e.getMessage());
		}
	}
	
   public  static void main(String args[]) throws SQLException {
    Scanner sc=new Scanner(System.in);
    while(true){
    	System.out.print("Add employee");
    	int choice=sc.nextInt();
    	switch(choice){
    	case 1:
    	System.out.println("Enter the name:");
    	String name=sc.nextLine();
    	sc.nextLine();
    	System.out.println("Enter the id:");
    	int id=sc.nextInt();
    	System.out.println("Enter the salary:");
    	float salary=sc.nextFloat();
    	System.out.println("Enter the age:");
    	int age=sc.nextInt();
    	add(name,id,salary,age);
    	break;
	case 2:
		System.out.print("Enter the Employee Id wanna to delete :");
		int delid = sc.nextInt();
		del(delid);
		break;
    	case 5:
    		display();
    		break;
    	default:
    		System.out.print("invalid option try again");
    		break;
    	}
    	
    }
}
}
