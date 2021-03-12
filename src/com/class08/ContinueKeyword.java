package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			
			System.out.println("Hello");
			
			if(i==3) {
				continue;
			}
			
			System.out.println("I am inside the loop");
		}
		
		System.out.println("--------------------------------------");
		
		/*
		 * You need to print all numbers form 1 to 10 except 5 & 5
		 * 
		 */
		for(int i=1;i<=10;i++) {
			
			if(i==5 || i==6) {
				continue;
			}
			
			System.out.println(i+" ");
		}
		
		System.out.println("--------------------------------------");
		
		/*
		 * You need to print numbers from 1 to 30. except those that are divisible by 4
		 * 
		 */
		
		for(int i = 1;i<=40;i++) {
			
			if(i%4==0) {
				continue;
			}
			
			System.out.print(i+" ");
			
		}

	}

}
