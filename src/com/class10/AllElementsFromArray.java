package com.class10;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		int[] numbers= {10,14,78,5,90,76};
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
			System.out.print(numbers[i]+" ");
			}
		}
		
		
		System.out.println("=======================================");
		
		for(int i=numbers.length;i>0;i--) {
			
			System.out.print(numbers[i]+" ");
		}

	}

}
