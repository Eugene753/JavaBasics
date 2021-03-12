package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		/*
		 * we need to make user to pay for a soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * if user gives more > 3 --> please give less money
		 * if user gives less than 3 --> please give more money
		 */
		Scanner sc=new Scanner(System.in);
		int money;
		
		do {
			System.out.println("Please pay for the sode");
			money=sc.nextInt();
			if(money<3) {
				System.out.println("Please give more money");
			}else if(money>3) {
				System.out.println("Please give less money");
			}
		}while(money != 3 );
		
		System.out.println("Thank you for your purchase");
		

	}

}
