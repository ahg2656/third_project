<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 회원 자료 **<p/>
<c:if test="${count == 0}">
출력자료가 없습니다.<br>
<a href="insert">추가</a>
</c:if>
<c:if test="${count > 0}">
	<table border="1">
		<tr><td colspan="2"><a href="insert">추가</a></tr>
		<tr>
			<th>아이디</th><th>이름</th>
		</tr>
		<c:forEach var="m" items="${list}">
			<tr>
				<td>${m.id}</td>
				<td><a href="detail?id=${m.id}">${m.name}</a></td>
			</tr>
			
		</c:forEach>
		<tr>
			<td colspan="2" style="text-align: center;">
				<c:set var="pageCount" value="${(count - 1)/pageSize + 1}" />
				<c:forEach var="p" begin="1" end="${pageCount}">
					<c:if test="${currentPage == p}">${p}</c:if>
					<c:if test="${currentPage != p}">
						<a href="list?pageNum=${p}">${p} </a>
					</c:if>
				</c:forEach>
			</td>
		</tr>
	</table>
</c:if>
</body>
</html>