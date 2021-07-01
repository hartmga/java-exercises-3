package com.hcl.ex3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class B extends A {
	boolean boolField;

	public B(int intVal, String sVal, boolean bVal) {
		super(intVal, sVal);
		boolField = bVal;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("boolean: %b%n", boolField);
	}

	// in class B, if boolField is true the increase is not random
	@Override
	public void growIntField(int max) {
		if (boolField) {
			super.setIntField(super.getIntField() + max);
		} else {
			super.growIntField(max);
		}
	}

}
