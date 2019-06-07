package com.lti.training.day6.collections;


import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExampleOnSorting {

	public static void main(String[] args) {
		//for sorting we can use a dedicated sort method
		//alternatively Treeset is a type of collection where
		//date is by default sorted
		//for sorting data we need to implement Comparable/Comparator interface
		
		//if we need to store int,float,double or any other primitive data types 
		//value in a collection, we need to use wrapper classes
		//primitive are not supported directly
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(50);
		list1.add(30);
		list1.add(20);
		list1.add(40);
	
		System.out.println("-------Before Sorting------");
		for(Integer no : list1)
			System.out.println(no);
		
		TreeSet<Integer> tr = new TreeSet<Integer>(list1);
		System.out.println("---------After Sorting (Using TreeSet) ----------");
		for(Integer no : tr)
			System.out.println(no);
		
		
		Collections.sort(list1);
		System.out.println("----------after sorting(Using Sort Method)-------------");
		for(Integer no : list1)
			System.out.println(no);
		
		//how to sort data in case of user defined objects in a collection
		List<Person> listOfPersons = new ArrayList<Person>();
		
		listOfPersons.add(new Person("Priya",23));
		listOfPersons.add(new Person("Rafiq",21));
		listOfPersons.add(new Person("Ramya",26));
		listOfPersons.add(new Person("Sravani",27));
		listOfPersons.add(new Person("Sai",22));
		
		//write our own Comparator
		Comparator<Person> c=new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return -p1.getName().compareTo(p2.getName());
			}
		};
		
		Comparator<Person> c2 = new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {

				return p1.getAge() - p2.getAge();
			}
		};
		
		Comparator<Person> c3 = (p1,p2) -> p2.getAge() - p1.getAge();
				
		Collections.sort(listOfPersons,c3);
		for(Person p : listOfPersons)
		System.out.println(p);
	}
}
