package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;
import com.neuq.bean.Teacher;
import com.neuq.service.I.ManagerInterfaceBiz;
import com.neuq.service.I.TeacherInterfaceBiz;
import com.neuq.service.Impl.ManagerInterfaceImplBiz;
import com.neuq.service.Impl.TeacherInterfaceImplBiz;



public class ShowUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ShowUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
    	//		String usertype = request.getParameter("usertype");
//		String studentclass = request.getParameter("studentclass");
		String usertype = "2";
//		String studentclass ="1";
		if(Integer.parseInt(usertype) == 3){
			ManagerInterfaceBiz mInterfaceBiz=new ManagerInterfaceImplBiz();
			ArrayList<Teacher> list = null;
			try {
				list = (ArrayList<Teacher>) mInterfaceBiz.select();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			request.setAttribute("teacherlist",list);
			request.getRequestDispatcher("managerTeacher.jsp").forward(request,response);
		}
		else {
			System.out.println("%%%%%%lalala");
			TeacherInterfaceBiz mInterfaceBiz=new TeacherInterfaceImplBiz();
			ArrayList<Student> list = null;
			try {
				list = (ArrayList<Student>) mInterfaceBiz.select();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(list);
			request.getSession().setAttribute("STU",list);
//			request.getRequestDispatcher("teacher/opStudent.jsp").forward(request,response);
			response.sendRedirect("teacher/opStudent.jsp");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
