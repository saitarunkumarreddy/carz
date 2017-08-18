package com.test.dao;

import java.util.List;

import com.test.tarun.Cart;
import com.test.tarun.CustomerOrder;
import com.test.tarun.CustomerOrderHistory;
import com.test.tarun.ProductReview;
import com.test.tarun.Vw_Cust_Rating;

public interface CustomerOrderDAOInt {

	public void addCustomerOrder(Cart cart);//throws MessagingException;
	public List<CustomerOrder> custOrders(String custid);
	public void addProductReview(ProductReview pr);
	public float getRating(String productid);
	public CustomerOrderHistory getCustomerOrderHistoryByOrderHistoryId(String ordhistid);
	public int getNoOfReviews(String productid);
	public int getNoOfItemsSold(String productid);
	public List<Vw_Cust_Rating> getCommentsForProduct(String productid);
	public void updateOrderHistory(CustomerOrderHistory coh);

}
