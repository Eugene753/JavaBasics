package com.class04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------- Task 1 ----------------------------");
		
		Scanner question=new Scanner(System.in);
		
		System.out.println("What amount of loan would you like to apply today");
		
		int loan=question.nextInt();
		
		if(loan<=200000) {
			System.out.println("Based on your credit history you are eligble for this loan");
		}else {
			System.out.println("Unfortunately we cant provide to you this loan");
		}
		
		System.out.println("-------------------------------------- Task 2 -------------------------------------------------");
		
		System.out.println("What is your age");
		
		int age=question.nextInt();
		
		if(age>=18) {
			System.out.println("Your driver license is ready");
		}else {
			System.out.println("You cannot apply for driver license\nYou can apply for learning permit");
		}
		
		System.out.println("------------------------------ Task 3 -----------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your city");
		String city=sc.nextLine();
		
		System.out.println("Enter temperature in your city");
		double fahrenheit=sc.nextDouble();
		
		double celcius=(fahrenheit-32)*5/9;
		
		System.out.println("The temperature in the city "+city+" is "+celcius);

		
	}

}
