package com.bezkoder.spring.datajpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bezkoder.spring.datajpa.model.Animal;
import com.bezkoder.spring.datajpa.repository.ProductRepository;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Animal> findAll() {
		return productRepository.findAll();
	}

}