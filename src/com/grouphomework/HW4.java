package com.grouphomework;

public class HW4 {

	public static void main(String[] args) {
		
		System.out.println("\n-------------------------------- Task 7 -------------------------------------------\n");
		
		int num1, num2, sum;
		num1=0;
		num2=1;
		for(int i=1;i<=10;i++) {
			sum=num1+num2;
			System.out.print(" "+sum);
			
			num1=num2;
			num2=sum;
			
		}
		
		System.out.println("\n-------------------------------- Task 8 -------------------------------------------\n");
		
		
		int[]arr= {2020,10,9,5,0,7,34,88,90,56};
		int max,min;
		min=arr[0];
		max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max+" is maximum number");
		System.out.println(min+" is minimum number");
		
		System.out.println("\n-------------------------------- Task 9 -------------------------------------------\n");
		
		int[]arr2= {900,900,3,45,89,76,451,125,-900,367,157,578};
		
		int large, secondLarge;
		
		large=0;
		secondLarge=0;
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>large) {
				secondLarge=large;
				large=arr2[i];
			}else if(arr2[i]>secondLarge&&arr2[i]!=large) {
				secondLarge=arr2[i];
			}
			
		}
		System.out.println("Largest "+large);
		System.out.println("Second Largest "+secondLarge);
		

	}

}
