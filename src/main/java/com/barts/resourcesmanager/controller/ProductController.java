package com.barts.resourcesmanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.barts.resourcesmanager.entity.Product;
import com.barts.resourcesmanager.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/list-products")
	public String showProducts(ModelMap model) {
		model.put("products", service.receiveProducts());
		return "list-products";
	}
	
	@GetMapping("/add-product")
	public String showAddProductPage(ModelMap model) {
		model.addAttribute("product", new Product("", "", 0, true));
		
		return "add-product";
	}
	
	@PostMapping("/add-product")
	public String addProduct(@Valid Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "add-product";}
		
		service.addProduct(product);
		
		return "redirect:list-products";
	}	
}
