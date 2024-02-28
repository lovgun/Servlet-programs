package com.lovely.cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		Cookie[]cookies=req.getCookies();//get cookies array object first
		
		if(cookies!=null && cookies.length>0){
			Cookie cookie=cookies[0];
		String us=cookie.getValue();
	
		cookie.setMaxAge(0);
		res.addCookie(cookie);
		writer.print("<h3>Delete servlet distroy the cookie  "+us+"</h3>");
		
		
		}
		else{
			writer.print("<h3>plz login first</h3>");
		}
		}

}
