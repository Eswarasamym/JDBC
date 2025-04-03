package com;

import java.util.Scanner;
import java.sql.*;

public class InsertDynamic {
	
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Student Id :");
		int id=s.nextInt();
		System.out.println("Enter Student Name:");
		String name=s.next();
		System.out.println("Enter department:");
		String dept=s.next();
		System.out.println("Enter mobile:");
		int mobile=s.nextInt();
		System.out.println("Enter city:");
		String city=s.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
			
			PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?,?,?)");
			
			ps.setInt(1, id);
			
			ps.setString(2,name);
			
			ps.setString(3, dept);
			
			ps.setInt(4, mobile);
			
			ps.setString(5, city);
			
			
			
			
			ps.executeUpdate();
			
			System.out.println("Data Saved");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
