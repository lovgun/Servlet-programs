package com.lovely.cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/postServelet")
public class postServelet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter writer=res.getWriter();
	Cookie[]cookies=req.getCookies();
	
	if(cookies!=null && cookies.length>0){
		Cookie cookie=cookies[0];
		String user=cookie.getValue();
		writer.print("<h3>This is post servlet class Mr/Miss. "+cookie.getValue()+"</h3>");	
	}
	else{
		writer.print("<h3>plz login first</h3>");
	}
	
}

}
