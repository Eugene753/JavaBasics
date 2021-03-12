package com.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		Scanner input;
		double a, b, result = 0;
		char calculator;
		input = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("What kind of operation do you need? Use +,-,*,/");
		calculator = input.next().charAt(0);
		switch (calculator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			result=0;
		}
		
			System.out.println(a+" "+calculator+" "+b+" = "+result);

	}

}
