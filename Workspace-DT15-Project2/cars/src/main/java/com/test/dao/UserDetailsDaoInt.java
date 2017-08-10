package com.test.dao;

import com.test.tarun.UserDetails;

public interface UserDetailsDaoInt {
	public String addUser(UserDetails ud);
	public UserDetails loginCheck(UserDetails ud);
}
