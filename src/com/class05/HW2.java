package com.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		double largest = 0;

		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		} else if (num1 == num2 && num1 == num3 && num2 == num3) {
			largest = num3;
		}

		System.out.println("Largest number is " + largest);

	}

}
