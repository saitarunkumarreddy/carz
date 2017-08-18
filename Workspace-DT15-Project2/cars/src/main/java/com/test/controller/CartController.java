package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.service.CartItemServiceInt;
import com.test.service.CartServiceInt;
import com.test.service.CustomerServiceInt;
import com.test.service.XpsServiceInt;
import com.test.tarun.Cart;
import com.test.tarun.CartItem;
import com.test.tarun.Customer;
import com.test.tarun.Vw_Prod_Supp_Xps;
import com.test.tarun.XMAP_Product_Supplier;

@Controller
public class CartController {

	@Autowired
	private XpsServiceInt xpsService;
	
	@Autowired
	private CartItemServiceInt cartItemService;
	
	@Autowired
	private CustomerServiceInt customerService;
	
	@Autowired
	private CartServiceInt cartService;
	
	@RequestMapping("/reqAddItemToCart/{productsupplierid}")
	public String addItemToCart(@PathVariable("productsupplierid")String productsupplierid, @RequestParam("quantity")int quantity,HttpSession hsession,Model m){
		System.out.println("psid : "+productsupplierid + "  qty : " + quantity);
		Customer cust = (Customer)hsession.getAttribute("customerprofile");
		Cart cart = cust.getCart();
		XMAP_Product_Supplier xps = xpsService.getXpsById(productsupplierid);
		CartItem cartitem = new CartItem();
		cartitem.setCart(cart);
		cartitem.setXmap_product_supplier(xps);
		cartitem.setQuantity(quantity);
		cartitem.setItemwisetotal(xps.getProductsupplierprice()*quantity);
		
		cartItemService.addCartItem(cartitem);
		
		Customer customer1=customerService.getCustomerByUserId(cust.getUserDetails().getUserid());
		Cart cart1=customer1.getCart();		
		
		List<CartItem> cartitems = cart1.getCartItems();
		int sum=0;
		for(CartItem critem :cartitems){
			sum+= critem.getItemwisetotal();
		}
		cart1.setTotalbill(sum);
		cartService.updateCart(cart1);	
		hsession.setAttribute("customerprofile", customerService.getCustomerByID(customer1.getCustomerid()));
		List <Vw_Prod_Supp_Xps> productsuser = customerService.getProductsForUser();	
		m.addAttribute("productsuser", productsuser);
		m.addAttribute("cartmessage","Item added to cart successfully..");
		return "userHomePage";
	}

	@RequestMapping("/reqDisplayCart")
	public String displayCart(HttpSession hsession,Model m){
		
		Customer customer = (Customer)hsession.getAttribute("customerprofile");
		Customer customer1 = customerService.getCustomerByID(customer.getCustomerid());
		Cart cart = customer1.getCart();	
		hsession.setAttribute("customerprofile",customer1);		
		
		List<CartItem> cartitems = cart.getCartItems();	
		int sum=0;
		for(CartItem critem :cartitems){
			sum+= critem.getItemwisetotal();
		}
		
		cart.setTotalbill(sum);
		cartService.updateCart(cart);			

		m.addAttribute("cartitems", cartitems);
		return "displayCartItems";
	}
	
	@RequestMapping("/reqDeleteCartItem/{cartitemid}")
	public String deleteCartItem(@PathVariable("cartitemid")String cartitemid,HttpSession hsession ){
		cartItemService.removeCartItem(cartitemid);		
		return "redirect:/reqDisplayCart";
	}
	

	@RequestMapping("/reqClearCart/{customerid}")
	public String deleteAllCartItems(@PathVariable("customerid")String customerid,HttpSession hsession){
		cartItemService.removeAllCartItems(customerid);		
		Customer customer = (Customer)hsession.getAttribute("customerprofile");
		hsession.setAttribute("customerprofile", customerService.getCustomerByID(customer.getCustomerid()));
		return "redirect:/reqDisplayProductsUser";
	}

}
