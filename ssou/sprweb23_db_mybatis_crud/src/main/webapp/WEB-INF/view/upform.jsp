<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 자료 수정 **<br>
<form action="update" method="post">
번 호 : ${dto.num}<br>
<input type="hidden" name="num" value="${dto.num}">
이 름 : <input type="text" name="name" value="${dto.name}"><br>
주 소 : <input type="text" name="addr" value="${dto.addr}"><br>
<input type="submit" value="수정">&nbsp;<input type="button" value="뒤로" onclick="history.back()">
</form>
</body>
</html>