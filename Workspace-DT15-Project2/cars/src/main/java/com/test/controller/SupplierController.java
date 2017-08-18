package com.test.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.service.SupplierServiceInt;
import com.test.tarun.Product;
import com.test.tarun.Supplier;



@Controller
public class SupplierController {
	
	@Autowired
	private  SupplierServiceInt  supplierService;

	
	@RequestMapping("/reqAddSupplierForm")
	public String addsuppform(Model m){
		m.addAttribute("supplierobject",new Supplier());
		return "addSupplier";
	}
	
	@RequestMapping("/reqaddsupplier")
	public String addsupplier(@ModelAttribute("supplierdata")Supplier supplier){
		supplier.setIssupplieravailable(true);
		supplierService.addSupplier(supplier);
		return "adminHomePage1";
	}
	@RequestMapping("/reqDisplaySuppliers")
	public String displayProductsAdmin(Model m){
		List<Supplier> allSupplier=supplierService.getSupplier();
		System.out.println(allSupplier);
		System.out.println(allSupplier.get(0).getSupplierid());
		m.addAttribute("allsupplier",allSupplier);
		return "displaySupplierAdmin";
	}
	@RequestMapping("/reqDeleteSupplierAdmin")
	public String deleteSupplierAdmin(@RequestParam("sid")String supplierid){
		supplierService.deleteSupplier(supplierid);
		return "redirect:reqDisplaySuppliers";

			}
	@RequestMapping("/reqEditSupplierAdmin")
	public String editProductPageAdmin(@RequestParam("sid")String supplierid,Model m){		
		Supplier supplier= supplierService.getSupplierbyId(supplierid);
		m.addAttribute("supplier",supplier);
		return "supplierEditAdmin";
	}
	
	@RequestMapping("/reqSendUpdatedSupplierToDB")
	public String updateProductToDB(@ModelAttribute("supplierObject")Supplier supplier){
		supplierService.updateSupplier(supplier);
		return "redirect:reqDisplaySuppliers";
	}	
}
