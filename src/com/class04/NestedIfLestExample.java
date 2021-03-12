package com.class04;

public class NestedIfLestExample {

	public static void main(String[] args) {

		/*
		 * to donate: you must be 18 and older, otherwise you cannot your weight must be
		 * more than 110 lbs, otherwise you cannot donate
		 * 
		 * 
		 */

		int age = 19;
		int weight = 120;

		if (age >= 18) {
			if (weight > 110) {
				System.out.println("You can donate");
			} else {
				System.out.println("Your cannot donnate");
			}
		} else {
			System.out.println("You must be older");
		}

	}

}
