package com.class02;

public class ArithmeticOperatorsTask3 {

	public static void main(String[] args) {
		double num1,num2;
		
		num1=7.88;
		num2=9.97;
		
		double num3=num1+num2;
		double num4=num1-num2;
		double num5=num1*num2;
		double num6=num1/num2;
		
		System.out.println("The sum of "+num1+" and "+num2+" is equal to "+num3);
		System.out.println("The substraction of "+num1+" and "+num2+" is equal to "+num4);
		System.out.println("The multiplication of "+num1+" and "+num2+" is equal to "+num5);
		System.out.println("The divison of "+num1+" and "+num2+" is equal to "+num6);
		
		
		double s;
		
		s=3.9;
		
		double square=s*s;

		System.out.println("The square of "+s+" is "+square);
		
		int width,heigth;
		
		width=5;
		heigth=8;
		
		int perimeter=2*(width+heigth);
		int area=width*heigth;
		System.out.println("The perimeter of a rectangle width "+width+" and heigth "+heigth+" is equal to "+perimeter+" and area is "+area);
		
		
	}

}
