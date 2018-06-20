package com.zhku.ccl.domain;

import java.util.List;

public class Users {
    private Integer uid;

    private String uphone;

    private String upassword;

    private String uhead;

    private Integer did;
  //--------------------------------
    private List<Orders> ordersList;
    

    @Override
	public String toString() {
		return "Users [uid=" + uid + ", uphone=" + uphone + ", upassword=" + upassword + ", uhead=" + uhead + ", did="
				+ did + ", ordersList=" + ordersList + "]";
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUhead() {
        return uhead;
    }

    public void setUhead(String uhead) {
        this.uhead = uhead == null ? null : uhead.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}