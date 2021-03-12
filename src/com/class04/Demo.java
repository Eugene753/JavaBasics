package com.class04;

import java.util.Scanner;
//shortcut to import for mac: cmd+shift+o
			//for windows: ctrl+shift+o
public class Demo {

	public static void main(String[] args) {
		
		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter any text");
		
		String text=scan.nextLine();//scan.nextLine(); -->capture you input from console
												//once you enter text you must HIT ENTER
		
		System.out.println("Test that I entered is - " +text);
		
		System.out.println("Please enter you name");
		
		String name=scan.next();//captures 1 word till space
		System.out.println("Nice to meet you "+name);
		
		System.out.println("Please enter your age");
		
		int age=scan.nextInt();
		
		System.out.println(" My name is "+name+" and I am "+age+" years old");

	}

}
