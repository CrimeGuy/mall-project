package com.openlab.bean;

public class Privilege {
	private String p_id;
	private String p_name;
	private String p_uri;
	private String p_describe;
	private String p_parent;
	private String p_target;
	private String p_position;

	public Privilege(String p_id, String p_name, String p_uri, String p_describe, String p_parent, String p_target,
			String p_position) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_uri = p_uri;
		this.p_describe = p_describe;
		this.p_parent = p_parent;
		this.p_target = p_target;
		this.p_position = p_position;
	}

	public Privilege() {
		super();
	}

	@Override
	public String toString() {
		return "Privilege [p_id=" + p_id + ", p_name=" + p_name + ", p_uri=" + p_uri + ", p_describe=" + p_describe
				+ ", p_parent=" + p_parent + ", p_target=" + p_target + ", p_position=" + p_position + "]";
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_uri() {
		return p_uri;
	}

	public void setP_uri(String p_uri) {
		this.p_uri = p_uri;
	}

	public String getP_describe() {
		return p_describe;
	}

	public void setP_describe(String p_describe) {
		this.p_describe = p_describe;
	}

	public String getP_parent() {
		return p_parent;
	}

	public void setP_parent(String p_parent) {
		this.p_parent = p_parent;
	}

	public String getP_target() {
		return p_target;
	}

	public void setP_target(String p_target) {
		this.p_target = p_target;
	}

	public String getP_position() {
		return p_position;
	}

	public void setP_position(String p_position) {
		this.p_position = p_position;
	}

}
