package com.lti.training.day6.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOnList {

	public static void main(String[] args) {
		//angular brace notation is called as Generic in Java
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		list2.add("AI");
		list2.add("ML");
		/**list2.add(".NET");
		list2.add("Python");
		list2.add("Java");
		list2.add("C");
		list2.add("C++");
		list2.add(7, "SAP");
		list2.add(8, "Testing");*/
		
		
		//Adding the Elements at the end of the List
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".NET");
		list1.add("Python");
		list1.add("Java");
		list1.add("C");
		list1.add("C++");
		list1.add(7, "SAP");
		list1.add(8, "Testing");
		
		//System.out.println(list1.hashCode());
		//System.out.println(list2.hashCode());
		//System.out.println(list1.size());
		//System.out.println(list2.size());
		
		List<String> l2=list1.subList(1,5);
				for(String str: l2) {
					System.out.println(str);
				}
		
		Object[] l1=list2.toArray();
		for(Object str: l1) {
			System.out.println(str);
		}
	
		
		//System.out.println(list1.addAll(list2));
		//System.out.println(list1.iterator());
		//System.out.println(list1.contains("SAP"));
		//System.out.println(list2.containsAll(list1));
		//list1.clear();
		//System.out.println(list1.get(0));
		
		//Not used when we are using the "Set"-as the elements are Shuffled in Set
		/*for(int i=0; i<list1.size();i++) {
			String str = list1.get(i);
			System.out.println(str);
		}*/
		
		System.out.println("---------using foreach loop---------");
		for(String str: list1) {
			System.out.println(str);
		}
		
		
		/*System.out.println("--------using lambda style foreach----------");
		list1.forEach(str -> System.out.println(str));
		
		System.out.println("------traditional Iterator approach-----");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}*/
		
		//-------storing object of some user defined class----//
		List<Person> listOfPersons = new ArrayList<Person>();
		
		
		
		listOfPersons.add(new Person("Priya",22));
		listOfPersons.add(new Person("Rafiq",22));

		
		/*for(Person person:listOfPersons) {
			System.out.println(person);
		}*/
		
		listOfPersons.forEach(person ->System.out.println("List of Persons: "+person.getName()));
		
	}
	
	
}
