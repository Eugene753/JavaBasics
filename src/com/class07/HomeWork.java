package com.class07;

public class HomeWork {

	public static void main(String[] args) {
		
		System.out.println("--------------------------Even Numbers-----------------------------");
		int sumEven=0;
		
		for(int i=0;i<=50;i+=2) {
			sumEven=sumEven+i;	
		}
		System.out.print(sumEven+" ");
	
		
		
		System.out.println();
		System.out.println("----------------------Odd Numbers------------------");
		int sumOdd=0;
		for(int j=1;j<=50;j+=2) {
			sumOdd+=j;
		}
		
		System.out.print("Sum of ODD Numbers "+sumOdd);
		
		
		
		
		
		

	}

}
