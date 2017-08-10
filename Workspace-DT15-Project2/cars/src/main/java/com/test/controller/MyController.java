package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	
     @RequestMapping("/reqp3")
	 public String displayp3(){
	 return "p3";
     }
     
     @RequestMapping("/reqcheck")
     public String displayresult(@RequestParam("name")String a,@RequestParam("product")String b,Model m)
     {
     	System.out.println(a);
     	System.out.println(b);
     	String result;
     	String laptop = null;
		if(b==laptop)
     		result="out of stock";
     	else
     		result="in stock";
     	m.addAttribute("name", a);
     	m.addAttribute("product",b);
     	return "p4";
     }


}


