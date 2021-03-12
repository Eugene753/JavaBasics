package com.class04;

public class ClassTask1 {

	public static void main(String[] args) {
		
		System.out.println("-------------------------- Task 1 ------------------------------");
		
		boolean diploma=true;
		
		double gpa=3.9;
		
		if(diploma) {
			System.out.println("Congratulations on your degree");
			
			if(gpa>=3.5) {
				System.out.println("You are eligeble for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
				System.out.println("Maybe you should get a degree");
		}
		
		System.out.println("-------------------------------------- Task 2 ---------------------------------------------");
		
		
		double rate=3.8;
		int price=300000;
		
		
		if(rate>4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will consider buying");
			
			if(price>200000) {
				System.out.println("I will take a loan");
		
			}else {
				System.out.println("I will pay cash");
			}
		
		}
		
		 
			
		
		
		

	}

}
