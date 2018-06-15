package com.zhku.ccl.domain;

public class Store {
    private Integer sid;

    private String sname;

    private String saddress;

    private String sphone;

    private String sstabusiness;

    private String sendbusiness;

    private Integer sstate;

    private Float sfreight;

    private Float sstart;

    private Integer smeantime;

    private String slicence;

    private String smaster;

    private Integer stagid;

    private Float sstar;

    @Override
	public String toString() {
		return "Store [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sphone=" + sphone
				+ ", sstabusiness=" + sstabusiness + ", sendbusiness=" + sendbusiness + ", sstate=" + sstate
				+ ", sfreight=" + sfreight + ", sstart=" + sstart + ", smeantime=" + smeantime + ", slicence="
				+ slicence + ", smaster=" + smaster + ", stagid=" + stagid + ", sstar=" + sstar + "]";
	}

	public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }

    public String getSstabusiness() {
        return sstabusiness;
    }

    public void setSstabusiness(String sstabusiness) {
        this.sstabusiness = sstabusiness == null ? null : sstabusiness.trim();
    }

    public String getSendbusiness() {
        return sendbusiness;
    }

    public void setSendbusiness(String sendbusiness) {
        this.sendbusiness = sendbusiness == null ? null : sendbusiness.trim();
    }

    public Integer getSstate() {
        return sstate;
    }

    public void setSstate(Integer sstate) {
        this.sstate = sstate;
    }

    public Float getSfreight() {
        return sfreight;
    }

    public void setSfreight(Float sfreight) {
        this.sfreight = sfreight;
    }

    public Float getSstart() {
        return sstart;
    }

    public void setSstart(Float sstart) {
        this.sstart = sstart;
    }

    public Integer getSmeantime() {
        return smeantime;
    }

    public void setSmeantime(Integer smeantime) {
        this.smeantime = smeantime;
    }

    public String getSlicence() {
        return slicence;
    }

    public void setSlicence(String slicence) {
        this.slicence = slicence == null ? null : slicence.trim();
    }

    public String getSmaster() {
        return smaster;
    }

    public void setSmaster(String smaster) {
        this.smaster = smaster == null ? null : smaster.trim();
    }

    public Integer getStagid() {
        return stagid;
    }

    public void setStagid(Integer stagid) {
        this.stagid = stagid;
    }

    public Float getSstar() {
        return sstar;
    }

    public void setSstar(Float sstar) {
        this.sstar = sstar;
    }
}