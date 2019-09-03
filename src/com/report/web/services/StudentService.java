package com.report.web.services;

import com.report.web.domains.StudentBean;

public interface StudentService {
	public void createReport(StudentBean param);
	public String createHakNum(StudentBean param);
	public String creatYear();
}
