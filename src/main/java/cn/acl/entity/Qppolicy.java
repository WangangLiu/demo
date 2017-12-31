package cn.acl.entity;

import java.io.Serializable;

public class Qppolicy implements Serializable{
    private Integer keyid;
    private String title;
    private String publictime;
    private String pcontent;
    
    
    
	public Qppolicy(Integer keyid, String title, String publictime,
			String pcontent) {
		super();
		this.keyid = keyid;
		this.title = title;
		this.publictime = publictime;
		this.pcontent = pcontent;
	}
	public Qppolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getPublictime() {
		return publictime;
	}
	public void setPublictime(String publictime) {
		this.publictime = publictime;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

    
}