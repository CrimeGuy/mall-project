package com.openlab.bean;

public class Ordersdetail {
	private int od_id;
	private int od_num;
	private int od_money;
	private int od_totalmoney;
	private String od_adddress;
	private String od_status;
	private int o_id;
	private int g_id;
	private Goods goods;

	public Ordersdetail(int od_num, int od_money, int od_totalmoney, String od_adddress, String od_status, int o_id,
			int g_id, Goods goods) {
		super();
		this.od_num = od_num;
		this.od_money = od_money;
		this.od_totalmoney = od_totalmoney;
		this.od_adddress = od_adddress;
		this.od_status = od_status;
		this.o_id = o_id;
		this.g_id = g_id;
		this.goods = goods;
	}

	public Ordersdetail(int od_id, int od_num, int od_money, int od_totalmoney, String od_adddress, String od_status,
			int o_id, int g_id) {
		super();
		this.od_id = od_id;
		this.od_num = od_num;
		this.od_money = od_money;
		this.od_totalmoney = od_totalmoney;
		this.od_adddress = od_adddress;
		this.od_status = od_status;
		this.o_id = o_id;
		this.g_id = g_id;
	}

	public Ordersdetail(int od_num, int od_money, int od_totalmoney, String od_adddress, String od_status, int o_id,
			int g_id) {
		super();
		this.od_num = od_num;
		this.od_money = od_money;
		this.od_totalmoney = od_totalmoney;
		this.od_adddress = od_adddress;
		this.od_status = od_status;
		this.o_id = o_id;
		this.g_id = g_id;
	}

	public Ordersdetail() {
		super();
	}

	public int getOd_id() {
		return od_id;
	}

	public void setOd_id(int od_id) {
		this.od_id = od_id;
	}

	public int getOd_num() {
		return od_num;
	}

	public void setOd_num(int od_num) {
		this.od_num = od_num;
	}

	public int getOd_money() {
		return od_money;
	}

	public void setOd_money(int od_money) {
		this.od_money = od_money;
	}

	public int getOd_totalmoney() {
		return od_totalmoney;
	}

	public void setOd_totalmoney(int od_totalmoney) {
		this.od_totalmoney = od_totalmoney;
	}

	public String getOd_adddress() {
		return od_adddress;
	}

	public void setOd_adddress(String od_adddress) {
		this.od_adddress = od_adddress;
	}

	public String getOd_status() {
		return od_status;
	}

	public void setOd_status(String od_status) {
		this.od_status = od_status;
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public int getG_id() {
		return g_id;
	}

	public void setG_id(int g_id) {
		this.g_id = g_id;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "Ordersdetail [od_id=" + od_id + ", od_num=" + od_num + ", od_money=" + od_money + ", od_totalmoney="
				+ od_totalmoney + ", od_adddress=" + od_adddress + ", od_status=" + od_status + ", o_id=" + o_id
				+ ", g_id=" + g_id + ", goods=" + goods + "]";
	}

}
