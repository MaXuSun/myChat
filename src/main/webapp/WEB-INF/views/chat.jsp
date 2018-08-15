<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<%
  pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet"
	href="${APP_PATH}/static/plugins/layui/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">MXChat网页聊天</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="#"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img"> 贤心
				</a></li>
				<li class="layui-nav-item"><a href="index.jsp">注销</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:;">好友列表</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">好友1</a>
							</dd>
							<dd>
								<a href="javascript:;">好友2</a>
							</dd>
							<dd>
								<a href="javascript:;">好友3</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">群组列表</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">群1</a>
							</dd>
							<dd>
								<a href="javascript:;">群2</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="">个人信息</a></li>
					<li class="layui-nav-item"><a href="">关于</a></li>
					<li class="layui-nav-item"><a href="">系统消息</a></li>
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:;">娱乐</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">五子棋</a>
							</dd>
							<dd>
								<a href="javascript:;">#字棋</a>
							</dd>
							<dd>
								<a href="javascript:;">聊天机器人</a>
							</dd>
						</dl></li>
				</ul>
			</div>
		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">内容主体区域</div>
		</div>
	</div>
	<script src="${APP_PATH}/static/plugins/layui/layui.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>
</body>
</html>