package com.bezkoder.spring.datajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bezkoder.spring.datajpa.model.Animal;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Animal, Integer> {
}