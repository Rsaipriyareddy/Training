package com.lti.day5.Exception;

public class Sample {
	
		public static BigDecimal method(int a,int b) {
			float c=a/b;
			return c;
		}
	}
	public static void main(String args[]) {
		
		Sample s1=new Sample();
		s1.method(20000,543);
}
