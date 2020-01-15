package com.neuq.web.servlet;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Paper;

import com.neuq.dao.I.PaperInterfaceDao;
import com.neuq.dao.Impl.PaperInterfaceImplDao;
import com.neuq.service.I.PaperInterfaceBiz;
import com.neuq.service.Impl.PaperInterfaceImplBiz;


/**
 * Servlet implementation class ShowAllPaper
 */
public class ShowAllPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ShowAllPaper() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaperInterfaceDao pif=new PaperInterfaceImplDao();
		request.getSession().setAttribute("paperList",pif.select());
		response.sendRedirect("teacher/seePaper.jsp");
	}

}
