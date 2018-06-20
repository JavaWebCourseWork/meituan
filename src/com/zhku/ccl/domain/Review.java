package com.zhku.ccl.domain;

public class Review {
    private Integer rid;

    private Integer sid;

    private Integer oid;

    private String rcontent;

    private Integer rstar;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent == null ? null : rcontent.trim();
    }

    public Integer getRstar() {
        return rstar;
    }

    public void setRstar(Integer rstar) {
        this.rstar = rstar;
    }
}