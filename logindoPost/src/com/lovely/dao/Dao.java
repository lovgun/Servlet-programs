package com.lovely.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	public ResultSet loginValidation(String user, String pass) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arjb3?user=root&password=root");
			PreparedStatement ps=con.prepareStatement("select * from jony where user=? and pass=?");
			ps.setString(1, user);
			ps.setString(2,pass);
			rs=ps.executeQuery();			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return rs;
	}

}
