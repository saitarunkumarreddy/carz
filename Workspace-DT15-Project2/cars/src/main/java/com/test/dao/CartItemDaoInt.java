package com.test.dao;

import com.test.tarun.CartItem;

public interface CartItemDaoInt {
	public abstract void addCartItem(CartItem cartItem);
	public abstract CartItem getCartItem(String cartItemId);
	public abstract void removeCartItem(String cartItemId);
	public abstract void removeAllCartItems(String customerid);
}
