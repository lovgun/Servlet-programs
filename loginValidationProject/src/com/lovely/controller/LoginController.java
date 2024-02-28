package com.lovely.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.lovely.dao.LoginDao;

public class LoginController extends GenericServlet {//navigation logic only request and response

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		String un=req.getParameter("username");
		String pass=req.getParameter("password");
		PrintWriter writer=res.getWriter();
		LoginDao dao=new LoginDao();
		ResultSet rs=dao.loginValidation(un,pass);
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
