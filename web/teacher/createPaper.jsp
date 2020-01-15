<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>教师出卷</title>
        <link rel="stylesheet" type="text/css" href="css/createPaper.css"/>
		<script type="text/javascript">
			function subChecked(){
				alert("是否确认出卷？");
				document.getElementById("lsy").submit();

			}
		</script>
    </head>
    <div class="header">
		<a href="index.jsp"><p>在线考试系统</p></a>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table>
			<tr id="tr1">
				<!--这里需要添加js事件-->
				<td class="td1">
					<a href="createPaperXz.jsp" target="if">选择题</a>
				</td>
				<td class="td1">
					<a href="createPaperTk.jsp" target="if">填空题</a>
				</td>
				<td class="td1">
					<a href="createPaperBc.jsp" target="if">编程题</a>
				</td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
		<form action="../Designtest?type=3" method="post" id="lsy">
			<div>

				<table id="tab2">
					<tr>
						<td class="tk">二、填空题(请在以下填空题中选择5道)</td>
					</tr>
					<%int a=1;%>
					<form action="Designtest?type=3" method="post">
						<c:forEach items="${TKLIST}" var="tk">
							<tr>
								<td class="tktitle">
									<input type="checkbox" name="" id="" value="${tk.question}" /><%out.print(a++ +". ");%>${tk.question}
								</td>
							</tr>
							<tr>

								<td class="tkcon">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;答案: ${tk.answer}
								</td>
							</tr>
						</c:forEach>
					</form>
				</table>
			</div>
		</form>
		<!--确认出卷-->
		<table id="tab4">
			<tr>
				<td style="width: 770px; text-align: center;"></td>
				<td style="width: 100px; text-align: center;">
					<input type="submit" value="确认出卷" onclick="subChecked()"/>
				</td>
			</tr>
		</table>
	</div>
	<!--main结束-->
	
	
	<div id="footer">
        <div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己</div>
    </div>
    <div class="top">
		<a href="#" title="返回顶部"><img src="../images/top.png"></a>
	</div>
 	</body>

	<script>

		function iframeLoad() {
			document.getElementById("tab1").height=0;
			document.getElementById("tab1").height=document.getElementById("tab1").contentWindow.document.body.scrollHeight +100;
		}
	</script>
</html>