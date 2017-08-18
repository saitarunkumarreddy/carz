package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerOrderDAOInt;
import com.test.tarun.CustomerOrder;
import com.test.tarun.CustomerOrderHistory;
import com.test.tarun.ProductReview;
import com.test.tarun.Vw_Cust_Rating;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderServiceInt {

	
	@Autowired
	private CustomerOrderDAOInt customerOrderDao;
	
	public List<CustomerOrder> custOrders(String custid) {		
		return customerOrderDao.custOrders(custid);
	}

	public void addProductReview(ProductReview pr) {
		customerOrderDao.addProductReview(pr);		
	}

	public float getRating(String productid) {		
		return customerOrderDao.getRating(productid);
	}

	public CustomerOrderHistory getCustomerOrderHistoryByOrderHistoryId(String ordhistid) {		
		return customerOrderDao.getCustomerOrderHistoryByOrderHistoryId(ordhistid);
	}

	public int getNoOfReviews(String productid) {		
		return customerOrderDao.getNoOfReviews(productid);
	}

	public int getNoOfItemsSold(String productid) {		
		return customerOrderDao.getNoOfItemsSold(productid);
	}

	public List<Vw_Cust_Rating> getCommentsForProduct(String productid) {		
		return customerOrderDao.getCommentsForProduct(productid);
	}

	public void updateOrderHistory(CustomerOrderHistory coh) {
		// TODO Auto-generated method stub
		
	}


}
