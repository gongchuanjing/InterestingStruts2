<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:actionerror/>
	<form action="${pageContext.request.contextPath}/user_login" method="post">
		USERNAME:<input type="text" name="username"><br>
		PASSWORD:<input type="password" name="password"><br>
		<input type="submit" value="登录">
	</form>
</body>
</html>