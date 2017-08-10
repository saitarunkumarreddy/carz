package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.service.ProductsServiceInt;
import com.test.service.UserDetailsServiceInt;
import com.test.tarun.Product;

@Controller
public class ProductController {
	
	@Autowired
	private  ProductsServiceInt  productService;

	
	@RequestMapping("/reqProductForm")
	public String addprodform(Model m){
		m.addAttribute("productobject",new Product());
		return "addProduct";
	}
	
	@RequestMapping("/reqaddproduct")
	public String addproduct(@ModelAttribute("productdata")Product prd){
		prd.setProductavailable(true);
    productService.addProduct(prd);
	return "adminHomePage1";
		
	}
	@RequestMapping("/reqDisplayProdcutsAdmin")
	public String displayProductsAdmin(Model m){
		List<Product> allproducts = productService.getProducts();
		//System.out.println(allproducts);
		//System.out.println(allproducts.get(0).getProductid());
		m.addAttribute("allproducts", allproducts);
		return "displayProdcutsAdmin";
	}
	
	@RequestMapping("/reqDeleteProductAdmin")
	public String deleteProductAdmin(@RequestParam("pid")String pid){
		productService.deleteProduct(pid);
		return "redirect:reqDisplayProdcutsAdmin";
		
	}
	@RequestMapping("/reqEditProductPageAdmin")
	public String editProductPageAdmin(@RequestParam("pid")String pid,Model m){		
		Product prd = productService.getProductbyId(pid);
		m.addAttribute("product",prd);
		return "productEditAdmin";
	}
	
	@RequestMapping("/reqSendUpdatedProductToDB")
	public String updateProductToDB(@ModelAttribute("productObject")Product prd){
		productService.updateProduct(prd);
		return "redirect:reqDisplayProdcutsAdmin";
	}

}
