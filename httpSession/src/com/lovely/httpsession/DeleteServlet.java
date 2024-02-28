package com.lovely.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		HttpSession session=req.getSession(false);//need an existing session
		
		if(session!=null ){
			String user=(String) session.getValue("user");
			session.invalidate();//destroy the session
			
			writer.print("<h3>Delete servlet distroy the cookie  "+user+"</h3>");
			
		}
		else{
			writer.print("<h3>plz login first</h3>");
		}
		
		
				}

}
