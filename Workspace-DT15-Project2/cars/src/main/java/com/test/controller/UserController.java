package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.UserDetailsServiceInt;
import com.test.tarun.UserDetails;

@Controller
public class UserController {

	@Autowired
	private UserDetailsServiceInt userDetailsService;

	@RequestMapping("/")
	public String displayindexPage() {
		return "index";
	}

/*	@RequestMapping("/reqStudentSpring")
	public String displaySignupForm(Model m) {
		m.addAttribute("userdata", new UserDetails());
		return "studentspringf";
	}*/
	
	@RequestMapping("/reqaboutus")
	public String displayaboutus(Model m) {
		m.addAttribute("userdata", new UserDetails());
		return "about us";
	}
	
	@RequestMapping("/reqLoginPage")
	public String loginPage(UserDetails userdetails, Model m) {
		m.addAttribute("userObject", new UserDetails());
		return "loginpage";
	}

	/*@RequestMapping("/reqLoginCheck")
	public String loginCheck(@ModelAttribute("userObject") UserDetails ud, Model m) {

		UserDetails temp = userDetailsService.loginCheck(ud);
		System.out.println(temp);
		if (temp == null) {// if authentication failed
			String message = "Login failed..,\nTry again...";
			m.addAttribute("errormsg", message);
			m.addAttribute("userObject",new UserDetails());
			return "loginpage";
		} else if (temp.getRole().equals("ROLE_USER")) {
			m.addAttribute("username",temp.getUserid());
			m.addAttribute("userid",temp.getUserid());

			return "useHomePage";
		} else {
			m.addAttribute("username",temp.getUserid());
			m.addAttribute("userid",temp.getUserid());

			return "adminHomePage1";
		}*/

	}
