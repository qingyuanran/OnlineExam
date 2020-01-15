package com.neuq.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.service.NoticeBiz;

public class UpdateNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateNotice() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String information = request.getParameter("information");
		NoticeBiz nb = new NoticeBiz();

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.print("<script type=\"text/javascript\" language=\"javascript\">");
		try {
			nb.update(information);
			out.print("alert('�޸Ĺ���ɹ���');");
		} catch (SQLException e) {
			e.printStackTrace();
			out.print("alert('�޸�ʧ�ܣ������³���');");

		} finally {
			out.print("window.location='Manager/managerRelease.jsp';");
			out.print("</script>");
			out.print("</body></html>");

		}

	}

}
