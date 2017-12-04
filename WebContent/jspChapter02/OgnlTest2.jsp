<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
	<s:property value="name" />
	<hr>
	<s:property value="[1].top" />
	<hr>
	--%>
	<!-- http://127.0.0.1:8080/InterestingStruts2/ValueStackAction?username=nnn&password=999 -->
	<s:property value="username" />
	<hr>
	<s:property value="password" />
	<hr>
	<hr>
	<s:property value="model.username" />
	<hr>
	<s:property value="model.password" />
	<hr>
	
	
	<br/>
	<br/>
	<br/>
	<hr>
	${ username }		<br/>
	${ password }		<br/>
	${ model.username }	<br/>
	${ model.password }	<br/>
	
	<s:debug />
</body>
</html>