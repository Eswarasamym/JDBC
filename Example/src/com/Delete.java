package com;
import java.sql.*;


public class Delete {
	public static void main(String[] args) {
		try {
			
			//1. Load or register the connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.establish Connection
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/std_db","root","root");
			
			//3. Create statements
			Statement s=c.createStatement();
			
			// 4) executeQuery
			
			s.executeUpdate("delete from student where sid=2");
			
			
			
			System.out.println("data Deleted");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}

