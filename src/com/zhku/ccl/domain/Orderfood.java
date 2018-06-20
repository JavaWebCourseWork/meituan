package com.zhku.ccl.domain;

public class Orderfood {
    private Integer ofid;

    private Integer oid;

    private Integer fid;

    private Integer ofnumber;
    
    //------------------
    private Food food;

    public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Integer getOfid() {
        return ofid;
    }

    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getOfnumber() {
        return ofnumber;
    }

    public void setOfnumber(Integer ofnumber) {
        this.ofnumber = ofnumber;
    }
}