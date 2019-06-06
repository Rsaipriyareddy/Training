package com.lti.day5.objectclass;

public class TestPerson  {

	public static void main(String[] args) {
		
		Person p1=new Person("Priya",22);
		//System.out.println(p1);//what will be the output?
		Person p2=new Person(null,0);
		System.out.println(p1==p2);//refernce comparsion
		System.out.println(p1.equals(p2));	//Value Comparision
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		try {
			Person p3 =(Person) p1.clone();
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		p1=null;
		p2=null;
		System.gc();//don't use this in projects
	}
}
