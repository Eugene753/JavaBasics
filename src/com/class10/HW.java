package com.class10;

public class HW {

	public static void main(String[] args) {
		
		System.out.println("----------------------Task 1------------------------");
		
		String[] cars= {"BMW","Volvo","Ferrari","Tesla","Toyota","AUDI"};
		
		for(int i=0;i<cars.length;i++) {
		
			System.out.print(cars[i]+". ");
		
		}
		
		System.out.println();
		System.out.println("----------------------Enhanced Loop--------------------------------");
		
		for(String i:cars) {
			System.out.print(i+". ");
		}
		
		
		System.out.println();
		System.out.println("------------------------Task 2------------------------------");
		
		String[] animals= {"Lion","Tiger","Monkey","Jaguar","Dog","Cat"};
		
		for(int i=0;i<animals.length;i++) {
			
			System.out.print(animals[i]+". ");
			
		}
		
		System.out.println();
		System.out.println("----------------------Enhanced Loop--------------------------------");
		
		for(String i:animals) {
			
			System.out.print(i+". ");
			
		}
		
		System.out.println();
		System.out.println("------------------------Task 3------------------------------");
		
		int[] num= {4,5,6,34,56,78,90,43,56};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<num.length;i++) {
			sum1+=num[i];
		}
		System.out.println("Total of all elements "+sum1);
		
		System.out.println("----------------------Enhanced Loop--------------------------------");
		
		for(int i:num) {
			sum2+=i;
		}
		System.out.println("Total of all elements "+sum2);

	}

}
