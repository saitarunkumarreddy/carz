package com.test.tarun;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class UserDetails {

	@Id
	private String userid;
	private String password;
	private boolean enabled;
	private String role;

	@Transient
	private MultipartFile imageFile;
	
	@OneToOne(mappedBy="userDetails")
	private Customer customer;


	public MultipartFile getImageFile() {
		return imageFile;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
}
