<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加试题</title>
        <link rel="stylesheet" type="text/css" href="css/addQuestion.css"/>
		<script language="JavaScript">
				if (window != top)
					top.location.href = location.href;
		</script>
    </head>
    <body style="height: 800px;">
    	<div class="header">
			<a href="index.jsp"><p>在线考试系统</p></a>
		</div>
		<div id="nave">
			<table id="tab1">
				<tr>
					<td id="td1">
						当前位置：添加试题
					</td>
				</tr>
			</table>
		</div>
		<!--main部分-->
		<div id="main">
			<!--left部分-->
			<div id="left">
				<table id="tab2">
					<tr>
						<td class="con">
							<a href="addXzt.jsp" >添加选择题</a>
						</td>
					</tr>
					<tr>
						<td class="con">
							<a href="addTkt.jsp">添加填空题</a>
						</td>
					</tr>
					<tr>
						<td class="con">
							<a href="addBct.jsp">添加编程题</a>
						</td>
					</tr>
					<tr>
						<td class="con">
							<a href="addMach.jsp">批量上传</a>
						</td>
					</tr>
				</table>
			</div>

			<!--right部分-->
			<div id="right">
				<form action="../InsertQuestion?questiontype=xzt" method="post" target="if">
				<iframe src="addXzt.jsp" width="855px" height="600px"  frameborder="0" scrolling="no" name="if"></iframe>
				</form>
			</div>
			
			<!--清浮动-->
			<div class="clear"></div>
			
		</div>
		
		<div id="footer">
            <div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己</div>
        </div>
 	</body>
</html>