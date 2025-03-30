package com;
import java.sql.*;


public class first_step {
	public static void main(String[] args) {
		try {
			// load or register Driver
			
			// 1)way
			java.sql.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("Done!!!");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
