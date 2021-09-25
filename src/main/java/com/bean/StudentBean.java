package com.bean;

public class StudentBean {

	private String Sname,Spwd;

	public StudentBean(){
	
		Spwd="";
		Sname="";
	}
	
	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		this.Sname = sname;
	}

	public String getSpwd() {
		return Spwd;
	}

	public void setSpwd(String spwd) {
		this.Spwd = spwd;
	}
	
}
