package com;
import java.sql.*;

public class insert {
	public static void main(String[] args) {
		
		try {
			// 1.Regester or load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.extablishConnnection
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
		//3.statements
			
			Statement s=c.createStatement();
			
			// 4.execute query
			
			s.executeUpdate("insert into movie values(1,'goodbadugly','tamil','Ak','trisha','Adhik',50)");
			
			System.out.println("data saved");
	
		}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
