package com.class07;

public class ClassTask {

	public static void main(String[] args) {
		int num1,num2,num3;
		
		num1=1;
		num2=100;
		num3=20;
		
		System.out.println("--------------------Number from 1 to 100-----------------------------------");
		while(num1<=100) {
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
		System.out.println("---------------------------Numbers from 100 to 1--------------------------------------");
		while(num2>=1) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println();
		System.out.println("----------------------------------Numbers from 20 to 100---------------------------");
		while(num3<=100) {
			System.out.print(num3+" ");
			num3 += 2;
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		int a=20;
		
		while(a<=100) {
			if(a%2==0) {
				System.out.print(a+ " ");
			
			}
			a++;
			
		}
		
		System.out.println("End of the code");
		
		System.out.println("---------------------------------------------------------------");
		
		

	}

}
