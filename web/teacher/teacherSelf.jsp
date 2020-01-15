<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <meta charset="utf-8" />
		<link rel="stylesheet" href="css/teacherSelf.css" />
		<title>教师个人中心</title>
	</head>
	<body class="b">
	
		<div class="naver">
			<a href="index.jsp"><p>在线考试系统</p></a>
		</div>
		<div class="content">
		<div class="main">
			<table class="m1">
				<tr>
					<td>
						<p id="fp">基本信息</p>
					</td>
				</tr>
			</table>
			<hr class="h" color="grey"/>
			<form action="../UploadSelfInfo?usertype=2" method="post">
			  <table class="m2">
			  	<tr height="60px">
			  		<td><p>用户名</p></td>
			  		<td>
			  		  <input type="text" name="username" value="${Teacher.username}" style="width:200px height: 100px;"/>
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>密码</p></td>
			  		<td>
			  		  <input type="password" value="${Teacher.pwd}" name="pwd" />
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>姓名</p></td>
			  		<td>
			  		  <input type="text" value="${Teacher.name}" name="name" />
			  		</td>
			  	</tr>
			  	
			  	<tr height="20px">
			  		<td><p>性别</p></td>
			  		<td>
			  		  男<input type="radio" name="usex"  value="${Teacher.sex}" checked style="height: 20px; width: 100px;">&nbsp;
			  		 女<input type="radio" name="usex"  value="${Teacher.sex}" style="height: 20px; width: 100px;">
			  		</td>
			  	</tr>
			  	  <tr height="60px">
			  		<td><p>手机号</p></td>
			  	  	<td>
			  			<input type="text" value="${Teacher.telephone}" name="telephone" />
			  		</td>
			  	  </tr>
			  	  <tr height="60px">
			  		<td><p>邮箱</p></td>
			  	  	<td>
			  			<input type="text" value="${Teacher.email}" name="email" />
			  		</td>
			  	  </tr>
			  	  <tr>
			  	  	<td >
			  	  		<input type="submit" value="保存" style="width: 60px;" />	
			  	  	</td>
			  	  	<td>
			  	  		<input type="submit" value="返回主页 "style="width: 80px;" />
			  	  	</td>
			  	  </tr>
			  </table>
			</form>	
		</div>
		</div>
		<div class="footer">
			<div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己</div>
		</div>
 	</body>
</html>