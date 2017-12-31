package cn.acl.entity;

import java.io.Serializable;

public class Qpdiscuss  implements Serializable{
    private Integer keyid;

    private Integer fid;

    private Integer dtype;

    private String discussdate;

    private Integer readnum;

    private Integer peopleid;

    public Integer getKeyid() {
        return keyid;
    }

    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }

    public String getDiscussdate() {
        return discussdate;
    }

    public void setDiscussdate(String discussdate) {
        this.discussdate = discussdate == null ? null : discussdate.trim();
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }
}