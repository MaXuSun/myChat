<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<%
  pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link href="${APP_PATH}/static/sources/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" media="all">
<link href="${APP_PATH}/static/sources/css/snow.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="${APP_PATH}/static/sources/css/style.css" rel="stylesheet"
	type="text/css" media="all" />
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
		<a href="index.jsp">登录</a><a href="#" class="active">注册</a>
	</div>
	<div class="main-agileits">
		<!--form-stars-here-->
		<div class="form-w3-agile">
			<h2 class="sub-agileits-w3layouts">注册</h2>
			<form action="#" method="post">
				<input type="text" name="Username" placeholder="用户名" required="" />
				<input type="password" name="Password" placeholder="密码" required="" />
				<div class="submit-w3l">
					<input type="submit" value="注册">
				</div>
			</form>
		</div>
	</div>
	<!--//form-ends-here-->
	<!-- copyright -->
	<div class="copyright w3-agile">
		<p>
			© 2017 Internship Sign In & Sign Up Form . All rights reserved |
			Design by <a href="#">W3layouts</a>
		</p>
	</div>
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
</body>
</html>