package com;
import java.sql.*;
public class update {
	public static void main(String[] args) {
		try {
			
			//1. Load or register the connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.establish Connection
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			//3. Create statements
			Statement s=c.createStatement();
			
			// 4) executeQuery
			
			s.executeUpdate("update movie set language='english',collectiom=200 where mid=1");
			
			
			
			System.out.println("data update");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
