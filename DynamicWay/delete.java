package com;

import java.sql.*;
import java.util.Scanner;


public class delete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
			
			PreparedStatement ps=c.prepareStatement("delete from student where sid=?" );
			
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
			System.out.println("Data Deleted");
			
		} catch (ClassNotFoundException | SQLException  e) {
			
			e.printStackTrace();
		}
		
		
	}

}
