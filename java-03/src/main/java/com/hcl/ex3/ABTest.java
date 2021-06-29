package com.hcl.ex3;

public class ABTest {

	public static void main(String[] args) {
		B b1 = new B(0, "This is a String", true);
		b1.printInfo();

		b1.growIntField(100);
		System.out.println(b1.getIntField());
		b1.setBoolField(false);
		b1.growIntField(100);
		System.out.println(b1.getIntField());
		b1.growIntField(100);
		System.out.println(b1.getIntField());

		b1.printOnlyUppercaseLetters(); // inherited from A
		b1.setStringField("AaBbcCdDee"); // inherited from A
		b1.printOnlyUppercaseLetters();
	}

}
