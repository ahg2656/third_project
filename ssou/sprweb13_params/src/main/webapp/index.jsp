<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
* 요청파라미터 연습 *<p />
<a href="kic/login?type=admin">관리자</a>
<a href="kic/login?type=user">일반인</a>
<a href="kic/login">파라미터 없음</a>
<br>
<form action="kic/login" method="post">
	data : <input type="text" name="type"><br>
	<input type="submit" value="전송1">
</form>
<br>
<form action="kic/korea" method="post">
	data : <input type="text" name="type"><br>
	<input type="submit" value="전송2">
</form>
<br>
<form action="ent/yg/singer/psy" method="post">
	타이틀 송 : <input type="text" name="title" value="챔피언"><br>
	<input type="submit" value="전송3">
</form>
<br>
<form action="ent/sm/singer/lsm" method="post">
	타이틀 송 : <input type="text" name="title" value="사랑하고"><br>
	<input type="submit" value="전송4">
</form>
</body>
</html>
