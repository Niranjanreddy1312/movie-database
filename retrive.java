package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class retrive {
 public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
			// TODO Auto-generated method stub

			String url = "jdbc:mysql://localhost:3306/movies";
			String user ="root";
			String pass = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			
			String query = "select*from movies";
			
			Statement stm = con.createStatement();
			ResultSet set  = stm.executeQuery(query);
			System.out.println("id \tmovie_name\t actor_name\t actress_name \tyear");
			
			while(set.next()) {
				int id = set.getInt(1);
				String  movie_name = set.getString(2);
				String actor_name = set.getString(3);
				String actress_name = set.getString(4);
				
				int year = set.getInt(5);
				
				System.out.println(id+":"+movie_name+":"+actor_name+":    "+actress_name+":  "+":"+year);
			}
			
			con.close();
			
		}
 
 

	}
