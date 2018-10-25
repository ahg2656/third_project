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
<p>직원자료 출력 - 부서별 이름 정렬</p>
<table border="1">
	<tr>
		<th>사번</th>
		<th>이름</th>
		<th>부서명</th>
		<th>직급</th>
		<th>입사년</th>
	</tr>
	<c:forEach var="j" items="${data}">
		<tr>
			<td>${j.jikwon_no}</td>
			<td>${j.jikwon_name}</td>
			<td><a href="buser?code=${j.buser_no}" target="info">${j.buser_name}</a></td>
			<td>${j.jikwon_jik}</td>
			<td>${j.jikwon_ibsail}</td>
		</tr>
	</c:forEach>
	<tr><td colspan="5" style="text-align: right">인원수 : ${data.size()}</td></tr>
	<tr>
		<td colspan="5">
			<form action="search" method="post" style="text-align: center;">
				부서별
				<select name="buser">
					<option value="all">전체</option>
					<c:forEach var="b" items="${buserlist}">
						<c:if test="${b.buser_no == no}">
							<option value="${b.buser_no}" selected="selected">${b.buser_name}</option>
						</c:if>
						<c:if test="${b.buser_no != no}">
							<option value="${b.buser_no}">${b.buser_name}</option>
						</c:if>
					</c:forEach>
				</select>
				<input type="submit" value="검색">
			</form>
		</td>
	</tr>
</table>
<iframe src="" name="info" frameborder="0"></iframe>
</body>
</html>