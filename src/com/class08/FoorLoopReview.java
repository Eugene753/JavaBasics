package com.class08;

public class FoorLoopReview {

	public static void main(String[] args) {
		/*
		 * I want to create a multiplication table
		 * 
		 * 1*1=1
		 * 1*2=2
		 * 
		 * 1*10=10
		 */
		
		int num=5;
		int mult;
		
		for(int i=1;i<=10;i++) {
			mult=num*i;
			System.out.println(num+" * "+i+" = "+mult);
		}

	}

}
