package com.lovely.servletChaining;

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
		RequestDispatcher dispatcher=req.getRequestDispatcher("Servlet2");
		//dispatcher.include(req, res);
		dispatcher.forward(req, res);
		System.out.println("servlet1 get the response from servlet2 and then return back to ui");
		res.getWriter().print("res send back from servlet1");
		
		
	}

}
