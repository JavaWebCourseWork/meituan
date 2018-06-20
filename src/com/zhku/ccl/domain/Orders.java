package com.zhku.ccl.domain;

import java.util.Date;
import java.util.List;

public class Orders {
    private Integer oid;

    private Integer sid;

    private Integer aid;

    private String omessage;

    private Float oprice;

    private Date odate;

    private Integer did;

    private Integer uid;
    
    //----------------------------------------
    private List<Orderfood> orderfoodList;
    
    private Address address;
    
    private Store store;
    
    

    public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Orderfood> getOrderfoodList() {
		return orderfoodList;
	}

	public void setOrderfoodList(List<Orderfood> orderfoodList) {
		this.orderfoodList = orderfoodList;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getOmessage() {
        return omessage;
    }

    public void setOmessage(String omessage) {
        this.omessage = omessage == null ? null : omessage.trim();
    }

    public Float getOprice() {
        return oprice;
    }

    public void setOprice(Float oprice) {
        this.oprice = oprice;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}