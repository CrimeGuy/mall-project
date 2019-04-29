package com.openlab.bean;

public class Orders {
	private int o_id;
	private int o_totalmoney;
	private String o_address;
	private String o_time;
	private String o_status;
	private String u_id;

	public Orders() {
		super();
	}

	public Orders(int o_id, int o_totalmoney, String o_address, String o_time, String o_status, String u_id) {
		super();
		this.o_id = o_id;
		this.o_totalmoney = o_totalmoney;
		this.o_address = o_address;
		this.o_time = o_time;
		this.o_status = o_status;
		this.u_id = u_id;
	}
	

	public Orders(int o_totalmoney, String o_address, String o_time, String o_status, String u_id) {
		super();
		this.o_totalmoney = o_totalmoney;
		this.o_address = o_address;
		this.o_time = o_time;
		this.o_status = o_status;
		this.u_id = u_id;
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public int getO_totalmoney() {
		return o_totalmoney;
	}

	public void setO_totalmoney(int o_totalmoney) {
		this.o_totalmoney = o_totalmoney;
	}

	public String getO_address() {
		return o_address;
	}

	public void setO_address(String o_address) {
		this.o_address = o_address;
	}

	public String getO_time() {
		return o_time;
	}

	public void setO_time(String o_time) {
		this.o_time = o_time;
	}

	public String getO_status() {
		return o_status;
	}

	public void setO_status(String o_status) {
		this.o_status = o_status;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	@Override
	public String toString() {
		return "Orders [o_id=" + o_id + ", o_totalmoney=" + o_totalmoney + ", o_address=" + o_address + ", o_time="
				+ o_time + ", o_status=" + o_status + ", u_id=" + u_id + "]";
	}

}
