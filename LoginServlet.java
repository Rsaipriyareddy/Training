package com.lti.training.servlet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.*;
import java.util.*;

@WebServlet("/display")
public class LoginServlet extends HttpServlet {
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//InMemoryUserManager mgr = new InMemoryUserManager();
			DatabaseUserManager mgr =  new DatabaseUserManager();
		if(	mgr.isValidUser(username, password)){
			String rememberMe = request.getParameter("rememberMe"); 
			
			if(rememberMe != null && rememberMe.equals("yes")) {
				String encodedUsername=Base64.getEncoder().encodeToString(username.getBytes());
				String encodedPassword= Base64.getEncoder().encodeToString(password.getBytes());
				
				Cookie  c1 = new Cookie("tom",encodedUsername);
				Cookie c2 = new Cookie("jerry",encodedPassword);
				c1.setMaxAge(60 * 60); //1 hr
				c2.setMaxAge(60 * 60); //1 hr
				
				response.addCookie(c1);
				response.addCookie(c2);
			}
			response.sendRedirect("welcome.html");
		}
		else
		{
			response.sendRedirect("login.html");
		}
			
			/*if(username.equals("SaiPriya") && password.equals("Rafiq"))
			{
				String rememberMe = request.getParameter("rememberMe"); 
				
				if(rememberMe != null && rememberMe.equals("yes")) {
					String encodedUsername=Base64.getEncoder().encodeToString(username.getBytes());
					String encodedPassword= Base64.getEncoder().encodeToString(password.getBytes());
					
					Cookie  c1 = new Cookie("tom",encodedUsername);
					Cookie c2 = new Cookie("jerry",encodedPassword);
					c1.setMaxAge(60 * 60); //1 hr
					c2.setMaxAge(60 * 60); //1 hr
					
					response.addCookie(c1);
					response.addCookie(c2);
				}
				response.sendRedirect("welcome.html");
			}
			else
			{
				response.sendRedirect("login.html");
			}*/
			
			out.println(username);
			out.println(password);	
			
			
	}
}
