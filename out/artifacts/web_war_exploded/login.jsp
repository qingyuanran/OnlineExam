﻿<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="javax.servlet.http.HttpSession" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>登录页</title>
		<meta name="keywords" content="登录页面" />
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
        <link rel="shortcut icon" type="image/x-icon" href="res/homepage/favicon.ico?v=3.9" />
        <link href="css/screen.css?v=3.9" media="screen, projection" rel="stylesheet" type="text/css" >
        <link rel="stylesheet" type="text/css" href="css/base.css?v=3.9">
        <link rel="stylesheet" type="text/css" href="css/login.css?v=3.9">
		<script type="text/javascript" src="js/checkCode.js"></script>
    </head>
    <body>
    <% Cookie[] cs = request.getCookies();
    String username="";
    String password="";
    if(cs.length != 0){
    	for(int i = 0;i < cs.length;i++){
    		Cookie c  = cs[i];
    		if("un".equals(c.getName())){
    			username = c.getValue();
    		}
    		 if("password".equals(c.getName()))
    	       {
    	         password=c.getValue();
    	       }
    	}
    }
    
    %>
        <div class="header">
			<p>在线考试系统</p>
		</div>
        <div class="logina-main main clearfix">
            <div class="tab-con">
              <form id="form01" name="form01" action="Login" method="post" onSubmit="return myCheck()"> 
                    <div id='login-error' class="error-tip"></div>
                    <table border="0" cellspacing="0" cellpadding="0">
                        <tbody>
                            <tr>
                                <th>用户名</th>
                                <td width="245">
                                    <input id="username" type="text" name="username" placeholder="请输入用户名" autocomplete="off" value="${cookie.username.value }"></td>
                                <td>
                                </td>
                            </tr>
                            <tr>
                                <th>密码</th>
                                <td width="245">
                                    <input id="password" type="password" name="password" placeholder="请输入密码" autocomplete="off" value="${cookie.password.value }">
                                </td>
                                <td>
                                </td>
                            </tr>
                            <tr id="tr-vcode" style="display" >
                                <th>验证码</th>
                                <td width="245">
                                    <div class="valid">
									<input name="vcode" id="vcode" type="text" onblur="check()" onfocus="delData()" placeholder="请输入验证码";>
									<span id="verSpan"></span>
									<img id="codeImg" src="code" alt="点击换一张" onclick="javascript:reloadcode()" width="85" height="35" alt="" />
              
                                    </div>
                                </td>
                             
                            </tr>

                            <tr class="find">
                                <th></th>
                                <td>
                                    <div>
                                        <label class="checkbox" for="chk11"><input style="height: auto;" id="chk11" type="checkbox" name="remember_me" >记住我</label>
                                        <a href="passport/forget-pwd">忘记密码？</a>
                                    </div>
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <th></th>
                                <td width="245"><input class="confirm" type="submit" value="登  录"></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                    <input type="hidden" name="refer" value="site/">
                </form>
            </div>
            
            <div class="reg">
            	<!-- 竖线 -->
            	<table id="tab1" >
            		<tr><td valign="top"></td></tr>
            	</table>
                <p>还没有账号？<br>赶快免费注册一个吧！</p>
                <a class="reg-btn" href="register.jsp">立即免费注册</a>
            </div>
        </div>
        <div id="footer">
            <div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己</div>
        </div>	
    </body>
</html>