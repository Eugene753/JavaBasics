package com.class13;

public class ObjectDog {
	
	public String breed;
	public String size;
	public String color;
	public int age;
	
	public void bark() {
		System.out.println("ruff ruff and wow wow wow");
	}
	
	public void sleep() {
		System.out.println("ZZZZZzzzzzzz........");
	}
	public void eat() {
		System.out.println("eating......");
	}
	public void look() {
		System.out.println("My color is "+color);
	}
			

	public static void main(String[] args) {
		
		ObjectDog Dog1Object=new ObjectDog();
		
		Dog1Object.breed="Bulldog";
		Dog1Object.size="large";
		Dog1Object.color="ligth gray";
		Dog1Object.age=5;
		Dog1Object.bark();
		Dog1Object.sleep();
		Dog1Object.eat();
		Dog1Object.look();
		
		
		Dog Dog2Object=new Dog();
		
		Dog2Object.breed="Beagle";
		Dog2Object.size="large";
		Dog2Object.color="orage";
		Dog2Object.age=6;
		Dog2Object.eat();
		Dog2Object.look();
		
		Dog Dog3Object=new Dog();
		
		Dog3Object.breed="German Shepard";
		Dog3Object.size="large";
		Dog3Object.color="white & orage";
		Dog3Object.age=6;
		Dog3Object.eat();
		Dog3Object.look();
		
		

	}

}
