package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
	List<Animal> findByAnimalContaining(String title);
}
