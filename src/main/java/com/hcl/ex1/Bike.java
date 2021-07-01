package com.hcl.ex1;

public class Bike extends Cycle {

	@Override
	public String define_me() {
		return "a cycle with an engine.";
	}

	public Bike() {
		System.out.println("Hello I am a motorcycle, I am " + define_me()); // Bike changed to Motorcycle
		String temp = super.define_me(); // the only other necessary change was to call the superclass's implementation
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}
