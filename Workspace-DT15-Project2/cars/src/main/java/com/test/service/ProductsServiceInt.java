package com.test.service;

import java.util.List;

import com.test.tarun.Product;

public interface ProductsServiceInt {
	
	
	
	void addProduct(Product prd);
	void deleteProduct(String pid);
	void updateProduct(Product prd);
	List<Product> getProducts();
	Product getProductbyId(String pid);

}