<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
<%
  pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link href="${APP_PATH}/static/sources/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
<link href="${APP_PATH}/static/sources/css/snow.css" rel="stylesheet" type="text/css" media="all" />
<link href="${APP_PATH}/static/sources/css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div class="snow-container">
		<div class="snow foreground"></div>
		<div class="snow foreground layered"></div>
		<div class="snow middleground"></div>
		<div class="snow middleground layered"></div>
		<div class="snow background"></div>
		<div class="snow background layered"></div>
	</div>

	<div class="top-buttons-agileinfo">
		<a href="index.html" class="active">登录</a><a href="views/signup.jsp">注册</a>
	</div>
	<h1>登陆</h1>
	<div class="main-agileits">
		<!--form-stars-here-->
		<div class="form-w3-agile">
			<h2 class="sub-agileits-w3layouts">登录</h2>
			<form action="#" method="post">
				<input type="email" name="Eamil" placeholder="用户" required="" /> <input
					type="password" name="Password" placeholder="密码" required="" />
				<div class="submit-w3l">
					<input type="submit" value="登录">
				</div>
				<p class="p-bottom-w3ls">
					<a href="#">忘记密码？</a>点此找回密码
				</p>
			</form>
		</div>
	</div>
	<!--//form-ends-here-->
	<!-- copyright -->
	<div class="copyright w3-agile">
		<p>
			© 2017</a>
		</p>
	</div>
	<script type="text/javascript" src="${APP_PATH}/static/sources/js/jquery-2.1.4.min.js"></script>

</body>
</html>