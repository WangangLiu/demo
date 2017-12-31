package cn.acl.entity;

import java.io.Serializable;

public class Qpnews implements Serializable{
    private Integer keyid;
    
    private String title;

    private String ntime;

    private String  ncontent;
    
    private String reportor; 

    private String img;
    
    private Integer readnum;

    private Integer discussnum;
    
    private Integer pageSize;//每页的大小
	private Integer pageNo;//当前的页数
	private Integer currentPage;//当前页

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

	public String getNtime() {
		return ntime;
	}

	public void setNtime(String ntime) {
		this.ntime = ntime;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getReportor() {
		return reportor;
	}

	public void setReportor(String reportor) {
		this.reportor = reportor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getReadnum() {
		return readnum;
	}

	public void setReadnum(Integer readnum) {
		this.readnum = readnum;
	}

	public Integer getDiscussnum() {
		return discussnum;
	}

	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}

	
	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Qpnews(Integer keyid, String title, String ntime, String ncontent,
			String reportor, String img, Integer readnum, Integer discussnum) {
		super();
		this.keyid = keyid;
		this.title = title;
		this.ntime = ntime;
		this.ncontent = ncontent;
		this.reportor = reportor;
		this.img = img;
		this.readnum = readnum;
		this.discussnum = discussnum;
	}

	public Qpnews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

 
    
}