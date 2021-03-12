package com.class02;

public class HW {

	public static void main(String[] args) {
		
		byte a=10;//creating a variable and assigning value to it
		short b=100;
		int c=1000;//creating a variable and assigning value to it
		long d=1000000;
		
		float e=12.98f;
		double f=15.905;
		
		char g='!';
		boolean h=true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		c=2000;//reassign the value (change the value of the variable)
		System.out.println(c);
		//byte a=20; Java complains because now we have a duplicate variable

		//c=12.99; error: type mismatch: because variable c can only hold int type of values
		//c=true;
		
		
	}

}
