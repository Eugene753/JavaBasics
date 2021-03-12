package com.class08;

import java.util.Scanner;

public class ClassTask02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int startPoint, endPoint;
		System.out.println("Enter your start Point");
		startPoint=sc.nextInt();
		System.out.println("Enter you end Point");
		endPoint=sc.nextInt();
		int Even=0;
		int Odd=0;
		if(startPoint < endPoint) {
		
		for(int i=startPoint;i<=endPoint;i++) {
			if(i%2==0) {
				Even+=startPoint;
			}else {
				Odd+=endPoint;
			}
		}
		System.out.println(Even);
		System.out.println(Odd);
		}
		
	}

}
