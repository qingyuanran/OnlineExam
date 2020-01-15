package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neuq.dao.I.StudentInterfaceDao;
import com.neuq.dao.Impl.StudentInterfaceImplDao;

/**
 * Servlet implementation class cjservlet
 */



public class Stucj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Stucj() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	StudentInterfaceDao sid=new StudentInterfaceImplDao();
    	try {
    		//���ڼ���request.getparameter("username")����
			request.setAttribute("list", sid.stucj("chai"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    			//��list���ݷ��͵�.jsp�ļ���
		request.getRequestDispatcher("cj.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

