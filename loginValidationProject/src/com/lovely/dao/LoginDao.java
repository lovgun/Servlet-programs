package com.lovely.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {//db related logic perform here

	public ResultSet loginValidation(String un, String pass) {
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arjb3?user=root&password=root");
			PreparedStatement ps=con.prepareStatement("select * from jony where user=? and pass=?");
			ps.setString(1, un);
			ps.setString(2,pass);
			rs=ps.executeQuery();			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return rs;

		
	}

}
