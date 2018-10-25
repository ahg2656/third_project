<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
* 회원 상세보기 *<br>
<table>
	<tr><td>아 이 디 : ${member.id}</td></tr>
	<tr><td>비밀번호 : ${member.passwd}</td></tr>
	<tr><td>회 원 명 : ${member.name}</td></tr>
	<tr><td>등 록 일 : ${member.reg_date}</td></tr>
	<tr>
		<td colspan="2">
			<a href="list">목록</a>
			<a href="update?id=${member.id}">수정</a>
			<a href="delete?id=${member.id}">삭제</a>
		</td>
	</tr>
</table>
</body>
</html>