package com.test.tarun;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Data {

	@Id
	private String stname;
	private int rollno;
	private String result;
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
