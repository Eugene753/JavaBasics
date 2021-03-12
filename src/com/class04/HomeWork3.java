package com.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------ Task 3 -----------------------------------------");
		
		Scanner question=new Scanner(System.in);
		
		System.out.println("Enter your city");
		String city=question.nextLine();
		
		System.out.println("Enter temperature in your city");
		double fahrenheit=question.nextDouble();
		
		double celcius=(fahrenheit-32)*5/9;
		
		System.out.println("The temperature is the city "+city+" is "+celcius);
		boolean b=question.nextBoolean();


	}

}
