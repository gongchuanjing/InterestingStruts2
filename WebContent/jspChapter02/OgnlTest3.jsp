<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("aaa", "java");
		session.setAttribute("bbb", "ios");
	%>
	<h1>#号用法</h1>
	<s:property value="#request.aaa" /><br>
	<s:property value="#session.bbb" /><br>
	
	<!-- http://127.0.0.1:8080/InterestingStruts2/jspChapter02/OgnlTest3.jsp?username=abc -->
	<s:property value="#parameters.username" /><br>
	<hr>
	
	
	<h2>%号用法</h2>
	<s:property value="%{#request.aaa}" /><br><!-- 会解析成ognl-->
	<s:property value="%{'#request.aaa'}" /><br><!-- 不会解析ognl -->
	
	<s:debug />
</body>
</html>