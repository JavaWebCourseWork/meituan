package com.zhku.ccl.domain;

public class Dictionary {
    private Integer did;

    private String dclassify;

    private String dstate;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDclassify() {
        return dclassify;
    }

    public void setDclassify(String dclassify) {
        this.dclassify = dclassify == null ? null : dclassify.trim();
    }

    public String getDstate() {
        return dstate;
    }

    public void setDstate(String dstate) {
        this.dstate = dstate == null ? null : dstate.trim();
    }
}