package com.lti.assignment;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Papp {

	public static void main(String[] args) {
		
		People pl = new People();
		PeoplesClub pl1 = new PeoplesClub();
		Scanner sc = new Scanner(System.in);
		pl1.setStr(sc.nextLine());
		pl1.setFname(sc.nextLine());
		pl1.setLname(sc.nextLine());
		pl1.setDob(sc.nextLine());
		pl1.setCity(sc.nextLine());
		
		
		Collection<PeoplesClub> peoplesclub=pl.fetchAll();
		
		for(PeoplesClub pl11:peoplesclub) {
			System.out.println("ID: "+pl11.getStr());
			System.out.println("First Name: "+pl11.getFname());
			System.out.println("Last Name:  "+pl11.getLname());
			System.out.println("Date of Birth: "+pl11.getDob());
			System.out.println("City of Living: "+pl11.getCity());
		
	}
	}
}
