package com.barts.resourcesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.barts.resourcesmanager.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
