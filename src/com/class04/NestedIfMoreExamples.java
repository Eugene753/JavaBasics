package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		
		System.out.println("------------------------- Example 1 -------------------------------------");
		
		/*
		 * if it is Friday -->go to the movie, otherwise stay at home and study
		 * if it is friday then i wll check if day is 13 -->if yes--> watch scary movie
		 * 				if no-->watch any movie you like
		 * 
		 */
		
		boolean isFriday=true;
		int day =13;
		
		if(isFriday) {
			System.out.println("I it is a movie day!!!!!");
			
			if(day==13) {
				System.out.println(" I will watch a scary movie");
			}else {
				System.out.println("I watch any available movies");
			}
			
		}else {
			System.out.println("I will stay at home and stidy Java");
		}
				
		System.out.println("------------------------- Example 2 -------------------------------------");
		
		/*
		 * check assignment and based on the score we display a message
		 */
		
		boolean completed =true;
		int score =90;
		
		
		if(completed) {
			
			if(score>90) {
				System.out.println("Great job");
			}else if(score>80) {
				System.out.println("Good job");
			}else if(score>70) {
				System.out.println("good, but lets try to do better");
			}else {
				System.out.println(" good for trying, but study more!!!!");
			}
			
		}else {
			System.out.println(" Please make sure to complete a;; assignments on time");
		}
		
		

	}

}
