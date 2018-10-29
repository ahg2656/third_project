<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
* 파일 업다운 * <p/>
<sform:form enctype="multipart/form-data" modelAttribute="uploadFile">
업로드할 파일 선택 : <br>
<input type="file" name="file"><br>
<sform:errors path="file" cssStyle="color: red;" />
<input type="submit" value="전송">
</sform:form>
</body>
</html>