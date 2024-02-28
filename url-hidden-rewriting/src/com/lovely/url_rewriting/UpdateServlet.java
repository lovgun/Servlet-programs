package com.lovely.url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       res.setContentType("text/html");
       PrintWriter writer=res.getWriter();
	   String id=req.getParameter("id");
	   String name=req.getParameter("name");
	   String address=req.getParameter("address");
	   String age=req.getParameter("age");
	   writer.print("Hello Mr/Miss"+name+" "+id+" "+age+" "+" "+address);
	}

}
