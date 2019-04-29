package com.openlab.bean;

public class Role {

	private int r_id;
	private String r_name;
	private String r_describe;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int r_id, String r_name, String r_describe) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
		this.r_describe = r_describe;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public String getR_describe() {
		return r_describe;
	}

	public void setR_describe(String r_describe) {
		this.r_describe = r_describe;
	}

	@Override
	public String toString() {
		return "Role [r_id=" + r_id + ", r_name=" + r_name + ", r_describe=" + r_describe + "]";
	}

}
