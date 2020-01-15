package com.neuq.web.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neuq.bean.Paper;
import com.neuq.bean.Xzt;
import com.neuq.dao.I.PaperInterfaceDao;
import com.neuq.dao.I.TktInterfaceDao;
import com.neuq.dao.I.XztInterfaceDao;
import com.neuq.dao.Impl.PaperInterfaceImplDao;
import com.neuq.dao.Impl.TktInterfaceImplDao;
import com.neuq.dao.Impl.XztInterfaceImplDao;

public class Designtest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Designtest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//xzt

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String kk = request.getParameter("type");
		System.out.println("type= " +kk);
		if(kk.equals("1")){
			System.out.println("kkkkkkkkkkkkkkkkkkkkkkkk");
			String papername = request.getParameter("paperName");
			SimpleDateFormat strToDate=new SimpleDateFormat("yyyy-MM-dd");
			Date starttime=new Date();
			Date endtime=new Date();
			try {
				starttime=strToDate.parse(request.getParameter("startTime"));
				endtime=strToDate.parse(request.getParameter("endTime"));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			java.sql.Date startDate=new java.sql.Date(starttime.getTime());
			java.sql.Date endDate=new java.sql.Date(endtime.getTime());
			request.getSession().setAttribute("starttime",startDate);
			request.getSession().setAttribute("endtime",endDate);
			request.getSession().setAttribute("papername",papername);
//			request.getRequestDispatcher("teacher/createPaper.jsp").forward(request,response);
			response.sendRedirect("teacher/createPaperXz.jsp");
		}

		else if(kk.equals("2")){
			System.out.println("aaaaaaaa");
			String[] str = request.getParameterValues("name");
			int[] a = new int[str.length];
			XztInterfaceDao xf = new XztInterfaceImplDao();
			for(int i  = 0; i< str.length ; i++) {
				a[i]=xf.selectId(str[i]);
			}
		request.getSession().setAttribute("xz",a);
			response.sendRedirect("teacher/createPaperTk.jsp");
		}
		else if(kk.equals("3")){
			//tkt
			System.out.println("bbbbbbbbbbbbb");
			String[] str = request.getParameterValues("TK");
			int[] b = new int[str.length];
			TktInterfaceDao tk = new TktInterfaceImplDao();
			for(int i  = 0; i< str.length ; i++) {
				b[i]=tk.selectId(str[i]);
				System.out.println(b[i]);
			}
			//Íê³ÉÊÔ¾í

			Date Starttime = (Date) request.getSession().getAttribute("starttime");
			System.out.println();
			System.out.println("starttime "+Starttime);
			Date Endtime = (Date) request.getSession().getAttribute("endtime");
			System.out.println("endtime "+Endtime);
			String Papername = (String) request.getSession().getAttribute("papername");
			System.out.println("papername "+Papername);
			int k[]  = (int[]) request.getSession().getAttribute("xz");
			for(int i=0;i<k.length;i++){
				System.out.println(k[i]);
			}
			Paper paper=new Paper(Starttime,Endtime,Papername,k[0],k[1],k[2],k[3],k[4],k[5],k[6],k[7],k[8],k[9],b[0],b[1],b[2],b[3],b[4]);
			PaperInterfaceDao p = new PaperInterfaceImplDao();
			p.insert(paper);
			response.sendRedirect("teacher/index.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
