package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ProductsDaoInt;
import com.test.dao.UserDetailsDaoInt;
import com.test.tarun.Product;

@Service
public class ProductsServiceImpl implements ProductsServiceInt {

	
	@Autowired
	private ProductsDaoInt ProductDao;
	
	
	public void addProduct(Product prd) {
		ProductDao.addProduct(prd);

	}

	public void deleteProduct(String pid) {
		
		ProductDao.deleteProduct(pid);

	}

	public void updateProduct(Product prd) {
		// TODO Auto-generated method stub
ProductDao.updateProduct(prd);
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return ProductDao.getProducts();
	}

	public Product getProductbyId(String pid) {
		// TODO Auto-generated method stub
		return ProductDao.getProductbyId(pid);
	}

}
