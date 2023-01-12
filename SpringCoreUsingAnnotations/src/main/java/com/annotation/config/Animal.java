package com.annotation.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class Animal {

	@Value("123")
	int id;

//	@Autowired
	AnimalCatagory animalCatagory;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(int id, AnimalCatagory animalCatagory) {
		super();
		this.id = id;
		this.animalCatagory = animalCatagory;
	}

	@Autowired
	public Animal(AnimalCatagory animalCatagory) {
		super();
		System.out.println("constructor injection");
		this.animalCatagory = animalCatagory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AnimalCatagory getAnimalCatagory() {
		return animalCatagory;
	}

	public void setAnimalCatagory(AnimalCatagory animalCatagory) {
		System.out.println("setter injection");
		this.animalCatagory = animalCatagory;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", animalCatagory=" + animalCatagory + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("init invoked!!!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy invoked!!!");
	}
}
