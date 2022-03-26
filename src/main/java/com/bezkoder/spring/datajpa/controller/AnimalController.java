package com.bezkoder.spring.datajpa.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.datajpa.model.Animal;
import com.bezkoder.spring.datajpa.repository.AnimalRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AnimalController {

	@Autowired
	AnimalRepository animalRepository;

	@GetMapping("/animals")
	public ResponseEntity<List<Animal>> getAllAnimals(@RequestParam(required = false) String animal) {
		try {
			List<Animal> animals = new ArrayList<Animal>();

			if (animal == null)
				animalRepository.findAll().forEach(animals::add);
			else
				animalRepository.findByAnimalContaining(animal).forEach(animals::add);

			if (animals.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(animals, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}



	@PostMapping("/animals")
	public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) {
		try {
			Animal _animal = animalRepository
					.save(new Animal(animal.getAnimal(), animal.getDescription()));
			return new ResponseEntity<>(_animal, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}




	@DeleteMapping("/animals")
	public ResponseEntity<HttpStatus> deleteAllAnimals() {
		try {
			animalRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}



}
