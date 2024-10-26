package com.myapp.spring.service;

import java.util.List;

import com.myapp.spring.domain.Product;

public interface ProductService {
	
	List<Product> searchByPrice(Double price);
	// List searchbyPrice(Double price);

}
