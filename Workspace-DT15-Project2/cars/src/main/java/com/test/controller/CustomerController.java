package com.test.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.service.CustomerOrderServiceInt;
import com.test.service.CustomerServiceInt;
import com.test.service.UserDetailsServiceInt;
import com.test.tarun.BillingAddress;
import com.test.tarun.Cart;
import com.test.tarun.Customer;
import com.test.tarun.ShippingAddress;
import com.test.tarun.UserDetails;
import com.test.tarun.Vw_Cust_Rating;
import com.test.tarun.Vw_Prod_Supp_Xps;

@Controller
public class CustomerController {

	
	@Autowired
	private CustomerServiceInt customerService;

	@Autowired
	private UserDetailsServiceInt userDetailsService;

	@Autowired
	private CustomerOrderServiceInt customerOrderService;

	
	@RequestMapping("/reqStudentSpring")
	public String displaySignupForm(Model m){
		UserDetails userDetails = new UserDetails();
		ShippingAddress shippingaddress = new ShippingAddress();
		Customer customer = new Customer();
		customer.setUserDetails(userDetails);
		customer.setShippingAddress(shippingaddress);
		m.addAttribute("customer",customer);
		return "signupform";
	}
	
	@RequestMapping("/reqSendSignupData")
	public String sendSignUpData(@ModelAttribute("customer")Customer customer,Model m){
		
		customer.setEnabled(true);
		customer.getUserDetails().setRole("ROLE_USER");
		customer.getUserDetails().setEnabled(true);
		
		BillingAddress billingaddress = new BillingAddress();
		billingaddress.setHouseno(customer.getShippingAddress().getHouseno());
		billingaddress.setStreet(customer.getShippingAddress().getStreet());
		billingaddress.setArea(customer.getShippingAddress().getArea());
		billingaddress.setCity(customer.getShippingAddress().getCity());
		billingaddress.setState(customer.getShippingAddress().getState());
		billingaddress.setCountry(customer.getShippingAddress().getCountry());
		billingaddress.setPincode(customer.getShippingAddress().getPincode());
		
		Cart cart = new Cart();		
		
		customer.setBillingAddress(billingaddress);
		customer.setCart(cart);
		
		String userid=customerService.addCustomer(customer);
		String message="Signup is successfull.\nNew User id : "+userid;
		m.addAttribute("signupmsg", message);
		m.addAttribute("userObject", new UserDetails());
		return "loginpage";
	}
	@RequestMapping("/reqLoginCheck")
	public String loginCheck(HttpSession hsession, @ModelAttribute("userObject") UserDetails userDetails, Model m) {

		UserDetails temp = userDetailsService.loginCheck(userDetails);
		System.out.println(temp);
		if (temp == null) {// if authentication failed
			String message = "Login failed..,\nTry again...";
			m.addAttribute("userObject", new UserDetails());
			m.addAttribute("errormsg", message);
			return "loginpage";
		} else if (temp.getRole().equals("ROLE_USER")) {
			// m.addAttribute("username",temp.getUsername());			
			// m.addAttribute("userid",temp.getUserid());
			
			List <Vw_Prod_Supp_Xps> productsuser = customerService.getProductsForUser();
			hsession.setAttribute("customerprofile", customerService.getCustomerByUserId(temp.getUserid()));
			System.out.println("\nUser id  : " +  temp.getUserid());
			System.out.println("\nCust Object :  " +  customerService.getCustomerByUserId(temp.getUserid()));
			
			m.addAttribute("productsuser", productsuser);
			return "userHomePage";
		} else {
			// m.addAttribute("username",temp.getUsername());
			hsession.setAttribute("adminprofile", customerService.getCustomerByUserId(temp.getUserid()));
			m.addAttribute("userid", temp.getUserid());
			return "adminHomePage1";
		}
		}
		@RequestMapping("/reqProductAllSuppliers")
		public String getProductsAllSuppliers(@RequestParam("pid")String productid,Model m){
			List<Vw_Prod_Supp_Xps> allSupProd = customerService.getAllSuppProd(productid);
			List<Vw_Cust_Rating> revdata = customerOrderService.getCommentsForProduct(allSupProd.get(0).getProductid());
			m.addAttribute("allSupProd", allSupProd);
            m.addAttribute("revdata", revdata);
            System.out.println(revdata);
			return "productsAllSuppliers";


	}

		@RequestMapping("/reqDisplayProductsUser")
		public String displayProductsUser(Model m){
			

			List <Vw_Prod_Supp_Xps> productsuser = customerService.getProductsForUser();
			m.addAttribute("productsuser", productsuser);
			return "userHomePage";
		}

		@RequestMapping("/reqLogout")
		public String logout(HttpSession hsession,Model m){
		hsession.invalidate();
		String logoutMessage="Logged out Successfuly.\nThanks for visiting our site...";
				 m.addAttribute("message",logoutMessage);
				return "index";
		}
}

