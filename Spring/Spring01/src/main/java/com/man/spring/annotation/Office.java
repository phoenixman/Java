package com.man.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Office {
	private String officeNo="007";

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	@Override
	public String toString() {
		return "office:officeNo="+officeNo;
	}
	
	
}
