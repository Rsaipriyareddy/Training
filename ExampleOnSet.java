package com.lti.training.day6.collections;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class ExampleOnSet {
	
	public static void main(String[] args) {
		Set<String>  set1 = new HashSet<String>();
		set1.add("Java");
		set1.add("Oracle");
		set1.add(".NET");
		set1.add("Python");
		set1.add("Java");
		
		set1.forEach(str ->System.out.println(str));
		
		Set<Person> set = new HashSet<Person>();
		
		
		
		set.add(new Person("Priya",22));
		set.add(new Person("Rafiq",22));
		set.add(new Person("Rafiq",22));
		set.add(new Person("Ramya",22));
		set.add(new Person("Sravani",22));
		set.add(new Person("Sai",22));

		
		/*for(Person person:listOfPersons) {
			System.out.println(person);
		}*/
		
		set.forEach(saipriya ->System.out.println("List of Persons: "+saipriya));
		
		}
	}

