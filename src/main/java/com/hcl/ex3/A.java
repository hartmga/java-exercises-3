package com.hcl.ex3;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class A {
	private int intField;
	private String stringField;

	public void printInfo() {
		System.out.printf("int: %d%nString: %s%n", intField, stringField);
	}

	// prints the uppercase characters of stringField
	public void printOnlyUppercaseLetters() {
		Arrays.stream(stringField.split("")).filter(c -> c.charAt(0) > 64 && c.charAt(0) < 91)
				.forEach(c -> System.out.print(c));
		System.out.println();
	}

	// randomly increase intField by up to max
	public void growIntField(int max) {
		setIntField(getIntField() + (int) (Math.random() * max + 1));
	}

}
