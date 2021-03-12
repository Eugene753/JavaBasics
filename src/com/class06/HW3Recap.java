package com.class06;

import java.util.Scanner;

public class HW3Recap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int largest=0;

		if (num1 == num2 && num2 == num3) {
			System.out.println("Numbers are equal");
		} else {

			if (num1 > num2) {

				if (num1 > num3) {
					largest = num1;
				} else {
					largest = num3;
				}
			} else {
				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3;
				}
			}
			System.out.println("The largest number among " + num1 + ", " + num2 + ", " + num3 + ", is " + largest);
		}

	}

}
