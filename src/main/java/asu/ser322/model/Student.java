package asu.ser322.model;

import java.util.List;

public class Student {
	
	private long sId;
	private String sNm;
	private List<Teacher> tList;
	
	public long getsId() {
		return sId;
	}
	public void setsId(long sId) {
		this.sId = sId;
	}
	public String getsNm() {
		return sNm;
	}
	public void setsNm(String sNm) {
		this.sNm = sNm;
	}
	public List<Teacher> gettList() {
		return tList;
	}
	public void settList(List<Teacher> tList) {
		this.tList = tList;
	}

}
