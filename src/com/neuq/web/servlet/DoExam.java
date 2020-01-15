package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Paper;
import com.neuq.bean.PaperString;
import com.neuq.service.I.PaperInterfaceBiz;
import com.neuq.service.Impl.PaperInterfaceImplBiz;
import com.neuq.util.QuestionInstance;



public class DoExam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoExam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String papername=request.getParameter("papername");
		PaperInterfaceBiz pf=new PaperInterfaceImplBiz();
		Paper p=pf.selectInstance(papername);
		PaperString ps=QuestionInstance.changeToPaperString(p);
		//��psת���ؿ�ҳ����ʾ�����п���
		request.getSession().setAttribute("ps", ps);
		//�ض���
		request.getRequestDispatcher("paper.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
