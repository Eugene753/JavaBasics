package com.class05;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your height in inches");
		
		int inch=sc.nextInt();
		
		if(inch<=60) {
			System.out.println("You are short");
		}else if(inch>60 && inch<=72) {
			System.out.println("You are medium height");
		}else {
			System.out.println("You are tall");
		}
		
		System.out.println("Enter day number");
		int day=sc.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("Weekday");
		}else if(day==6 || day==7) {
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
