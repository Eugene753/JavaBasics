package com.class05;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		
		/*we have to calculate commision based on sales
		 * 
		 * ask user to enter sale that he made
		 * based on sales we will calculate commission:
		 * if sale is less than 100 -->commission is 0
		 * is sale is between 10 to 100 --> commission is 10%
		 * is sale is between 101 to 500 --> commission is 20%
		 * if sale is between 501 to 1000 --> commission is 30%
		 * if more than 1000 --> commission 50%
		 */
		
		Scanner scan;
		double saleAmount, commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your daily sale amount");
		saleAmount=scan.nextDouble();
		
		if(saleAmount<10) {
			commission=0;
		}else if(saleAmount>=10&&saleAmount<=100) {
			commission=saleAmount * 0.1;
		}else if(saleAmount>100&&saleAmount<=500) {
			commission=saleAmount * 0.2;
		}else if(saleAmount>500 &&saleAmount<=1000) {
			commission=saleAmount * 0.3;
		}else {
			commission=saleAmount * 0.5;
		}
		
		System.out.println("Your daily commission is "+commission);
		//if commission is more than 500 --> you are amazing seller
		if(commission>500) {
			System.out.println("You are an amazing seller");
		}

	}

}
