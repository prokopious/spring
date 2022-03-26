package com.bezkoder.spring.datajpa.services;


import com.bezkoder.spring.datajpa.model.Animal;

public interface ProductService {

	public Iterable<Animal> findAll();

}