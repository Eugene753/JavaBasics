package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		/*
		 * we need to calculate final price after the discount 
		 * 
		 * we check if there is sale
		 * if no sale --> I am not going for shopping
		 * if there is sale
		 * 			we will ask the item 
		 * 			we will ask price
		 * 			
		 * 			if price is less than 10 --> apply 5 % discount
		 * 			if price is between 10 and 100 --> apply 10 % discount
		 * 			if price is between 100 to 500 -> apply 20 % discount
		 * 			if price is more than 500 --> apply 30 %
		 * 
		 * 		"which item your purchased, what was original price, what discount applies and final price"
		 * 
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Are there any sale");
		boolean bool=sc.nextBoolean();
		String item;
		int price=0;
		double discount=0;
		double finalPrice=0;
		
		if(!bool) {
			System.out.println("I am not going for shopping");
		}else{
				System.out.println("Whats is the item ");
				item=sc.next();
				System.out.println("Whats is a price");
				price=sc.nextInt();
				if(price<=10) {
					discount=price*0.05; 
				}else if(price>10 && price<=100){
					discount=price*0.1;
				}else if(price>100 && price<=500) {
					discount=price*0.2;	
				}else if(price>500) {
					discount=price*0.3;
				}
				finalPrice=price-discount;
				System.out.println("You purchased "+item+" original price was "+price+" you discount "+discount+" final price "+finalPrice);
				
				if(finalPrice<500) {
					System.out.println("I did not do crazy shopping");
				}
			}
		
		
	}

}
