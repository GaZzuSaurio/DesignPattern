package com.example.strategy;

public class Dog extends Animal {
	public void digHold() {
		System.out.println("Dug a hole");
	}
	
	public Dog() {
		super();
		setSound("Bark");
		flyingType = new CantFly();
	}

}
