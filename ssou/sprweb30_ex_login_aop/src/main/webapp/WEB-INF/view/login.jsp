<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>* 고객 로그인 *</p>
<form action="login" method="post">
<table>
	<tr>
		<td>고객이름</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><input type="text" name="jumin"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit"></td>
	</tr>
</table>
</form>
</body>
</html>