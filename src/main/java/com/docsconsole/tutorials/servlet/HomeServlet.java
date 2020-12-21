package com.docsconsole.tutorials.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.http.*;


public class HomeServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String userName = request.getParameter("user");
			

			Cookie ck = new Cookie("userName", userName); // Here Cookie Object will be created
			response.addCookie(ck);// cookie will be added in the response

			// code for submit button			
			out.print("<div style='padding-left: 50px; padding-top: 50px;'>");
			out.print("<span style='color: #00bcd4;'>Welcome:</span>" + userName);					
			out.print("<form action='sendCookiesServlet' method='POST'>");
			out.print("<input type='submit' value='Send Cookie' style='margin-top: 10px;background: #8083ef;'>");
			out.print("</form></div>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}