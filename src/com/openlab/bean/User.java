package com.openlab.bean;

public class User {
	private String u_id;
	private String u_pwd;
	private String u_name;
	private String u_phone;
	private String u_address;
	private int r_id;

	public User() {
		super();
	}

	public User(String u_id, String u_pwd, String u_name, String u_phone, String u_address, int r_id) {
		super();
		this.u_id = u_id;
		this.u_pwd = u_pwd;
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_address = u_address;
		this.r_id = r_id;
	}

	
	public User(String u_pwd, String u_name, String u_phone, String u_address) {
		super();
		this.u_pwd = u_pwd;
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_address = u_address;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_pwd=" + u_pwd + ", u_name=" + u_name + ", u_phone=" + u_phone
				+ ", u_address=" + u_address + ", r_id=" + r_id + "]";
	}

}
