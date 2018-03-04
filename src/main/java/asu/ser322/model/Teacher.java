package asu.ser322.model;

import java.util.List;

public class Teacher {

	private String tId;
	private String tNm;
	private List<Student> sList;
	
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String gettNm() {
		return tNm;
	}
	public void settNm(String tNm) {
		this.tNm = tNm;
	}
	public List<Student> getsList() {
		return sList;
	}
	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
	
	
}
