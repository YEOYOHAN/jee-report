package com.report.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.report.web.domains.StudentBean;
import com.report.web.services.StudentService;
import com.report.web.serviceImpls.StudentServiceImpl;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String kor = request.getParameter("kor");
		String math = request.getParameter("math");
		String eng = request.getParameter("eng");
		String society = request.getParameter("society");
		StudentBean param = new StudentBean();
		param.setEng(eng);
		param.setKor(kor);
		param.setMath(math);
		param.setName(name);
		param.setSociety(society);
		param.setSsn(ssn);
		StudentService service = new StudentServiceImpl();
		service.createReport(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
