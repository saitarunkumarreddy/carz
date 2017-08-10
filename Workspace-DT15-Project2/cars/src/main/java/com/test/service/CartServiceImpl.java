package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CartDaoInt;
import com.test.tarun.Cart;

@Service
public class CartServiceImpl implements CartServiceInt {

	@Autowired
	private CartDaoInt cartDao;
	
	public Cart getCart(String cartid) {		
		return cartDao.getCart(cartid);
	}

	public int getCartSize(Cart cart) {		
		return cartDao.getCartSize(cart);
	}

	public void updateCart(Cart cart) {
		cartDao.updateCart(cart);		
	}

}
