package com.grouphomework;

public class HW1 {

	public static void main(String[] args) {
		
		System.out.println("---------------------- Task 1 -------------------------\n");
		int sum=0;
		int[][] num= {
				{10,20,50},
				{30,78,45},
				{100,504,607}
		};
		
		for(int[] i:num) {
			
			for(int j:i) {
				sum+=j;
			
			}
		}
		System.out.println("Sum of 2D array equal "+sum);
		
		System.out.println("\n-------------------------- Task 2 ---------------------------\n");
		
		int[][] numbers= {
				{2,4,8,10},
				{3,7,5,9},
				{31,54,88,75}
		};
		
		for(int[] i:numbers) {
			
			for(int j:i) {
				
				if(j%2==0) {
					
					System.out.print("Even number: "+j+"\n");
				}
			}
		}
		
		System.out.println("\n-------------------------- Task 3 ---------------------------\n");
		
		int sumEven=0;
		int sumOdd=0;
		
		int[][]num2= {
				{2,55,4,60},
				{9,7,8,32},
				{78,45,96,32}
		};
		
		for(int[] i : num2) {
			for(int j : i) {
				if(j%2==0) {
					sumEven+=j;
				}else {
					sumOdd+=j;
				}
			}
		}
		System.out.println("Sum of even numbers equal "+sumEven);
		System.out.println("Sum of odd numbers equal "+sumOdd);

	}

}
