package cn.acl.entity;

import java.io.Serializable;

public class QPpicture implements Serializable{

	private Integer keyid;
	private String ptype;
	private String picture;
	public Integer getKeyid() {
		return keyid;
	}
	public void setKeyid(Integer keyid) {
		this.keyid = keyid;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public QPpicture(Integer keyid, String ptype, String picture) {
		super();
		this.keyid = keyid;
		this.ptype = ptype;
		this.picture = picture;
	}
	public QPpicture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	
}
