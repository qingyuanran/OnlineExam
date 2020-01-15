<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>主页</title>
		<link href="css/slideshow.css" rel="stylesheet" />
		<link href="css/index.css" rel="stylesheet" />
		<link href="css/basic.css" type="text/css" rel="stylesheet" />
		<link href="css/style.css" type="text/css" rel="stylesheet" />
		<link rel="stylesheet" href="css/5imoban.css" type="text/css">
		<script src="js/slideshow.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="header">
			<p>在线考试系统</p>
		</div>
		<div id="nave">
			<table id="tab1">
				<tr>
					<td id="td1"></td>
					<td id="td2">
						<a href="login.jsp">登录</a>
					</td>
					<td width="5px"style="text-align: center;">|</td>
					<td id="td3">
						<a href="register.jsp">注册</a>
					</td>
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
                            <img src="images/lb01.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="images/lb02.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="images/lb03.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="images/lb04.PNG" width="1040" height="390" alt="" /></a></li>
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
    	<!--公告-->
    	<div id="main">
    	<div id="index_newslist" class="pc_overflow mt10 w980">
    	<div id="company_info_gsgg" class="fl pc_overflow">
        <dl>
            <dt class="pc_overflow"><b>最新公告</b><span>more+</span></dt>
            <dd>
            	<ul>
                	<li><a href="#" title="">湖南省2020年上半年全国计算机等级考试吉首...</a></li>
                	<li><a href="#" title="">关于做好2019级新生转专业工作的通知（教通[...</a></li>
                	<li><a href="#" title="">吉首大学对孙成辉等同学作退学处理的公示（...</a></li>
                	<li><a href="#" title="">关于申请2020年师范类专业认证评审结果的公...</a></li>
                	<li><a href="#" title="">关于2019-2020学年度第1学期吉首校区《大学...</a></li>
                	<li><a href="#" title="">吉首大学对罗光碑等学生作退学处理的公示（...</a></li>
                	<li><a href="#" title="">关于组织申报2019年度省级一流本科课程的通...</a></li>
                </ul>
            </dd>
        </dl>
    </div>
    <div id="company_info_yyys" class="fl pc_overflow">
        <dl>
            <dt class="pc_overflow"><b>复习攻略</b><span>more+</span></dt>
            <dd>
            	<ul>
                	<li><a href="#" title="">JAVA易考点</a></li>
                	<li><a href="#" title="">盘点计算机网路的难点</a></li>
                	<li><a href="#" title="">数据结构，你会了么？</a></li>
                	<li><a href="#" title="">操作系统知识巩固</a></li>
                	<li><a href="#" title="">高数课后习题解答</a></li>
                	<li><a href="#" title="">马克思选择题复习</a></li>
                	<li><a href="#" title="">英语听力模拟试题</a></li>
                </ul>
            </dd>
        </dl>
    </div>
    <div id="company_info_zxrx" class="fl pc_overflow">
        <dl>
            <dt class="pc_overflow"><b>考试动态</b><span>more+</span></dt>
            <dd>
            	<ul>
                	<li><a href="#" title="">11.02 教师资格证考试 </a></li>
                	<li><a href="#" title="">11.09 软件设计师考试 </a></li>
                	<li><a href="#" title="">2017级 web前端考试 </a></li>
                	<li><a href="#" title="">2017级 需求分析考试 </a></li>
                	<li><a href="#" title="">四六级考试 </a></li>
                	<li><a href="#" title="">ccf认证考试 </a></li>
                	<li><a href="#" title="">2017、2018级课设 </a></li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
<div class="border_bottom clear">&nbsp;</div>

    	</div>
		<div id="footer">
            <div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己</div>
        </div>
	</body>
</html>
