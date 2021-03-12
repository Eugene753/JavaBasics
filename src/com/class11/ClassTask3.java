package com.class11;

public class ClassTask3 {

	public static void main(String[] args) {
		System.out.println("---------------------- Task 1 --------------------------");
		
		String[][] cars= {
				{"Mustang","Ford","Dodge"},
				{"Audi","BMW","Mersedes-Benz"},
				{"KIA","Hyundai"},
				{"Lamborgini","Ferarri"}	
		};
		
		for(int i=0;i<cars.length;i++) {
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------------- For each loop --------------------------");
		
		for(String[] c:cars) {
			for(String str:c) {
				System.out.print(str+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------------- Task 2 --------------------------");
		
		String[][] grocery= {
				{"Carrot","Onion","Pepper"},
				{"Mango","Banana","Apple"},
				{"Milk","Chesee"},
				{"Cookie","Marmalade","Chocolate"}
		};
		
		for(int i=0;i<grocery.length;i++) {
			for(int j=0;j<grocery[i].length;j++) {
				System.out.print(grocery[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------- For each loop --------------------------");
		
		for(String[] groc:grocery) {
			for(String g:groc) {
				System.out.print(g+" ");
			}
			System.out.println();
		}
	}

}
