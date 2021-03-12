package com.class10;

public class AllElementsUsingAdvanceForLoop {

	public static void main(String[] args) {
		
		int[] numbers= {10,14,78,5,90,76};
		
		//for each, enhanced for loop, advance for loop USED ONLY WITH ARRAYS!!!!!!!!!!!!! OR COLLECTIONS!!!!!!!!!!!!!!!!!!!!!
		
		for(int num:numbers) {
			if(num%2==0) {
			System.out.print(num+" ");
			}
		}
		
		System.out.println();
		
		String[]group= {"Eugene","Sofia","Ram","Anusha","Samira","Snizhana"};
		
		for(int i=0;i<group.length;i++) {
			System.out.print(group[i]+" ");
		}
		
		System.out.println();
		System.out.println("===========================================================");
		
		for(String n:group) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("===========================================================");
		
		char[] grades= {'A','B','C','D','E','F','G','H'};
		
		for(char grade:grades) {
			System.out.print(grade+" ");
		}
		
		System.out.println();
		System.out.println("===========================================================");
		
		boolean[] boo= {true,false,false,false,true};
		
		for(boolean b:boo) {
			System.out.print(b+" ");
		}
		

	}

}
