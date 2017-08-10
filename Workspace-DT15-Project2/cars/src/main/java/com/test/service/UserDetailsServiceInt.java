package com.test.service;

import com.test.tarun.UserDetails;

public interface UserDetailsServiceInt {

	
	public String addUser(UserDetails ud);
	public UserDetails loginCheck(UserDetails ud);
	
}
