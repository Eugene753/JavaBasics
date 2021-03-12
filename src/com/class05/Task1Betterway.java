package com.class05;

import java.util.Scanner;

public class Task1Betterway {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your height in inches");
		
		int inch=sc.nextInt();
		String definition;
		
		if(inch<=60) {
			
			definition="short";
			
		}else if(inch>60 && inch<=72) {
			
			definition="medium";
			
		}else {
			
			definition="tall";
		}
		System.out.println(definition);

	}

}
