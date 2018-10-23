package swiss_knife;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql = "select * from user_info where user_name=? and user_password=?";
	String url = "jdbc:mysql://localhost:3306/test_db";
	String db_username = "root";
	String db_password = "root";
	
	public boolean check(String user_name, String user_password) {
			try{  
	          	Class.forName("com.mysql.jdbc.Driver");  
	          	Connection con=DriverManager.getConnection(url,db_username,db_password);  
	        	PreparedStatement stmt=con.prepareStatement(sql); 
	        	stmt.setString(1, user_name);
	        	stmt.setString(2, user_password);
	        	ResultSet rs = stmt.executeQuery();
	        	if(rs.next()) {
	        		return true;
	        	}
	        }catch(Exception e) { 
	        	System.out.println(e);
	        }  
			return false;
	}
			

}
