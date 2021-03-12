package com.grouphomework;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		System.out.println("-------------------------------- Task 5 -------------------------------------------");
		
		int x,y;
		
		x=15;
		y=25;
		
		System.out.println("Before swap x="+x+" and y="+y);
		System.out.println("\n-----------------------------------------------\n");
		
		x+=y;
		y=x-y;
		x-=y;
		
		System.out.println("After swap x="+x+" and y="+y);
		
		
		System.out.println("\n-------------------------------- Task 6 -------------------------------------------\n");
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		boolean bool = true;
		
		if(num>1) {
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				bool=false;
				break;
				}
			
			}
		}else {
			bool=false;
		}
		
		if(bool) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		
	

	}

}
