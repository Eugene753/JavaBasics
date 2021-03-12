package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		int num=1;
		
			while(num<=5) {// while loop is used in programming compare to do while !!!!!
			System.out.println("Hello");
			num++;
		}
		
		System.out.println("-------------------------- Do While ----------------------------------");
		
		int num1=1;
		
		do {
			System.out.println("Hello");
			num1++;
		}while(num1<=5);
		
		/*
		  While = first check then execute
		  Do=first execute the check
		  
		  Even when condition is false Do will execute your code AT LEAST ONCE
		  
		 */

	}

}
