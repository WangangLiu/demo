package cn.acl.entity;

import java.io.Serializable;
import java.util.Date;

public class Qpsurvey implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer keyid;  //编号

    private String title;   //标题

    private String publictime;   //发布时间

    private String img;			//图片

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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Qpsurvey(Integer keyid, String title, String publictime, String img) {
		super();
		this.keyid = keyid;
		this.title = title;
		this.publictime = publictime;
		this.img = img;
	}

	public Qpsurvey() {
		super();
		// TODO Auto-generated constructor stub
	}

	 

 
}