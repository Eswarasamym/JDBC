package Dynamic;

import java.sql.*;

public class fetch {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "root");
			
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from movie");
			
			/*System.out.println(rs.next());
			System.out.println(rs.next());*/
			
			while(rs.next()) {
				System.out.println("Id="+rs.getInt(1));
				System.out.println("Name="+rs.getString(2));
				System.out.println("Language="+rs.getString(3));
				System.out.println("Hero="+rs.getString(4));
				System.out.println("Heroine="+rs.getString(5));
				System.out.println("Director="+rs.getString(6));
				System.out.println("Collection="+rs.getDouble(7));
				System.out.println("-----------------------------");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			
			e.printStackTrace();
		}
	}

}
