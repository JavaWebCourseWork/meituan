package com.zhku.ccl.domain;

public class Food {
    private Integer fid;

    private Integer sid;

    private String fname;

    private String fimage;

    private Float fprice;

    private Integer ftagid;

    private Boolean fisban;

    @Override
	public String toString() {
		return "Food [fid=" + fid + ", sid=" + sid + ", fname=" + fname + ", fimage=" + fimage + ", fprice=" + fprice
				+ ", ftagid=" + ftagid + ", fisban=" + fisban + "]";
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFimage() {
        return fimage;
    }

    public void setFimage(String fimage) {
        this.fimage = fimage == null ? null : fimage.trim();
    }

    public Float getFprice() {
        return fprice;
    }

    public void setFprice(Float fprice) {
        this.fprice = fprice;
    }

    public Integer getFtagid() {
        return ftagid;
    }

    public void setFtagid(Integer ftagid) {
        this.ftagid = ftagid;
    }

    public Boolean getFisban() {
        return fisban;
    }

    public void setFisban(Boolean fisban) {
        this.fisban = fisban;
    }
}