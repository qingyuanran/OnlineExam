package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;

import com.neuq.service.I.StudentInterfaceBiz;
import com.neuq.service.Impl.StudentInterfaceImplBiz;


public class ShowMygrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowMygrade() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	StudentInterfaceBiz sid=new StudentInterfaceImplBiz();
    	//String stu=((Student)request.getSession().getAttribute("Student")).getUsername();
		String stu = request.getParameter("username");
    	try {
    		//���ڼ���request.getparameter("username")����
			request.getSession().setAttribute("mygradelist", sid.stucj(stu));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    			//��list���ݷ��͵�.jsp�ļ���
		//request.getRequestDispatcher("student/studentResult.jsp").forward(request, response);
		//�ض���
		response.sendRedirect("Student/studentResult.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

