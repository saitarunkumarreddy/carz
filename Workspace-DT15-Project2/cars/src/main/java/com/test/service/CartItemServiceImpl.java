package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CartItemDaoInt;
import com.test.tarun.CartItem;

@Service
public class CartItemServiceImpl implements CartItemServiceInt{

	@Autowired
	private CartItemDaoInt cartitemdao;
	
	public void addCartItem(CartItem cartItem) {
		cartitemdao.addCartItem(cartItem);
	}

	public CartItem getCartItem(String cartItemId) {
		// TODO Auto-generated method stub
		return cartitemdao.getCartItem(cartItemId);
	}

	public void removeCartItem(String cartItemId) {
		cartitemdao.removeCartItem(cartItemId);
	}

	public void removeAllCartItems(String customerid) {
		cartitemdao.removeAllCartItems(customerid);
	}


}
