package com.class08;

public class HwRecap {

	public static void main(String[] args) {
		int odd=0;
		int even=0;
		
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("Sum of even numbers "+even);
		System.out.println("Sum of odd numbers "+odd);

	}

}
