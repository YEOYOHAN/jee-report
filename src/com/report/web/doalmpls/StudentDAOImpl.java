package com.report.web.doalmpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.report.web.doas.StudentDAO;
import com.report.web.domains.StudentBean;

public class StudentDAOImpl implements StudentDAO{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-report%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator);
	@Override
	public void insertStudent(StudentBean param) {

		try {
			File file = new File(FILE_PATH+"report.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			int kor = Integer.parseInt(param.getKor());
			int eng = Integer.parseInt(param.getEng());
			int math = Integer.parseInt(param.getMath());
			int society = Integer.parseInt(param.getSociety());
			int sum = kor + eng + math + society;
			int av = sum / 4;
			writer.write(String.format("%s %s %s %s %s %s %d %d", 
					param.getName(),
					param.getStudentNum(), 
					param.getKor(), 
					param.getEng(), 
					param.getMath(),
					param.getSociety(),sum,av));
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
