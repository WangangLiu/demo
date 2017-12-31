package cn.acl.entity;

import java.io.Serializable;

public class Qpinterview implements Serializable{
    private Integer keyid;
    private String name;
    private String title;
    private String summary;
    private String icontent;
    private String publictime;
    private String img;
	public Integer getKeyid() {
		return keyid;
	}
	public void setKeyid(Integer keyid) {
		this.keyid = keyid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getIcontent() {
		return icontent;
	}
	public void setIcontent(String icontent) {
		this.icontent = icontent;
	}
	public String getPublictime() {
		return publictime;
	}
	public void setPublictime(String publictime) {
		this.publictime = publictime;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Qpinterview(Integer keyid, String name, String title,
			String summary, String icontent, String publictime, String img) {
		super();
		this.keyid = keyid;
		this.name = name;
		this.title = title;
		this.summary = summary;
		this.icontent = icontent;
		this.publictime = publictime;
		this.img = img;
	}
	public Qpinterview() {
		super();
		// TODO Auto-generated constructor stub
	}
    
 
}