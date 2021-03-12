package com.class08;

import java.util.Scanner;

public class ClassTask3 {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		String item;
		int price;
		int money;
		int total;
		int remainder;
		int sum=0;
		
		System.out.println("What item would you like to buy");
		item=sc.nextLine();
		System.out.println("What is the price "+item);
		price=sc.nextInt();
		System.out.println("Please pay for "+item);
		
		do {
			money=sc.nextInt();
			sum+=money;
			
			if(sum<price) {
				
				remainder=price-sum;
				
				System.out.println("Please enter more "+remainder);
			}else if(sum>price) {
				remainder=sum-price;
				System.out.println("Here is your change "+remainder);
				
				break;
				
			}else {
				System.out.println("You got the right amount");
			}
		}while(price!=sum);
		
		System.out.println("Thank you for shopping");
		

	}

}
