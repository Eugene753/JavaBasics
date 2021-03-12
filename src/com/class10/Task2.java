package com.class10;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("-----------------------------------First way-----------------------");
		
		String[] names=new String[6];
		
		names[0]="Eugene";
		names[1]="Sofia";
		names[2]="Ram";
		names[3]="Anusha";
		names[4]="Samira";
		names[5]="Snizhana";
		
		System.out.println(names[0]);
		
		System.out.println("------------------------------Second way------------------------");
		
		
		String[]group= {"Eugene","Sofia","Ram","Anusha","Samira","Snizhana"};
		
		System.out.println(group[0]);
		
		System.out.println("======================All ELEMENTS FROM AN ARRAY===========================");
		
		//how to get all elements from an array
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		System.out.println("--------------------------Task 2-----------------------------");
		
		System.out.println("-----------------------------------First way-----------------------");
		
		String[]word=new String[5];
		
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day";
		word[3]="coding";
		word[4]="is";
		
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
		
		System.out.println("------------------------------Second way------------------------");
		
		String[]words= {"Java","Saturday","day","coding","is"};
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);

	}

}
