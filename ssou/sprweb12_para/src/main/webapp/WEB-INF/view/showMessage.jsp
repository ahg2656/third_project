<!DOCTYPE html>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>${message}</h2>
		<hr>
		참고사항<br>
		view 에서 ${sangpumBean.sang}<br>
		별명으로 호출 ${my.sang}
		<br>
		<%
		ArrayList<String> list = (ArrayList<String>)request.getAttribute("ourlist"); 
		for(String s : list){
			out.print(s + "&nbsp;&nbsp;");
		}
		%>
		<br>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<c:forEach var="s" items="${ourlist}">
			${s}&nbsp;&nbsp;
		</c:forEach>
	</body>
</html>
