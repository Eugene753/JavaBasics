package com.class11;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		double[] arr;
		double sum=0.0;
		System.out.println("Enter size of an array");
		size=sc.nextInt();
		arr=new double[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextDouble();
			sum+=arr[i];
		}
		System.out.println("The sum of "+size+" elements from an array = "+sum);
		
		System.out.println("------------------- Calculating sum using for each loop ---------------------------");
		sum=0;
		
		for(double num:arr) {
			sum+=num;
		}
		System.out.println("The sum of "+size+" elements from an array = "+sum);

	}

}
