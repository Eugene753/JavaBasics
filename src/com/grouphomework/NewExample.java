package com.grouphomework;

public class NewExample {

	public static void main(String[] args) {
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum += i * i;
		         }
		}
		System.out.println("sum = " + sum);
		
		int count = 0;
		while (count++ < 10) {
		System.out.println("Welcome to Java");
		}
		
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		y += 1;
		}
		
		int[] array= {1,4,3,6,8,2,5};
		int what=array[0];
		for(int index=0;index<array.length;index++) {
			if(array[index]>what) {
				what=array[index];
			}
		}
		System.out.println(what);
		
		

	}

}
