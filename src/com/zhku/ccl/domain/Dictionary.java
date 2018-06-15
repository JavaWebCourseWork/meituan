package com.zhku.ccl.domain;

public class Dictionary {
    private Integer did;

    private String classify;

    private String dstate;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getDstate() {
        return dstate;
    }

    public void setDstate(String dstate) {
        this.dstate = dstate == null ? null : dstate.trim();
    }

	@Override
	public String toString() {
		return "Dictionary [did=" + did + ", classify=" + classify + ", dstate=" + dstate + "]";
	}
}