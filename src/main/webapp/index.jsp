<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <jsp:forward page="/chat"></jsp:forward> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
<%
  pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%
  Object user = session.getAttribute("user");
			Object msg = session.getAttribute("msg");
%>
<% 
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
		<a href="#" class="active">登录</a><a id="signup" href="signup.jsp">注册</a>
	</div>
	<h1>登陆</h1>
	<div class="main-agileits">
		<!--form-stars-here-->
		<div class="form-w3-agile">
			<h2 class="sub-agileits-w3layouts">登录</h2>
			<form method="post" action="chat">
				<input type="text" name="username" placeholder="用户名" /> <input
					type="password" name="password" placeholder="密码" />
				<div class="submit-w3l">
					<input type="submit" value="登录" id="login">
				</div>
				<p class="p-bottom-w3ls">
					<a href="#">忘记密码？</a>点此找回密码
				</p>
			</form>
		</div>
	</div>
	<div class="copyright w3-agile">
		<p>
			© 2017 Internship Sign In & Sign Up Form . All rights reserved |
			Design by <a href="#">W3layouts</a>
		</p>
	</div>

	<script type="text/javascript">
		$("#login").click(function(){
			var h = '<%=msg%>';
			alert(h);
		});
	</script>

</body>
</html>