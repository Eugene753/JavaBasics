package com.class08;


public class Example {

	public static void main(String[] args) {
		for(int a=0;a<=23;a++) {
			for(int b=0;b<6;b++) {
				for(int c=0;c<=9;c++) {
					if(a<10) {
						System.out.println("0"+a+":"+b+""+c);
					}else
					    System.out.println(a+":"+b+""+c);
				}
			}
		}

	}

}
