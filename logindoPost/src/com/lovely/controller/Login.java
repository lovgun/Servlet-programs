package com.lovely.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lovely.dao.Dao;

public class Login extends HttpServlet {
@Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
res.setContentType("text/html");
String user=req.getParameter("username");
String pass=req.getParameter("password");
PrintWriter writer=res.getWriter();
Dao dao=new Dao();
ResultSet rs=dao.loginValidation(user,pass);
try {
	
	if(rs!=null&&rs.next()){
		writer.print("<h1 align='center'> Login successful</h1>");
		writer.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6));
	}
	else{
	writer.print("<h1 align='center'>Login failed</h1>");
	writer.print("<hr><a href='index.html'>Login</a>");
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
}
