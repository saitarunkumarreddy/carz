package com.test.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.service.CustomerServiceInt;
import com.test.service.UserDetailsServiceInt;
import com.test.tarun.BillingAddress;
import com.test.tarun.Cart;
import com.test.tarun.Customer;
import com.test.tarun.ShippingAddress;
import com.test.tarun.UserDetails;
import com.test.tarun.Vw_Prod_Supp_Xps;

@Controller
public class CustomerController {

	
	@Autowired
	private CustomerServiceInt customerService;

	@Autowired
	private UserDetailsServiceInt userDetailsService;
	
	@RequestMapping("/reqStudentSpring")
	public String displaySignupForm(Model m){
		UserDetails ud = new UserDetails();
		ShippingAddress sad = new ShippingAddress();
		Customer cust = new Customer();
		cust.setUserDetails(ud);
		cust.setShippingAddress(sad);
		m.addAttribute("customer",cust);
		return "studentspringf";
	}
	
	@RequestMapping("/reqSendSignupData")
	public String sendSignUpData(@ModelAttribute("customer")Customer cust,Model m){
		
		cust.setEnabled(true);
		cust.getUserDetails().setRole("ROLE_USER");
		cust.getUserDetails().setEnabled(true);
		
		BillingAddress bad = new BillingAddress();
		bad.setHouseno(cust.getShippingAddress().getHouseno());
		bad.setStreet(cust.getShippingAddress().getStreet());
		bad.setArea(cust.getShippingAddress().getArea());
		bad.setCity(cust.getShippingAddress().getCity());
		bad.setState(cust.getShippingAddress().getState());
		bad.setCountry(cust.getShippingAddress().getCountry());
		bad.setPincode(cust.getShippingAddress().getPincode());
		
		Cart crt = new Cart();		
		
		cust.setBillingAddress(bad);
		cust.setCart(crt);
		
		String userid=customerService.addCustomer(cust);
		String message="Signup is successfull.\nNew User id : "+userid;
		m.addAttribute("signupmsg", message);
		m.addAttribute("userObject", new UserDetails());
		return "loginpage";
	}
	@RequestMapping("/reqLoginCheck")
	public String loginCheck(HttpSession hsession, @ModelAttribute("userObject") UserDetails ud, Model m) {

		UserDetails temp = userDetailsService.loginCheck(ud);
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
			return "useHomePage";
		} else {
			// m.addAttribute("username",temp.getUsername());
			hsession.setAttribute("adminprofile", customerService.getCustomerByUserId(temp.getUserid()));
			m.addAttribute("userid", temp.getUserid());
			return "adminHomePage1";
		}
		}
		@RequestMapping("/reqProductAllSuppliers")
		public String getProductsAllSuppliers(@RequestParam("pid")String pid,Model m){
			List<Vw_Prod_Supp_Xps> allSupProd = customerService.getAllSuppProd(pid);
			m.addAttribute("allSupProd", allSupProd);
			return "productsAllSuppliers";


	}

		@RequestMapping("/reqDisplayProductsUser")
		public String displayProductsUser(Model m){
			List <Vw_Prod_Supp_Xps> productsuser = customerService.getProductsForUser();
			m.addAttribute("productsuser", productsuser);
			return "useHomePage";
		}

		@RequestMapping("/reqLogout")
		public String logout(HttpSession hsession,Model m){
		hsession.invalidate();
		String logoutmessage="Logged out Successfuly.\nThanks for visiting our site...";
				 m.addAttribute("message",logoutmessage);
				return "index";
		}
}

