package com.docsconsole.tutorials.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.http.*;

public class CookiesServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			Cookie cookie[] = request.getCookies();
			out.print("<div style='padding-left: 50px; padding-top: 50px;'><span style='color: #00bcd4;'>Cookie value:</span>"+cookie[0].getValue()+"</div>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}