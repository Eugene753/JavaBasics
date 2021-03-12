package com.class06;

import java.util.Scanner;

public class HW1class06 {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Which country you are from");
		String country, language;
		country=sc.nextLine();
		
		switch(country.toLowerCase()) {
		
		case"ukraine":
			language="Ukranian";
			break;
		case"usa":
			language="English";
			break;
		case"russia":
			language="Russian";
			break;
		case"italy":
			language="Italian";
			break;
		case"germany":
			language="German";
			break;
		case"united kingdom":
			language="English";
			break;
		case"france":
			language="French";
			break;
		case"china":
			language="Mandarin";
			break;
		default:
			language="Unknown";
			break;
		}
		System.out.println("Your speak "+language);
		
	}
}
