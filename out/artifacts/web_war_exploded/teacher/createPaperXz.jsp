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
	<form action="../Designtest?type=2" method="post" id="lsy">
		<div>

			<table id="tab1" style="height: 100%;width:100%;border:1px solid red;">
				<tr>
					<td id="xz">一、选择题(请在以下选择题中选择10道)</td>
				</tr>
				<%int a=1;%>

				<c:forEach items="${XZTLIST}" var="xl">

					<tr>
						<td colspan="2" id="xztitle">
							<input type="checkbox" name="name" id="" value="${xl.question}" /><%out.print(a++ +". ");%>${xl.question}&nbsp;

						</td>
					</tr>
					<tr >
						<td class="xzchoose">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A  ${xl.optionA}
						</td>
					</tr>
					<tr>
						<td class="xzchoose">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;B  ${xl.optionB}</td>
					</tr>
					<tr>
						<td class="xzchoose">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;C  ${xl.optionC}</td>
					</tr>
					<tr>
						<td class="xzchoose">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;D  ${xl.optionD}</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: right;" class="xzchoose">
							正确答案：${xl.answer}
						</td>
					</tr>

				</c:forEach>

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