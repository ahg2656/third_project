<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>* 회원 자료(@MVC - Mybatis(crud)) *</p>
&nbsp;&nbsp;<a href="insert">추가</a><br>
<table border="1">
	<tr><th>번호</th><th>이름</th><th>주소</th><th>변경</th></tr>
	<c:forEach var="m" items="${list}">
	<tr>
		<th>${m.num}</th>
		<td>${m.name}</td>
		<td>${m.addr}</td>
		<td>
			<a href="update?num=${m.num}">수정</a>&nbsp;
			<a href="delete?num=${m.num}">삭제</a>
		</td>
	</tr>
	</c:forEach>
	<tr><td colspan="4" style="text-align: right">인원수 : ${list.size()}</td></tr>
</table>
</body>
</html>