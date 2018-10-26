<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#btn").click(function(){
		$.ajax({
			type:"get",
			url:"list",
			dataType:"json",
			success:function(data){
				var list = data.sangpum;	//json 의 대표명
				var str = "<table border='1'>";
				str += "<tr><th>번호</th><th>상품명</th><th>수량</th><th>단가</th></tr>"
				$(list).each(function(index, obj){
					str += "<tr>";
					str += "<td>" + obj["code"] + "</td>";
					str += "<td>" + obj["sang"] + "</td>";
					str += "<td>" + obj["su"] + "</td>";
					str += "<td>" + obj["dan"] + "</td>";
					str += "</tr>";
				});
				
				str += "</table>"
				$("#disp").html(str);
			},
			error:function(){
				$("#disp").text("에러 발생!");	//text 사용 시 <br> 인식 못함
			}
		});
	});
});
</script>
</head>
<body>
<input type="button" value="상품" id="btn">
<br><br>
<div id="disp">
</div>
</body>
</html>