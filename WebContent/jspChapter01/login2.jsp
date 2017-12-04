<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${ pageContext.request.contextPath }/LoginServlet" method="post">
		账号：<input type="text" name="username" /><br>
		密码：<input type="password" name="password" /><br>
		<input type="submit" value="登陆" />
	</form>
	
	<hr>
	
	使用struts2框架：
	<form action="${ pageContext.request.contextPath }/LoginAction2" method="post">
		账号：<input type="text" name="username" /><br>
		密码：<input type="password" name="password" /><br>
		<input type="submit" value="登陆" />
	</form>
</body>
</html>