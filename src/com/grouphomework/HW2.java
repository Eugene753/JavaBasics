package com.grouphomework;

public class HW2 {

	public static void main(String[] args) {
		
		System.out.println("\n---------------------------- Task 4 -----------------------\n");
		
		String [][] countries= {
				{"United States","Canada","Greenland","Mexico"},
				{"Brazil","Argentina","Columbia","Peru","Chile"},
				{"Germany","France","Italy","Sweden","Greece"},
				{"Japan","Indonesia","China","India","Thailand"},
				{"Kenya","South Africa","Ghana","Morocco"}
				
		};
		
		int j=0; int sum=0;
		for(int i=0;i<countries.length;i++) {
			for( j=0;j<countries[i].length;j++) {
				System.out.print(countries[i][j]+"   ");
			}
			System.out.println();
			System.out.println("---------------------------------------");
			sum+=j;
		}
		
		System.out.println("There are "+sum+" countries");
		
		System.out.println("\n---------------------------- For each loop -----------------------\n");
		
		for(String[] i : countries) {
			for(String k : i) {
				System.out.print(k+"   ");
			}
			System.out.println();
			System.out.println("---------------------------------------");
		}
		
		System.out.println("\n---------------------------- Sum of all countries -----------------------\n");
		
		int num=0;
		
		for(int i=0;i<countries.length;i++) {
			num+=countries[i].length;
		}
		
		System.out.println("There are "+num+" countries");
		

	}

}
