package com.class07;

import java.util.Scanner;

public class LotteryWithWhille {

	public static void main(String[] args) {
		Scanner input;
		input=new Scanner(System.in);
		
		int num;
		int lotteryNumber=17;
		System.out.println("Please enter any number from 1 to 100");
		num=input.nextInt();
		
		
		while(num !=lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100");
			num=input.nextInt();
		}
		
		System.out.println("Congratulations you entered "+num+" which is a lucky number");
	}

}
