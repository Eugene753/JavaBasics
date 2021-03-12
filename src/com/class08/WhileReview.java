package com.class08;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int money;
		System.out.println("Please pay for the sode");
		money=sc.nextInt();
		
		while(money != 3 );
		 {
			if(money<3) {
				System.out.println("Please give more money");
			}else if(money>3) {
				System.out.println("Please give less money");
			}
			money=sc.nextInt();
		}
		
		System.out.println("Thank you for your purchase");

	}

}
