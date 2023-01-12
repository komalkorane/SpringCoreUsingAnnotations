package com.annotation.config;

import org.springframework.beans.factory.annotation.Value;

public class AnimalCatagory {
	@Value("Goldy")
	String name;

	@Value("4")
	int legs;

	public AnimalCatagory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalCatagory(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "AnimalCatagory [name=" + name + ", legs=" + legs + "]";
	}

}
