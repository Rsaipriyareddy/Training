package com.lti.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculate
 */
@WebServlet("/Calculate")
public class Calculate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		 
	    String a = request.getParameter(parseInt(a));
		String  b = request.getParameter(parseInt(b));
		
		if(addition.equals("yes"))
		{
			int c=a-b;
		}
		else
			int c = a+b;
	}

	private String parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
