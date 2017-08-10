package com.test.service;

import com.test.tarun.Cart;

public interface CartServiceInt {

	public abstract  Cart getCart(String cartid); 
	public abstract int getCartSize(Cart cart);
	public abstract void updateCart(Cart cart);

}
