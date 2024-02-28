package com.lovely.ServletChainingSendRedirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {


	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		System.out.println("servlet1 accepted the request");
		String searchKey=req.getParameter("search");
		res.sendRedirect("https://www.google.com/search?q="+searchKey);
		
		
	}

}
