package com.neuq.web.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import com.neuq.bean.StudentGrade;
import com.neuq.dao.Impl.StudentGradeInterfaceImplDao;



public class ExportExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ExportExcel() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//WriteExcel wl=new WriteExcel();
		String stu = request.getParameter("username");
		List<StudentGrade> list=new StudentGradeInterfaceImplDao().select(stu);
		request.getSession().setAttribute("studentgrade",list);
		request.getRequestDispatcher("/excelOut.jsp").forward(request, response);

	}

}


