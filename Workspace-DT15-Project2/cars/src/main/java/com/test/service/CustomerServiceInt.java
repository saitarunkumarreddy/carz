package com.test.service;

import java.util.List;

import com.test.tarun.Customer;
import com.test.tarun.Vw_Prod_Supp_Xps;

public interface CustomerServiceInt {
	public String addCustomer(Customer cust);
	public Customer getCustomerByUserId(String uid);
	public List<Vw_Prod_Supp_Xps> getProductsForUser();
	public List<Vw_Prod_Supp_Xps> getAllSuppProd(String pid);
	public Customer getCustomerByID(String custid);
	}


