package com.class13;

public class Dog {
	
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
		
		for(int i=0;i<5;i++) {
			System.out.println("Omnomnom");
		}
	}
	
	public void look() {
		System.out.println("Hi I am a dog my color is "+color);
	}
	
public static void main(String[] args) {
		
		Dog Dog1Object=new Dog();
		
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

