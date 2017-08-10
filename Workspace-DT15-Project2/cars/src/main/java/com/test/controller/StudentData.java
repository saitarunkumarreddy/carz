package com.test.controller;

public class StudentData {

	

	private String stname;
	private String strno;
	private int[] marks;
	private String result;
	private int total;
	private float avg;
	private String grade;
	
	public StudentData(){	
		marks=new int[5];
	}
	
	/*public StudentData(String name, String rno, int[] m){
		stname = name;
		strno = rno;
		marks = m;
	}*/
	
	
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getStrno() {
		return strno;
	}
	public void setStrno(String strno) {
		this.strno = strno;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
