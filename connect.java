package basic;

import java.sql.*;



public class connect {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String q = "create table movies(move_id int (20) primary key auto_increment, "
				+ "movie_name varchar(200), actor_name varchar(200), actress_name varchar(200),"
				+"release_year int(4))";
		
		st.executeUpdate(q);
		
		con.close();
				 
		
	}
}

