<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 자료 추가 **<br>
<sform:form commandName="command">
아 이 디 : <sform:input path="id"/><br>
비밀번호 : <sform:input path="passwd"/><br>
회 원 명 : <sform:input path="name"/><br>
<input type="submit" value="추가">
</sform:form>
</body>
</html>