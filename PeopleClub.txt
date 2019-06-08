package com.lti.assessment;

import java.util.Scanner;

public class PeopleClub {

	public static void main(String[] args) {
		People p=new People();
		String city;
		int pid;
		System.out.println("-------PEOPLE CLUB-------");
		while(true)
		{
		System.out.println("Press 1 for Inserting People \t Press 2 to Display People");
		System.out.println("Press 3 for Update People \t Press 4 to Delete People");
		System.out.println("Press 5 to Display count of People \t Press 6 for Exit"); 
		Scanner s=new Scanner(System.in);
		int option=s.nextInt();
		switch(option)
		{
		case 1: System.out.println("Enter People first_name, last_name, dob & city");
		String first_name=s.next();
		String last_name=s.next();
		Integer dob=s.nextInt();
		city=s.next();
		p.insertPeople(first_name, last_name, dob, city);
		break;
		case 2: p.getPeople();
		break;
		case 3: System.out.println("Enter pid & city to be Updated:");
		      pid=s.nextInt();
		      city=s.next();
		      p.updatePeople(pid,city);
		      break;
		case 4: System.out.println("Enter pid to be Deleted:");
		pid=s.nextInt();
		p.deletePeople(pid);
		break;
		case 5: p.display();
		   break;
		case 6: System.out.println("Application Terminated");
		  System.exit(0);
		default: System.out.println("Invalid Selection");
		          
		break;
		}
		}
		}


}
