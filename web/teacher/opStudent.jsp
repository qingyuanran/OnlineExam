<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page contentType="text/html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>管理学生</title>
        <link rel="stylesheet" href="css/opStudent.css" />
    </head>
    <body>
    	<div class="header">
    		<a href="index.jsp"><p>在线考试系统</p></a>
    	</div>
    	<div class="main">
    		<form name="form1" method="post" action="../DeleteUser?username=${stu.username}">
    		<table class="m01">
    			<tr>
    				<td><p class="js">学生信息</p></td>
    			</tr>
    		</table>
    		<hr />
    		<table class="t" border="1px solid black">
    			<tr>
    			  <th>序号</th>
    			  <th>用户名</th>
    			  <th>班级</th>
    			  <th>性别</th>
    			  <th>电话</th>
    			  <th>邮箱</th>
    			  <th>操作</th>
    			</tr>
				<%int a=1;%>
    			<c:forEach items="${STU}" var="stu">
    			<tr>
    				<td><%out.print(a++ );%></td>
    				<td>${stu.username}</td>
    				<td>${stu.studentclass}</td>
    				<td>${stu.sex}</td>
    				<td>${stu.telephone}</td>
    				<td>${stu.email}</td>
    				<td>
    					
    				<center>&nbsp;<button class="b" id="b2">删除</button>&nbsp;
    		            </center>
    		            
    				</td>    				
    			</tr>
    			</c:forEach>
    		</table>
    		</form>
    		</div>
    	
    	<div class="footer">
    		<div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己</div>
    	</div>

    		
 	</body>
</html>