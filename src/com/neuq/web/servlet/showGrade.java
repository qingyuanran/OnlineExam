package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.StudentGrade;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;



public class showGrade extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public showGrade() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeacherInterfaceDao teacherInterfaceDao = new TeacherInterfaceImplDao();
        String papername = (String)request.getAttribute("papername");
        try{
            teacherInterfaceDao.selectGrade(papername);
        }catch(SQLException e){
            e.printStackTrace();
        }

        response.sendRedirect("teacher/checkExamResult.jsp");

    }

}
