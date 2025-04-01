package Dynamic;
import java.util.*;
import java.sql.*;

public class InsertDynamic {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Id :");
		int id=s.nextInt();
		System.out.println("Enter Name:");
		String name=s.next();
		System.out.println("Enter language:");
		String language=s.next();
		System.out.println("Enter hero:");
		String hero=s.next();
		System.out.println("Enter heroine:");
		String heroine=s.next();
		System.out.println("Enter director:");
		String director=s.next();
		System.out.println("Enter Collection :");
		double collection=s.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(4,hero);
			ps.setString(2,name);
			ps.setString(3,language);
			ps.setString(5,heroine);
			ps.setString(6,director);
			ps.setDouble(7,collection);
			
			ps.executeUpdate();
			
			System.out.println("Data Saved");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
