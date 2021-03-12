package com.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------- Task 1 ----------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do you have a credit card \nYes or No");
		
		String answer=sc.nextLine();
		
		String str1="Yes";
		String str2="No";

		
		if(answer.equalsIgnoreCase(str1)) {
			System.out.println("What is the balance on the card");
				
			int balance=sc.nextInt();
			
				if(balance>1000) {
				System.out.println("You have to pay off immideatly");
			}else {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("Would you like to have one\nYes or No");
			
			String answer1=sc.nextLine();
			if(answer1.equalsIgnoreCase(str1)) {
				System.out.println("Please fill out application form");
			}else {
				System.out.println("Have a great day");
			}
			
		}
		
		System.out.println("---------------------------- Task 2 -----------------------------------");
		
		System.out.println("Please enter how many years you have worked");
		
		int years=sc.nextInt();
		
		System.out.println("Please enter your annual salary");
		
		int salary=sc.nextInt();
		
		if(years>=5) {
			System.out.println("You are eligable for the bonus");
			if(salary>=50000) {
				System.out.println("In amount of 5000");
			}else {
				System.out.println("In the amount 3000");
			}
		}else {
			System.out.println("Unfortunatly you are not eligible for the bonus");
		}

	}

}
