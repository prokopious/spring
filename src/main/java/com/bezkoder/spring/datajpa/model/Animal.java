package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "animal")
	private String animal;

	@Column(name = "description")
	private String description;


	public Animal() {

	}

	public Animal(String animal, String description) {
		this.animal = animal;
		this.description = description;
	
	}

	public long getId() {
		return id;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "";
	}

}