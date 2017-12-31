package cn.acl.entity;

import java.io.Serializable;

public class Qpgame implements Serializable{
    private Integer keyid;

    private String title;

    private String titleimg;

    private String gcontent;
    
    private String gtime;

    private String hostunit;

    private String usetime;

    private String bonus;
    private String starttime;
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
	public String getTitleimg() {
		return titleimg;
	}
	public void setTitleimg(String titleimg) {
		this.titleimg = titleimg;
	}
	public String getGcontent() {
		return gcontent;
	}
	public void setGcontent(String gcontent) {
		this.gcontent = gcontent;
	}
	public String getGtime() {
		return gtime;
	}
	public void setGtime(String gtime) {
		this.gtime = gtime;
	}
	public String getHostunit() {
		return hostunit;
	}
	public void setHostunit(String hostunit) {
		this.hostunit = hostunit;
	}
	public String getUsetime() {
		return usetime;
	}
	public void setUsetime(String usetime) {
		this.usetime = usetime;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public Qpgame(Integer keyid, String title, String titleimg,
			String gcontent, String gtime, String hostunit, String usetime,
			String bonus, String starttime) {
		super();
		this.keyid = keyid;
		this.title = title;
		this.titleimg = titleimg;
		this.gcontent = gcontent;
		this.gtime = gtime;
		this.hostunit = hostunit;
		this.usetime = usetime;
		this.bonus = bonus;
		this.starttime = starttime;
	}
	public Qpgame() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
}