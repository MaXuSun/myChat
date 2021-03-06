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
<script type="text/javascript"
	src="${APP_PATH}/static/sources/js/jquery-2.1.4.min.js"></script>
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
			<form id="signup_form">
				<input type="text" name="username" placeholder="用户名" required="" />
				<input type="password" name="password" placeholder="密码" required="" />
			</form>
			<div class="submit-w3l">
				<input type="submit" id="signup_button" value="注册">
			</div>
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
	<script type="text/javascript">
		$(function() {
			$("#signup_button").click(function() {
				alert("dasfas");
				var h = $("#signup_form").serialize();
				alert(h);
				$.ajax({
					url : "${APP_PATH}/signup",
					type : "POST",
					data : $("#signup_form").serialize(),
					success : function(result) {
						console.log(result);
						alert(result);
					}
				})
			});
		});
	</script>
</body>
</html>