//package com.neuq.web.servlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class FindProductByPage extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //1.��ȡ�������
//        String currentPage = request.getParameter("currentPage");
//        String rows = getServletConfig().getInitParameter("rows");
//        //�жϴ�������ҳ�洫�ݹ�����ʱ��,���ʱ����Ҫ�����䵱ǰҳ���ж�
//        if (currentPage == null || "".equals(currentPage)){
//            currentPage = "1";
//        }
//
//        System.out.println("��ǰҳ����:"+currentPage);
//        System.out.println("ÿҳ��������:"+ rows);
//
//        //2.����service���в�ѯ
//        ProductService service = new ProductServiceImpl();
//        PageBean<Product> pb = service.findUserByPage(currentPage,rows);
//
//        System.out.println(pb.getTotalPage()+"***************");
//
//        //3.��pageBean���뵽�������
//        request.setAttribute("pb",pb);
//        //4.ת����list.jspҳ����ȥ
//        request.getRequestDispatcher("/studentResult.jsp").forward(request,response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//
//}
