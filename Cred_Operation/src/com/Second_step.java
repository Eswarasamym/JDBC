package com;
import java.sql.*;

public class Second_step {
	public static void main(String[] args) {
		
		try {
			//1.load or register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Connection established
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			System.out.println("Connection established");
		}catch(ClassNotFoundException | SQLException  e) {
			e.printStackTrace();
		}
	}

}
