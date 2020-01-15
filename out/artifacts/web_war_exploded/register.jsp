﻿
<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="login-alone">
    <head>
        <title>注册页</title>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
        <link rel="shortcut icon" type="image/x-icon" href="res/homepage/favicon.ico?v=3.9" />
        <link href="css/screen.css?v=3.9" media="screen, projection" rel="stylesheet" type="text/css" >
        <link rel="stylesheet" type="text/css" href="css/base.css?v=3.9">
        <link rel="stylesheet" type="text/css" href="css/register.css?v=3.9">
        <script type="text/javascript" src="js/register.js"></script>
    </head>
    <body>  
       <div class="header">
			<p>在线考试系统</p>
		</div>
        <div class="logina-main main clearfix">
            <div class="tab-con">
                <form id="formregister" name="formregister" method="post" onSubmit="return myCheck()"action="Register" >
                
                    <div id='login-error' class="error-tip"></div>
                    <table border="0" cellspacing="0" cellpadding="0">
                        <tbody>
                            <tr>
                                <th>用户名</th>
                                <td width="245">
                                    <input id="username" type="text" name="username" placeholder="请输入用户名" autocomplete="off" 
                                    	value="" onblur="javascript:checkuname()">
                                </td>
                                <td>
                                	<span></span>
                                </td>
                            </tr>
                            <tr>
                                <th>姓名</th>
                                <td width="245">
                                    <input id="realname" type="text" name="realname" placeholder="请输入真实姓名" 
                                    autocomplete="off" value="" onblur="javascript:checkrealname()">
                                </td>
                                <td>
                                	<span></span>
                                </td>
                            </tr>
                            <tr>
                                <th>班级</th>
                                <td width="245">
                                    <input id="clas" type="text" name="class" placeholder="请输入所在班级"
                                     autocomplete="off" value="" onblur="javascript:checkclass()">
                                </td>
                                <td>
                                	<span></span>
                                </td>
                            </tr>
                            <tr>
                                <th>密码</th>
                                <td width="245">
                                    <input id="pwd" type="password" name="pwd" placeholder="请输入密码" 
                                    autocomplete="off" onblur="javascript:checkpwd()">
                                </td>
                                <td>
                                	<span></span>
                                </td>
                            </tr>
                            <tr>
                                <th>再次输入</th>
                                <td width="245">
                                    <input id="pwd2" type="password" name="pwd2" placeholder="请再次输入密码" 
                                    autocomplete="off"onblur="javascript:checkpwd2()">
                                </td>
                                <td>
                                	<span></span>
                                </td>
                            </tr>
                            <tr>
                                <th></th>
                                <td width="245">
                                	<input class="confirm" type="submit" value="注  册">
                                </td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                    <input type="hidden" name="refer" value="site/">
                </form>
            </div>
            <div class="reg" style="boder:1px red double">
                <p>已有账号？<br>快去登陆吧！</p>
                <a class="reg-btn" href="login.jsp">立即登陆</a>
            </div>
        </div>
        <div id="footer">
            <div class="copyright">世界上任何书籍都不能给你带来好运，但是它们能让你悄悄变成你自己</div>
        </div>      
    </body>
</html>