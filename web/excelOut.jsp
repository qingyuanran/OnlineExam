
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="com.neuq.bean.StudentGrade" %>

<% String wjm = "StudentGrade.xls";
    response.setContentType("application/vnd.ms-excel;charset=utf-8");
    response.setHeader("content-disposition", "attachment; filename=" + wjm);%>
<html>
<head>

    <title>Excel导出</title>

</head>
<body>
<table align="left" border="2">
    <thead>
    <tr bgcolor="white">
        <th>序号</th>
        <th>用户名</th>
        <th>选择题得分</th>
        <th>填空题得分</th>
        <th>编程题得分</th>
        <th>总分</th>
        <th>试卷名称</th>
    </tr>
    </thead>
    <tbody>
    <%
        //循环显示数据
        List<StudentGrade> list = (List) session.getAttribute("studentgrade"); // 取request里面的对象队列
        int j = 1;
        for (int i = 0; i < list.size(); i++) {
            pageContext.setAttribute("sg", list.get(i));
            //保存到页面pageContext里面方便下面进行EL表达式调用
    %>
    <tr>
        <td>
            <%=i + 1%>
        </td>
        <td>
            ${sg.username}
        </td>
        <td>
            ${sg.xztscore}
        </td>
        <td>
            ${sg.tktscore}
        </td>
        <td>
            ${sg.bctscore}
        </td>
        <td>
            ${sg.xztscore+sg.tktscore+sg.bctscore}
        </td>
        <td>
            ${sg.papername}
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
