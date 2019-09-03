package com.report.web.serviceImpls;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

import com.report.web.doalmpls.StudentDAOImpl;
import com.report.web.doas.StudentDAO;
import com.report.web.domains.StudentBean;
import com.report.web.services.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentDAO dao;

	public StudentServiceImpl() {
		dao = new StudentDAOImpl();
	}
	

	@Override
	public void createReport(StudentBean param) {
		param.setStudentNum(createHakNum(param));
		dao.insertStudent(param);
	}

	@Override
	public String createHakNum(StudentBean param) {
		Random ran = new Random();
		String flag = String.format("%s-%s%03d", creatYear(), param.getSsn().substring(7, 8), ran.nextInt(999) + 1);
		return flag;
	}

	@Override
	public String creatYear() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String year = sdf.format(new Date(0));
		return year;
	}

}
