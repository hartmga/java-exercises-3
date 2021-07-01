package com.hcl.ex4_5;

public class Dog extends Animal {

	public Dog() {
		this("brown");
	}

	public Dog(String furColor) {
		super(furColor);
	}

	public Dog makeNoise() {
		System.out.println("barking");
		return new Dog(); // covariant return type
	}
}
