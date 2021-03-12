package com.class05;

import java.util.Scanner;

public class TaskCalculateScore {

	public static void main(String[] args) {
		
		int averageScore;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you quiz score");
		int quiz=sc.nextInt();
		System.out.println("Enter your mid term score");
		int midTerm=sc.nextInt();
		System.out.println("Enter your final score");
		int finalScore=sc.nextInt();
		
		char grade;
		
		averageScore=3/(quiz+midTerm+finalScore);
		
		if(averageScore>=90) {
			grade='A';
		}else if(averageScore>=70&&averageScore<90){
			grade='B';
		}else if(averageScore>=50&&averageScore<70) {
			grade='C';
		}else if(averageScore<50) {
			grade ='F';
		}else {
			grade='D';
		}
		System.out.println("Your final score " + grade);
	}

}
