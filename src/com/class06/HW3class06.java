package com.class06;

import java.util.Scanner;

public class HW3class06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String operator;
		double num1,num2,result;
		System.out.println("Enter 2 numbers and your operator");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		operator=sc.next();
		
		switch(operator) {
		
		case"+":
			result=num1+num2;
			break;
		case"-":
			result=num1-num2;
			break;
		case"*":
			result=num1*num2;
			break;
		case"/":
			result=num1/num2;
			break;
		default:
			result=0.0;
		}
		System.out.println("You result "+result);
		
		

	}

}
