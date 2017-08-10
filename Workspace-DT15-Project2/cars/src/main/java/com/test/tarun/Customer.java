package com.test.tarun;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.test.tarun.BillingAddress;
import com.test.tarun.Cart;
import com.test.tarun.CustomerOrder;
import com.test.tarun.ShippingAddress;
import com.test.tarun.UserDetails;

@Entity
public class Customer {

	@Id
	private String customerid;
	private String customername;
	private String  mailid;
	private String mobileno;
	private boolean enabled;

	@Transient
	private MultipartFile customerImage;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	private UserDetails userDetails;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shippingaddressid")
	private ShippingAddress shippingAddress;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="billingaddressid")
	private BillingAddress billingAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cartd")
	private Cart cart;

	@OneToMany(mappedBy="customer", cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	private List<CustomerOrder> customerOrders;

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public MultipartFile getCustomerImage() {
		return customerImage;
	}

	public void setCustomerImage(MultipartFile customerImage) {
		this.customerImage = customerImage;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}

	public void setCustomerOrders(List<CustomerOrder> customerOrders) {
		this.customerOrders = customerOrders;
	}
	
}
