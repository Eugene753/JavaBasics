package com.class06;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HW2class06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char grade;
		String result;
		System.out.println("Enter your grade");
		
		grade=sc.next().charAt(0);
		
		switch(grade) {
		
		case'A':
			result="Excellent";
			break;
		case'B':
			result="Good";
			break;
		case'C':
			result="Average";
			break;
		case'D':
			result="Bad";
			break;
		default:
			result="Not Acceptable";
			break;
		}
		System.out.println("Your grade "+grade+" is "+result);

	}

}
