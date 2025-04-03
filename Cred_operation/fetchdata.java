package Dynamic;

import java.sql.*;

public class fetchdata {
	


	public static void main(String[] args) {
		
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "root");
			
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select mid,name,director ,collection from movie");
			
			while(rs.next()) {
				System.out.println("Enter id:"+rs.getInt(1));
				System.out.println("Enter Name:"+rs.getString(2));
				System.out.println("Enter Director:"+rs.getString("director"));
				System.out.println("Enter Collection:"+rs.getDouble("collection"));
				System.out.println("---------------------------------");
				
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
