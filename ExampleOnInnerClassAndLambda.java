//One of the Reasons of InnerClases-Limited the Visibility of the Classes
package com.lti.training.day4.interfaces;

interface Printer{
	void print(String document);	//Functional Interface(Interface with only One Function)
}

public class ExampleOnInnerClassAndLambda {

	private static  class DotMatrixPrinter implements Printer{
		
		public void print(String document) {
			System.out.println("Curently Printing "+document);
		}
	}
	public static void main(String[] args) {
		
		 class DeskJetPrinter implements Printer{
			
			public void print(String document) {
				System.out.println("Now Printing "+document);
			}
	}
		 Printer p=new DeskJetPrinter();
		 p.print("abc.txt");
		 
		 Printer p1=new ExampleOnInnerClassAndLambda.DotMatrixPrinter();
		 p1.print("def.pdf");
		 
		//anonymous inner Class 
		Printer sp=new Printer() {
			public void print(String document) {
				System.out.println("Now Printing :"+document);
			}
		};
		sp.print("xyz.word");
		//anonymous Functions - Lambda Expressions
		 					Printer pr=(String document)->	{
		 					System.out.println("Now Printing "+document);
		 				};
		 		pr.print("Hello.txt");
		 		
		 		Printer pt = doc-> System.out.println("Now Printing "+ doc);
		 		pt.print("hi.txt");
	}
}
