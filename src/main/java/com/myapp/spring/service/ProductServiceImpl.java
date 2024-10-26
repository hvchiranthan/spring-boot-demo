package com.myapp.spring.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.myapp.spring.domain.Product;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Service
@Scope("singleton")
// @Repository
// @Controller
// @RestController
// @Component
public class ProductServiceImpl implements ProductService {

	private List<Product> products;

//	public ProductServiceImpl(@Qualifier("products2") List<Product> products) {
//		this.products = products;
//	}
	@PostConstruct
	public void initialize() {
		System.out.println("Inside Init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy");
	}
	
	@Override
	public List<Product> searchByPrice(Double price) {
		// TODO Auto-generated method stub
		
		
//		return products.stream()
//				.filter(product -> product.getPrice() >= price)
//				.sorted(Comparator.comparing(Product::getPrice)
//						.thenComparing(Product::getProductName))
//				.collect(Collectors.toList());
		
		
		Predicate<Product> predicate = product -> product.price() >= price;
		return products.stream()
				.filter(predicate)
				.sorted()
				.collect(Collectors.toList());
		
	}

}






