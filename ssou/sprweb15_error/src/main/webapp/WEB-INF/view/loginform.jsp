<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>자료 입력 - Spring tag </h2>
<sform:form commandName="command">
input id : <sform:input path="userid"/>
<!-- 가독성을 위해 이름을 맞춘 것 일뿐이지 같아야 하는 것 아님 -->
<sform:errors path="userid" />	
<br>
input pwd : <sform:input path="passwd"/>
<sform:errors path="passwd" />
<br>
<input type="submit" value="전송">
</sform:form>
</body>
</html>