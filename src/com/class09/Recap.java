package com.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {// outer loop controls inner loop
			
			for (int j = 1; j < 5; j++) {// inner loop
				
				System.out.println("Good evening");
			}
		}
		
		System.out.println("----------------------------------------------------");
		
		/*for(int i=5;i<7;i++) {
			System.out.println("Outer loop");
			for(int j=10;j<=12;i++) {
				System.out.println("Inner loop");
			}
		}
		*/
		
		System.out.println("-------------------------Print number from 10 to 99---------------------------");

	
		System.out.println("--------------------------Car Odometer---------------------------------------------");
		
	for(int i=0;i<10;i++) {
		for(int j=0;j<=9;j++) {
			for(int k=0;k<=9;k++) {
				for(int m=0;m<=9;m++) {
					System.out.println(i+" "+j+" "+k+" "+m);
				}
				
			}
			
		}
		
	}
	
	System.out.println("--------------------------Clock---------------------------------------------");
	for(int h=0;h<24;h++) {
		for(int m=0;m<60;m++) {
			if(h<10 && m<10) {
				System.out.println("0"+h+":0"+m);
			}else if (h<10&&m>=10){
				System.out.println("0"+h+":"+m);
			}else if(h>=10 && m<10) {
				System.out.println(h+":0"+m);
			}else {
				System.out.println(h+":"+m);
			}
		}
	}
	
	System.out.println("--------------------------Nested If Clock---------------------------------------------");
	
	for(int h=0;h<24;h++) {
		for(int m=0;m<60;m++){
			if(h<10) {
				if(m<10) {
					System.out.println("0"+h+":0"+m);
				}else {
					System.out.println("0"+h+":"+m);
				}
			}else {
				if(m<10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
			}
		}
	}
	
	System.out.println("-----------------------Multiplication table----------------------------------");
	
	int sum;
	for(int i=1;i<10;i++) {
		for(int j=1;j<10;j++) {
			sum=i*j;
			System.out.println(i+"*"+j+"="+sum);
		}
	}
	
	
	
	}
	

}
