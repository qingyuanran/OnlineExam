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
      	#href{
      		text-decoration: none;
      	}
      </style>
   		<script type="text/javascript">
   			window.onload=function(){
   				var href=document.getElementById("href");
   				href.onclick=function(){
   					//top.location.reload();
   				}
   			}
   		</script>
    </head>
      
    <body>
    	<div>
	 			<table class="tt" border="1px solid" cellspacing="0">
					<tr>
						<th>考试号&nbsp;</th>
						<th>开始时间&nbsp;&nbsp;</th>
						<th>结束时间&nbsp;&nbsp;</th>
						<th>试卷名&nbsp;&nbsp;</th>
					</tr>
	 				<!--获取将来考试信息的集合 -->
					<%int a=1;%>
	 					<c:forEach items="${PaperNow}" var="pn">
	 				<tr>
						<td><%out.println(a++ );%></td>
	 				  <td>${pn.starttime}</td>
	 				  <td>${pn.endtime}</td>
	 				  <td>${pn.papername}</td>

	 				 <td><a href="../DoExam?papername=${pn.papername}" id="href" target="top">加入考试</a><td>  	
	 				</tr>
	 			    </c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>