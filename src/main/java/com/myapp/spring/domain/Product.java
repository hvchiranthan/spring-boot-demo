package com.myapp.spring.domain;

public record Product(Integer productId,String productName,Double price) 
implements Comparable<Product>{

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return o.price().compareTo(this.price());
	}
	
	

}
