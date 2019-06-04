package com.lti.training.day4;

public class EmployeeMain {
	public static void main(String[] args) {
			
		Employere emp1=new Employere();
		
		emp1.setEmpno(1001);
		emp1.setName("Rafiq");
		emp1.setSalary(10000);
		
		Employere emp2=new Employere();
		
		emp2.setEmpno(1002);
		emp2.setName("Priya");
		emp2.setSalary(20000);
		
		
		System.out.println(emp1.getEmpno());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		
		System.out.println(emp2.getEmpno());
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
	}
}
