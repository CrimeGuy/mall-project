package com.openlab.bean;

public class Car {
	private int c_id;
	private int c_money;
	private int c_num;
	private String c_name;
	private String c_image;
	private String c_status;
	private int g_id;
	private String u_id;
	private int totalmoney;
	public Car() {
		super();
	}
	public Car(int c_id, int c_money, int c_num, String c_name, String c_image, String c_status, int g_id, String u_id,
			int totalmoney) {
		super();
		this.c_id = c_id;
		this.c_money = c_money;
		this.c_num = c_num;
		this.c_name = c_name;
		this.c_image = c_image;
		this.c_status = c_status;
		this.g_id = g_id;
		this.u_id = u_id;
		this.totalmoney = totalmoney;
	}
	public Car(int c_money, int c_num, String c_name, String c_image, String c_status, int g_id, String u_id,
			int totalmoney) {
		super();
		this.c_money = c_money;
		this.c_num = c_num;
		this.c_name = c_name;
		this.c_image = c_image;
		this.c_status = c_status;
		this.g_id = g_id;
		this.u_id = u_id;
		this.totalmoney = totalmoney;
	}
	@Override
	public String toString() {
		return "Car [c_id=" + c_id + ", c_money=" + c_money + ", c_num=" + c_num + ", c_name=" + c_name + ", c_image="
				+ c_image + ", c_status=" + c_status + ", g_id=" + g_id + ", u_id=" + u_id + ", totalmoney="
				+ totalmoney + "]";
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getC_money() {
		return c_money;
	}
	public void setC_money(int c_money) {
		this.c_money = c_money;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_image() {
		return c_image;
	}
	public void setC_image(String c_image) {
		this.c_image = c_image;
	}
	public String getC_status() {
		return c_status;
	}
	public void setC_status(String c_status) {
		this.c_status = c_status;
	}
	public int getG_id() {
		return g_id;
	}
	public void setG_id(int g_id) {
		this.g_id = g_id;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public int getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(int totalmoney) {
		this.totalmoney = totalmoney;
	}
	
	
	
}
