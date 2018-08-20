package com.barts.resourcesmanager.commandlinerunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.barts.resourcesmanager.entity.Product;
import com.barts.resourcesmanager.repository.ProductRepository;

@Component
public class ProductRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(ProductRepositoryCommandLineRunner.class);
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product("Frezarka", "Urządzenie do obróbki paznokci", 5, true);
		productRepository.save(product1);
		
		log.info("New product is created: " + product1);
		
		Product product2 = new Product("Bloczek", "Akcesoria do zmatowienia paznokci", 6, true);
		productRepository.save(product2);
		
		log.info("New product is created: " + product2);
	}
}
