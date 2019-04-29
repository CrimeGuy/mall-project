package com.openlab.bean;

public class Goods {
	private int g_id;
	private int g_money;
	private String g_name;
	private String g_image;
	private String g_status;

	public Goods() {
		super();
	}

	public Goods(int g_id, int g_money, String g_name, String g_image, String g_status) {
		super();
		this.g_id = g_id;
		this.g_money = g_money;
		this.g_name = g_name;
		this.g_image = g_image;
		this.g_status = g_status;
	}

	
	

	public Goods(int g_money, String g_name) {
		super();
		this.g_money = g_money;
		this.g_name = g_name;
	}

	public int getG_id() {
		return g_id;
	}

	public void setG_id(int g_id) {
		this.g_id = g_id;
	}

	public int getG_money() {
		return g_money;
	}

	public void setG_money(int g_money) {
		this.g_money = g_money;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public String getG_image() {
		return g_image;
	}

	public void setG_image(String g_image) {
		this.g_image = g_image;
	}

	public String getG_status() {
		return g_status;
	}

	public void setG_status(String g_status) {
		this.g_status = g_status;
	}

	@Override
	public String toString() {
		return "Goods [g_id=" + g_id + ", g_money=" + g_money + ", g_name=" + g_name + ", g_image=" + g_image
				+ ", g_status=" + g_status + "]";
	}

}
