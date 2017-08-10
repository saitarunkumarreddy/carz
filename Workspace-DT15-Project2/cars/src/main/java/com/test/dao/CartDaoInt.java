package com.test.dao;

import com.test.tarun.Cart;

public interface CartDaoInt {

	
	public abstract Cart getCart(String cartid); 
	public abstract int getCartSize(Cart cart);
	public abstract void updateCart(Cart cart);

}
