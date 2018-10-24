<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>상품자료(전통적 방법)</h2>
		<table border="1">
			<tr>
				<th>코드</th><th>상품명</th><th>수량</th><th>단가</th>
			</tr>
			<c:forEach var="s" items="${message}">
			<tr>
				<td>${s.code}</td>
				<td>${s.sang}</td>
				<td>${s.su}</td>
				<td>${s.dan}</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>
