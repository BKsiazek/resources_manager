package com.barts.resourcesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barts.resourcesmanager.entity.Product;
import com.barts.resourcesmanager.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> receiveProducts(){
		return repository.findAll();
	}

	public void addProduct(Product product) {
		repository.save(product);
	}
}