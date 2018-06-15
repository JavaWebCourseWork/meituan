package com.zhku.ccl.domain;

public class Users {
    private Integer uid;

    private String uphone;

    private String upassword;

    private String uheadportrait;

    private Integer urole;

    @Override
	public String toString() {
		return "Users [uid=" + uid + ", uphone=" + uphone + ", upassword=" + upassword + ", uheadportrait="
				+ uheadportrait + ", urole=" + urole + "]";
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

    public String getUheadportrait() {
        return uheadportrait;
    }

    public void setUheadportrait(String uheadportrait) {
        this.uheadportrait = uheadportrait == null ? null : uheadportrait.trim();
    }

    public Integer getUrole() {
        return urole;
    }

    public void setUrole(Integer urole) {
        this.urole = urole;
    }
}