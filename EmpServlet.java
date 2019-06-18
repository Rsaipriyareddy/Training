package com.lti.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("application/vnd.ms-excel");
			
			PrintWriter out=response.getWriter();
			out.println("Empno\tName\tSalary");
			out.println("101\tRaghav\t2000");
			out.println("102\tSiddhant\t2000");
			out.println("103\tRafiq\t2000");
			out.println("104\tRoshan\t5000");
		
	}

}
