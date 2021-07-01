package com.hcl.ex4_5;

public class AnimalTest {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Animal d2 = d1.makeNoise();
		Animal a1 = new Animal("green");
		Animal a2 = a1.makeNoise();
		System.out.println(d2.getClass().getName()); // d2 is a Dog
		System.out.println(d2 instanceof Animal); // d2 is an Animal
		System.out.println(a2.getClass().getName()); // a2 is an Animal
		System.out.println(a2 instanceof Dog); // a2 is not a Dog
	}

}
