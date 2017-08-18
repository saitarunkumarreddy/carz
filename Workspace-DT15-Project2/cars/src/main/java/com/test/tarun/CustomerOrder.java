package com.test.tarun;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Entity
public class CustomerOrder {

	
	@Id
	private String orderId;	
	
	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customer;

	@OneToMany(mappedBy="customerOrder", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<CustomerOrderHistory> customerOrdersHistory;

	private String shippedAddress;
	/*	
		@OneToOne
		@JoinColumn(name="cartid")
		private Cart cart;
		*/

	private Date orderDate;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<CustomerOrderHistory> getCustomerOrdersHistory() {
		return customerOrdersHistory;
	}

	public void setCustomerOrdersHistory(List<CustomerOrderHistory> customerOrdersHistory) {
		this.customerOrdersHistory = customerOrdersHistory;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippedAddress() {
		return shippedAddress;
	}

	public void setShippedAddress(String shippedAddress) {
		this.shippedAddress = shippedAddress;
	}
	
	
}


