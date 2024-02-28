package com.lovely.url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/link")
public class Myservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter writer=res.getWriter();
	String user=req.getParameter("user");
	writer.print("hello Mr/Miss"+" "+user);
	}

}
