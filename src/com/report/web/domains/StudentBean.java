package com.report.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name, ssn, kor, eng, math, society, studentNum, hap, average;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHap() {
		return hap;
	}

	public void setHap(String hap) {
		this.hap = hap;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	public String getSsn() {
		return ssn;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", ssn=" + ssn + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", society=" + society + ", studentNum=" + studentNum + ", hap=" + hap + ", average=" + average + "]";
	}

	
}
