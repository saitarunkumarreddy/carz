package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDAOInt;
import com.test.tarun.Customer;
import com.test.tarun.Vw_Prod_Supp_Xps;

@Service
public class CustomerServiceImpl implements CustomerServiceInt{

	@Autowired
	private CustomerDAOInt customerDao;
	
	public String addCustomer(Customer cust) {		
		return customerDao.addCustomer(cust);
	}

	public Customer getCustomerByUserId(String uid) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByUserId(uid);
	}

	public List<Vw_Prod_Supp_Xps> getProductsForUser() {
		// TODO Auto-generated method stub
		return customerDao.getProductsForUser();
	}
	public List<Vw_Prod_Supp_Xps> getAllSuppProd(String pid) {		
		return customerDao.getAllSuppProd(pid);
	}
	public Customer getCustomerByID(String custid) {
		return customerDao.getCustomerByID(custid);

}
}
