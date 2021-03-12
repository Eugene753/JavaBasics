package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		
		//keywords- a special word that had reserved in java memory; class, public,static, final, for
		
		//identifiers - name that we give to classes, variables and methods
		
		/*
		 * 
		 * RULE !!!!!!
		 * DO NOT USE KEYWORDS AS INDETIFIERS
		 * Identifiers CANNOT contain space
		 * Identifiers CANNOT start with numbers
		 * Identifiers CANNOT have special characters: except _ or $
		 * 
		 */
		
		//1. int final=10; error: INVALID INDETIFIER

		//2. byte variable one=12;
		
		//3. short 1b=12;
			short b1=12;
		
			//4. long *l=20000;
			//long l*=2000;
			
			long _long=2000;
			long long_=29990;
			
			double $price=12.99;
			double price$=10.99;
			
			//NamingConvetion
				//1. we use camel casing
				//2. classes starts with Upper cases and will follow camel casing
				//3. variable start with lower case and will follow camel casing
				//4. packages we use lower cases and use name as reverse way of url
				//5. use meaningful names for your variables
			
			int Number=12; //try not to use uppercase names
			int number=12; //more preferable
			
			int numberOne=12;
			int numberTwo=12;
			
			boolean isSnow=true;
			boolean snow=true;
			
			double applePrice=12.99;
			double mangoPrice=13.89;
			
		
	}

}
