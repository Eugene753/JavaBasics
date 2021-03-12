package com.grouphomework;

public class Example4 {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		int[] sum=new int[4];
		
	    for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a[i].length;j++) {
	    		sum[i]+=a[i][j];
	    	}
	    	System.out.println(sum[i]);
	    }
	    
	    for(int i=0;i<sum.length;i++) {
	    	System.out.println(sum[i]);
	    }
	    
	    
	    
	}

}
