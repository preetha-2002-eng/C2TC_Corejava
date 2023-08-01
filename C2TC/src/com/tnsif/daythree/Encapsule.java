package com.tnsif.daythree;

public class Encapsule {
	String name;
	int id;
	String mailid;
	long mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Encapsule [name=" + name + ", id=" + id + ", mailid=" + mailid + ", mobile=" + mobile + "]";
	}
	
}
