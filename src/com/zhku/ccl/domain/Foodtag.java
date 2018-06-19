package com.zhku.ccl.domain;

public class Foodtag {
    private Integer ftagid;

    private Integer sid;

    private String ftagcontent;

    @Override
	public String toString() {
		return "Foodtag [ftagid=" + ftagid + ", sid=" + sid + ", ftagcontent=" + ftagcontent + "]";
	}

	public Integer getFtagid() {
        return ftagid;
    }

    public void setFtagid(Integer ftagid) {
        this.ftagid = ftagid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getFtagcontent() {
        return ftagcontent;
    }

    public void setFtagcontent(String ftagcontent) {
        this.ftagcontent = ftagcontent == null ? null : ftagcontent.trim();
    }
}