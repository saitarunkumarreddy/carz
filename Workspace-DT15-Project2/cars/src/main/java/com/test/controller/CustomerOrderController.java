package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.service.CustomerOrderServiceInt;
import com.test.service.CustomerServiceInt;
import com.test.service.ProductsServiceInt;
import com.test.tarun.Customer;
import com.test.tarun.CustomerOrder;
import com.test.tarun.CustomerOrderHistory;

import com.test.tarun.Product;
import com.test.tarun.ProductReview;
import com.test.tarun.TempReview;

@Controller
public class CustomerOrderController {

	@Autowired 
	private CustomerServiceInt customerService;

	@Autowired
	private CustomerOrderServiceInt customerOrderService;
	
	@Autowired
	private ProductsServiceInt productService;


	
	@RequestMapping("/order/{cartId}")
	public String displayCheckOut(@PathVariable("cartId")String cartId){
		System.out.println("\nCartid in checkout : " + cartId);
		return "redirect:/checkout?cartId="+cartId;
	}
	
	@RequestMapping("/reqDisplayOrderHistory")
	public String displayOrderHistory(@RequestParam("custid")String customerid, Model m){
		Customer customer = customerService.getCustomerByID(customerid);
		List <CustomerOrder> orders = customerOrderService.custOrders(customer.getCustomerid());
		m.addAttribute("orders", orders);
		return "displayOrders";
	}
	
	@RequestMapping("/reqReviewProductPage/{orderhistoryid}")
	public String displayProductRevPage(@PathVariable String orderhistoryid,Model m){		
		CustomerOrderHistory ordhistory = customerOrderService.getCustomerOrderHistoryByOrderHistoryId(orderhistoryid);
		Product product = productService.getProductbyId(ordhistory.getProductid());			
		TempReview temp = new TempReview();				
		m.addAttribute("product", product);
		m.addAttribute("ordhistroy",ordhistory);
		m.addAttribute("reviewobject",temp);
		return "productReviewPage";
	}
	
	@RequestMapping("/reqAddProductRating/{ordhistid}")
	public String rateProduct(@ModelAttribute("reviewobject")TempReview tempreview,@PathVariable("ordhistid")String ordhistid,HttpSession hsession){
		ProductReview prdrev = new ProductReview();
		Customer customer = (Customer)hsession.getAttribute("customerprofile");
		prdrev.setCustomerid(customer.getCustomerid());
		CustomerOrderHistory history = customerOrderService.getCustomerOrderHistoryByOrderHistoryId(ordhistid);
		prdrev.setOrderhistoryid(ordhistid);
		//prdrev.setCustomerorderhistoryid(ordhistid);
		prdrev.setRating(tempreview.getRating());
		prdrev.setComments(tempreview.getComment());
		prdrev.setProductid(history.getProductid());
		//prdrev.setComments("ok");
		customerOrderService.addProductReview(prdrev);
/*		history.setComments(tempreview.getComment());
		history.setRating(tempreview.getRating());
		history.setReviewgiven(true);
		customerOrderService.updateOrderHistory(history);*/
		float rating = customerOrderService.getRating(history.getProductid());
		System.out.println("\nRating : " + rating);
		Product prd = productService.getProductbyId(history.getProductid());
		prd.setRating(rating);
		//prd.setNoitemssold(customerOrderService.getNoOfItemsSold(history.getProductid()));
		prd.setNoreviews(customerOrderService.getNoOfReviews(history.getProductid()));		
		productService.updateProduct(prd);		
		return "redirect:/reqDisplayOrderHistory?custid="+customer.getCustomerid();
	}
	
	}


