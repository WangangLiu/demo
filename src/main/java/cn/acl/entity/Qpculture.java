package cn.acl.entity;

import java.io.Serializable;

public class Qpculture implements Serializable{
    private Integer keyid;

    private String title;

    private String reportor;

    private String publictime;

    private Integer readnum;

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
        this.title = title == null ? null : title.trim();
    }

    public String getReportor() {
        return reportor;
    }

    public void setReportor(String reportor) {
        this.reportor = reportor == null ? null : reportor.trim();
    }

    public String getPublictime() {
        return publictime;
    }

    public void setPublictime(String publictime) {
        this.publictime = publictime == null ? null : publictime.trim();
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }
}