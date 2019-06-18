package com.lti.training.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CaptchaServlet
 */
@WebServlet("/captcha.jpg")
public class CaptchaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		ServletOutputStream out= response.getOutputStream();
		Random rand = new Random();
		String str =" abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder captcha= new StringBuilder();
		
		for (int i=0;i<6;i++)
		{
			// int rno=(int)(Math.random()*str.length());
			//captcha+=str.charAt(rno);
			int index = rand.nextInt(str.length());
			captcha.append(str.charAt(index));
		}
		
		BufferedImage img =  new BufferedImage(150,50,BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0,0, 150, 50);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,32));
		g.drawString(captcha.toString(),30, 30);
		
		ImageIO.write(img, "jpeg", out);
		
		/*out.println(captcha.toString());*/
	}
}
