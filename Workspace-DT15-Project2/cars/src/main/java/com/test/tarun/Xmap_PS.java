package com.test.tarun;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Xmap_PS {
@Id
	private String psid;
	private String productid;
	private String supplierid;
	private int productsssupplierprice;
	private int productssupplierstock;
	private boolean isproductsupplieravailable;

	
	@Transient
	private MultipartFile Xmap_PSImage;
	
	
	public MultipartFile getXmap_PSImage() {
		return Xmap_PSImage;
	}
	public void setXmap_PSImage(MultipartFile xmap_PSImage) {
		Xmap_PSImage = xmap_PSImage;
	}
	
	public String getPsid() {
		return psid;
	}
	public void setPsid(String psid) {
		this.psid = psid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	
}
	public int getProductsssupplierprice() {
		return productsssupplierprice;
	}
	public void setProductsssupplierprice(int productsssupplierprice) {
		this.productsssupplierprice = productsssupplierprice;
	}
	public int getProductssupplierstock() {
		return productssupplierstock;
	}
	public void setProductssupplierstock(int productssupplierstock) {
		this.productssupplierstock = productssupplierstock;
	}
	public boolean isIsproductsupplieravailable() {
		return isproductsupplieravailable;
	}
	public void setIsproductsupplieravailable(boolean isproductsupplieravailable) {
		this.isproductsupplieravailable = isproductsupplieravailable;
	}
}