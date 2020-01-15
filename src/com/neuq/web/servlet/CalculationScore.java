package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Paper;
import com.neuq.bean.PaperString;
import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
import com.neuq.service.I.StudentGradeInterfaceBiz;
import com.neuq.service.Impl.StudentGradeInterfaceImplBiz;
import com.neuq.util.QuestionInstance;

public class CalculationScore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculationScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("欢迎进入CalculationScore！！！！");
		String[] xzt = new String[10];
		for(int i=0;i<10;i++){
			String kk= request.getParameter("xz" + i);
			xzt[i]=kk;
		}
		String[] tkt = new String[5];
		for(int i=0;i<5;i++){
			String aaa= request.getParameter("tk"+i);
			tkt[i] =aaa;
		}

		Student stu = (Student) request.getSession().getAttribute("Student");
		System.out.println(stu.toString());
		PaperString ps = (PaperString) request.getSession().getAttribute("ps");
		String[] answer = new String[15];
		answer[0]=ps.getXzt1an();
		answer[1]=ps.getXzt2an();
		answer[2]=ps.getXzt3an();
		answer[3]=ps.getXzt4an();
		answer[4]=ps.getXzt5an();
		answer[5]=ps.getXzt6an();
		answer[6]=ps.getXzt7an();
		answer[7]=ps.getXzt8an();
		answer[8]=ps.getXzt9an();
		answer[9]=ps.getXzt10an();
		answer[10]=ps.getTkt1an();
		answer[11]=ps.getTkt2an();
		answer[12]=ps.getTkt3an();
		answer[13]=ps.getTkt4an();
		answer[14]=ps.getTkt5an();
		int xztright = 0;
		int tktright = 0;
		for(int  i  = 0;i< 10;i++){
			if(xzt[i].equals(answer[i])){
				xztright ++;
			}
		}
		for(int j =10,i=0;j<15&&i<5;i++,j++){
			if(tkt[i].equals(answer[j])){
				tktright ++;
			}
		}
		System.out.println("选择题正确的个数 "+xztright);
		System.out.println("填空题正确的个数 "+tktright);
		System.out.println(stu.getUsername());
		int xztscore = xztright*5;
		System.out.println(xztscore);
		int tktscore = tktright*10;
		System.out.println(tktscore);
		String papername = ps.getPapername();
		System.out.println(papername);
		StudentGrade sGrade = new StudentGrade(stu.getUsername(),xztright*5,tktright*10,ps.getPapername());
		StudentGradeInterfaceBiz studentGradeInterfaceBiz=new StudentGradeInterfaceImplBiz();
		studentGradeInterfaceBiz.insert(sGrade);
		request.getSession().setAttribute("Score",sGrade);
		request.getRequestDispatcher("./Score.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
