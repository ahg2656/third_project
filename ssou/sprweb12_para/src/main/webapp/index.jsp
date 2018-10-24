<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		** 자료 입력 **<br>
		<form action="sangpum" method="post">
			품명 : <input type="text" name="sang"><br>
			수량 : <input type="text" name="su"><br>
			단가 : <input type="text" name="dan"><br>
			<input type="submit" value="입력">
		</form>
		
	</body>
</html>
