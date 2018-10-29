<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>* 직원 정보 *</p>
<% 
if(session.getAttribute("name") != null) {
	out.print("<a href='logout'>로그아웃</a>");
}
%>
<table border="1">
	<tr><th>직원명</th><th>부서명</th><th>직급</th><th>부서전화</th><th>성별</th></tr>
		<tr>
			<td>${jikwon.jikwon_name}</td>
			<td>${jikwon.buser_name}</td>
			<td>${jikwon.jikwon_jik}</td>
			<td>${jikwon.buser_tel}</td>
			<td>${jikwon.jikwon_gen}</td>
		</tr>
</table>
</body>
</html>