package com.lti.training.day4;

public class Employere {

	private int empno;
	private String name;
	
	private static double salary;
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		Employere.salary = salary;
	}

	
}
