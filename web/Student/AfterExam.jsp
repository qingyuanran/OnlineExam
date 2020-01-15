<%@ page language="java" 
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
        	.tt{
        		
        		margin: 0 auto;
        		margin-top: 40px;
        		border-color: gainsboro;
        	}
        </style>
    </head>
    <body>
    	<div>
	 			<table class="tt" border="1px solid" cellspacing="0">
	 				<!--获取后台 将来的考试信息-->
	 				<tr>
	 					<th>考试号&nbsp;</th>
	 					<th>开始时间&nbsp;&nbsp;</th>
	 					<th>结束时间&nbsp;&nbsp;</th>
	 					<th>试卷名&nbsp;&nbsp;</th>
	 				</tr>
					<%int a=1;%>
	 				<c:forEach items="${PaperAfter}" var="pf">
	 				<tr>
						<td><%out.println(a++ );%></td>
	 				  <td>${pf.starttime }</td>
	 				  <td>${pf.endtime }</td>
	 				  <td>${pf.papername }</td>
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>