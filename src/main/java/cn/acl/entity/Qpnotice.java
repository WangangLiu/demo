package cn.acl.entity;

import java.io.Serializable;

public class Qpnotice implements Serializable{
    private Integer keyid;

    private String title;
    
    private String ncontent;

    private String publictime;

	public Integer getKeyid() {
		return keyid;
	}

	public void setKeyid(Integer keyid) {
		this.keyid = keyid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getPublictime() {
		return publictime;
	}

	public void setPublictime(String publictime) {
		this.publictime = publictime;
	}

	public Qpnotice(Integer keyid, String title, String ncontent,
			String publictime) {
		super();
		this.keyid = keyid;
		this.title = title;
		this.ncontent = ncontent;
		this.publictime = publictime;
	}

	public Qpnotice() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}