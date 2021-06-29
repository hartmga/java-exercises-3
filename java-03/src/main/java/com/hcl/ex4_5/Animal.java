package com.hcl.ex4_5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal {
	private String furColor;

	public Animal makeNoise() {
		System.out.println("Making animal noises");
		return new Animal("orange");
	}
}
