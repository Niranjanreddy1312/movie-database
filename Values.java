package basic;
import java.sql.*;
import java.io.*;

public class Values  {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		
		String s = "INSERT INTO movies(movie_name,actor_name,actress_name,release_year) values (?,?,?,?)";
		
		PreparedStatement stm = con.prepareStatement(s);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter movie name :");
		String movie = bf.readLine();
		
		System.out.println("Enter actor name :");
		String actor = bf.readLine();
		
		System.out.println("Enter actress name :");
		String actress = bf.readLine();
		
		
		System.out.println("Enter release year :");
		int year = Integer.parseInt(bf.readLine());
		
		stm.setString(1, movie);
		stm.setString(2, actor);
		stm.setString(3, actress);
		stm.setInt(4, year);
		
		stm.executeUpdate();
		
		con.close();
		
	}

}
