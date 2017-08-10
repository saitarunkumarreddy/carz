package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDetailsDaoInt;
import com.test.tarun.UserDetails;


@Service
public class UserDetailsServiceImpl implements UserDetailsServiceInt {

	

	@Autowired
	private UserDetailsDaoInt userDetailsDao;
	
	public String addUser(UserDetails ud) {
		
		return userDetailsDao.addUser(ud);
	}

	public UserDetails loginCheck(UserDetails ud) {		
		return userDetailsDao.loginCheck(ud);
	}

}
