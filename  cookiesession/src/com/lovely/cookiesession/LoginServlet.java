package com.lovely.cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		String us=req.getParameter("user");
		Cookie cookie=new Cookie("user",us);
		res.addCookie(cookie);
		writer.print("<h3>login success"+us+"</h3>");
		writer.print("<hr><br><a href='postServelet'>post</a> ");
		writer.print("<hr><br><a href='DeleteServlet'>logout</a> ");
		
		}

}
