<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>学生主页</title>
		<link href="../css/slideshow.css" rel="stylesheet" />
		<link href="../css/studentIndex.css" rel="stylesheet" />
		<script src="../js/slideshow.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="header">
			<p>在线考试系统</p>
		</div>
		<div id="nave">
			<table id="tab1">
				<tr>
					<td id="td1">
						欢迎学生${sessionScope.Student.username}登录
					</td>
					<td style="text-align: center;">|</td>
					<td id="td11"><a href="../Logout"><p style="font-size:17px">退出</p></a></td>
				</tr>
			</table>
		</div>
		
		<!--下面是轮播图部分-->
		<div class="comiis_wrapad" id="slideContainer">
        <div id="frameHlicAe" class="frame cl">
            <div class="block">
                <div class="cl" >
                    <ul class="slideshow" id="slidesImgs" >
                        <li><a href="#" target="_blank">
                            <img src="../images/lb01.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="../images/lb02.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="../images/lb03.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="../images/lb04.PNG" width="1040" height="390" alt="" /></a></li>
                    </ul>
                </div>
                <div class="slidebar" id="slideBar">
                    <ul>
                        <li class="on">1</li>
                        <li>2</li>
                        <li>3</li>
                        <li>4</li>
                    </ul>
                </div>
            </div>
        </div>
        </div>
    	<script type="text/javascript">
        	SlideShow(3000);
    	</script>
    	<!--图片轮播结束-->
    	<!--学生选项-->
    	<div id="main">
    		<table id="tab2">
    			<tr>
    				<td class="tdd1">
    					<a href="../MistakeCollect?">
    						<img src="../images/stu1.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="../ShowPaper">
    						<img src="../images/stu2.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="../ShowMygrade?username=${sessionScope.Student.username}">
    						<img src="../images/stu3.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="selfTest0.jsp">
    						<img src="../images/stu5.jpg" style="width:100px;height:100px"/>
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="StudentSelf.jsp">
    						<img src="../images/stu4.jpg" />
    					</a>
    				</td>
    			</tr>
    			<tr>
    				<td class="tdd2">
    					<a href="../MistakeCollect">我的错题</a>
    				</td>
    				<td class="tdd2">
    					<a href="../ShowPaper">查看考试</a>
    				</td>
    				<td class="tdd2">
    					<a href="../ShowMygrade">查看成绩</a>
    				</td>
    				<td class="tdd2">
    					<a href="selfTest0.jsp">自测</a>
    				</td>
    				<td class="tdd2">
    					<a href="StudentSelf.jsp">个人中心</a>
    				</td>
    			</tr>
    		</table>
    	</div>
    	
    	
		<div id="footer">
            <div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己
</div>
        </div>
	</body>
</html>
