package com.class08;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------Task 2----------------------------");
		
		Scanner sc=new Scanner(System.in);
		String question;
		System.out.println("Would you like to apply for credit card");
		question=sc.next();
		
		do {
			System.out.println("Would you like to apply for credit card");
			question=sc.next();
		}while(!question.equalsIgnoreCase("yes"));
		System.out.println("Good");
		
		

	}

}
