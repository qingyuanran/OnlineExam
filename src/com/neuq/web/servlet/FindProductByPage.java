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
//        //1.获取请求参数
//        String currentPage = request.getParameter("currentPage");
//        String rows = getServletConfig().getInitParameter("rows");
//        //判断从其他的页面传递过来的时候,这个时候需要做对其当前页的判断
//        if (currentPage == null || "".equals(currentPage)){
//            currentPage = "1";
//        }
//
//        System.out.println("当前页码是:"+currentPage);
//        System.out.println("每页的条数是:"+ rows);
//
//        //2.调用service进行查询
//        ProductService service = new ProductServiceImpl();
//        PageBean<Product> pb = service.findUserByPage(currentPage,rows);
//
//        System.out.println(pb.getTotalPage()+"***************");
//
//        //3.将pageBean存入到域对象中
//        request.setAttribute("pb",pb);
//        //4.转发到list.jsp页面中去
//        request.getRequestDispatcher("/studentResult.jsp").forward(request,response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//
//}
