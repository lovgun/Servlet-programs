package com.lovely.project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginController implements Servlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		String un=req.getParameter("username");
		String pass=req.getParameter("password");
		PrintWriter writer=res.getWriter();
		if(un.equals("azam")&&pass.equals("1234")){
			writer.print("<h1 align='center'> Login successful</h1>");
		}
		else{
		writer.print("<h1 align='center'>Login failed</h1>");
		writer.print("<hr><a href='index.html'>Login</a>");
		}
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
