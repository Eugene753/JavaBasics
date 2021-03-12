package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		
		int time=11;
		
		if(time<12) {
			System.out.println("Hello");//code executes 1 time
		}
		
		System.out.println("---------------------------------------------");
		
		while(time<12) {
			System.out.println("Hello");//code runs forever
			time++;
		}
		
		System.out.println("-------------------print number from 1 to 10 ----------------------------------");
		
		int num=1;
		while(num<11) {
			 System.out.print(num+" ");
			 num++;
		 }
		System.out.println();
		System.out.println("---------------------- print number from 20 to 40 ------------------------------");
		
		num=20;
		
		while(num<=40) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		System.out.println("------------------------ print numbers from 10 to 1 ----------------------");
		
		int a=10;
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		}

	}

}
