package com.class11;

public class ClassTask2 {

	public static void main(String[] args) {
		
		String[][]arr=new String[2][4];
		
		arr[0][0]="Mr";
		arr[0][1]="Mrs";
		arr[0][2]="Ms";
		arr[0][3]="Miss";
		
		arr[1][0]="Smith";
		arr[1][1]="Jordan";
		arr[1][2]="Jackson";
		arr[1][3]="Obama";
		
		System.out.print(arr[0][1]+" "+arr[1][0]+" "+arr[0][0]+" "+arr[1][3]+" "+arr[0][2]+" "+arr[1][2]+" "+arr[0][3]+" "+arr[1][1]);
		
		System.out.println();
		System.out.println("----------------------------Another Way-------------------------------------------");
		
		String[][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
		};
		
		System.out.print(names[0][1]+" "+names[1][0]+" "+names[0][0]+" "+names[1][3]+" "+names[0][2]+" "+names[1][2]+" "+names[0][3]+" "+names[1][1]);
		
		System.out.println();
		System.out.println("----------------------------Task 2-------------------------------------------");
		
		String[][] arr2=new String[2][4];
		
		arr2[0][0]="John";
		arr2[0][1]="Smith";
		arr2[0][2]="Neo";
		arr2[0][3]="Trinity";
		
		arr2[1][0]="A";
		arr2[1][1]="B";
		arr2[1][2]="A";
		arr2[1][3]="B";
		
		System.out.println(arr2[0][0]+"="+arr2[1][0]+" "+arr2[0][1]+"="+arr2[1][1]+" "+arr2[0][2]+"="+arr2[1][2]+" "+arr2[0][2]+"="+arr2[1][2]+" "+arr2[0][3]+"="+arr2[1][3]);
		
		System.out.println();
		System.out.println("----------------------------Another Way-------------------------------------------");
		
		String[][] arr3= {
				{"John","Smith","Neo","Trinity"},
				{"A","B"}
		};
		
		System.out.println(arr3[0][0]+"="+arr3[1][0]+" "+arr3[0][1]+"="+arr3[1][1]+" "+arr3[0][2]+"="+arr3[1][0]+" "+arr3[0][2]+"="+arr3[1][0]+" "+arr3[0][3]+"="+arr3[1][1]);
		
	}

}
