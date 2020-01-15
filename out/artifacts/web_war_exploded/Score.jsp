<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>成绩</title>
    <style type="text/css">
        #kk {
            margin: 0;
            padding: 0;
            padding-left: 650px;
            padding-top: 100px;

        }
    </style>
</head>
<body>
<div id="kk">
    <span>你已完成考试！！！</span>
    <br>
    <span>
				选择题得分为：${Score.xztscore}
			</span>
    <br>
    <span>
				填空题得分为：${Score.tktscore}
			</span>
    <br>
    <span>
				本次考试的试卷名为：${Score.papername}
			</span>
    <br>
    <h1>你(用户名为${Score.username})的总分为：${Score.xztscore+Score.tktscore}</h1>

</div>

</body>
</html>
