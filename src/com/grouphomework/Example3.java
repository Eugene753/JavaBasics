package com.grouphomework;

public class Example3 {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		int sum1=0;
	    int[] sum=new int[4];
	    for(int[] i:a){
	    	sum1=0;
	      for(int j:i){
	    	  sum1+=j;
	      }
	      //System.out.print(" ");
	      //System.out.println();
	    }
	    
	    

	}

}
