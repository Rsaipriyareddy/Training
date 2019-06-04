package com.lti.training.day4.string;

public class Stringham {	

	public static void main(String[] args) {
	String s1="Java";
	String s2="Java";
	String s3=new String("Java");
	String s4=new String("Java");
	
	System.out.println(s1==s2);
	System.out.println(s3==s4);
	/*System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());*/
	
	String s5="JAVA";
	String s6=s1.toUpperCase();
	System.out.println(s5==s6);
	
	String s7="Hello";
	String s8="World";
	String s9="HelloWorld";
	//String s10=s7+s8;
	String s10=(s7+s8).intern();
	System.out.println(s9==s10);
	
	String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPWQ2134567990=----------365VGGI8942RRFUH8909JKGTFT45";
	String newstr="";
	
	long ns1=System.nanoTime();
	System.out.println(ns1);
	for(int i=0;i<str.length();i++)
		for(int j=0;j<=i;j++)
		newstr+=str.charAt(j);

	long ns2=System.nanoTime();
	System.out.println(ns2);
	System.out.println("Result :: "+newstr);
	System.out.println("Approx time taken :  "+(ns2-ns1)+" nanoseconds");
	
	System.out.println("--------using StringBuffer instead---------");
	StringBuffer strbuffer=new StringBuffer();
	ns1=System.nanoTime();
	System.out.println(ns1);
	for(int i=0;i<str.length();i++)
		for(int j=0;j<=i;j++)
			strbuffer.append(str.charAt(j));
		//newstr+=str.charAt(j);

	ns2=System.nanoTime();
	System.out.println(ns2);
	System.out.println("Result :: "+strbuffer);
	System.out.println("Approx time taken :  "+(ns2-ns1)+" nanoseconds");
	
	System.out.println("--------using StringBuilder instead---------");
	StringBuilder strbuilder=new StringBuilder();
	ns1=System.nanoTime();
	System.out.println(ns1);
	for(int i=0;i<str.length();i++)
		for(int j=0;j<=i;j++)
			strbuilder.append(str.charAt(j));
		//newstr+=str.charAt(j);

	ns2=System.nanoTime();
	System.out.println(ns2);
	System.out.println("Result :: "+strbuilder);
	System.out.println("Approx time taken :  "+(ns2-ns1)+" nanoseconds");
	
	
	}
	
}
