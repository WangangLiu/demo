package cn.acl.entity;

import java.io.Serializable;

public class Qpinformation implements Serializable{
    private Integer keyid;

    private String phone;

    private String qq;

    private String email;

    private String weixin;

    private String address;

    private String map;

	public Integer getKeyid() {
		return keyid;
	}

	public void setKeyid(Integer keyid) {
		this.keyid = keyid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public Qpinformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Qpinformation(Integer keyid, String phone, String qq, String email,
			String weixin, String address, String map) {
		super();
		this.keyid = keyid;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
		this.weixin = weixin;
		this.address = address;
		this.map = map;
	}


}