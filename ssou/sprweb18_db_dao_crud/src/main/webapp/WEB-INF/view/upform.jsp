<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
아 이 디 : ${updata.id}<br>
<input type="hidden" name="id" value="${updata.id}">
회 원 명 : <input type="text" name="name" value="${updata.name}"><br>
비밀번호 : <input type="text" name="passwd" value="${updata.passwd}"><br>
<input type="submit" value="수정완료">
</form>
</body>
</html>