<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src="/InterestingStruts2/js/jquery-1.8.3.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#a").toggle(function(){
					
					//向服务器发送请求，得到商品信息，并展示
					$.post("${ pageContext.request.contextPath }/product_showProduct",function(data){
						
						//1.通过eval将data转换成js对象
						var objResult = eval(data);
						if(objResult.type == 1){
							var objContent = objResult.content;
							
							//2.得到html
							var html = "<table border='1'><tr><td>编号</td><td>名称</td><td>单价</td><td>上架时间</td></tr>";
							
							//3.遍历jsonObj添加商品信息到html
							for(var i=0; i<objContent.length; i++){
								html += "<tr><td>"+objContent[i].pid+"</td><td>"+objContent[i].pname+"</td><td>"+objContent[i].market_price+"</td><td>"+objContent[i].pdate+"</td></tr>";
							}
							
							html += "</table>";
							
							//4.将html代码展示
							$("#d").html(html);
						} else {
							alert(objResult.message);
						}
						
					},"json");
					
				}, function(){
					//将div中的信息清空
					$("#d").html("");
				});
			});
		</script>
	</head>
	
	<body>
		<a href="javascript:void(0)" id="a">查看商品信息</a>
		<div id="d"></div>
	</body>
</html>