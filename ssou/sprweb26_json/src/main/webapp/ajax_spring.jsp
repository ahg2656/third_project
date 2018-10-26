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
	$("#btn1").click(function(){
		$.ajax({
			type:"get",
			url:"list",
			data:{"name":"oscar"},
			dataType:"json",
			success:function(data){
				var str = "";
				str += data.name + "<br>";
				str += data.skills[0] + "&nbsp;";
				str += data.skills[1];
				
				$("#showData").html(str);
			},
			error:function(){
				$("#showData").text("에러 발생!");	//text 사용 시 <br> 인식 못함
			}
		});
	});
	
	$("#btn2").click(function(){
		$.ajax({
			type:"get",
			url:"list2",
			dataType:"json",
			success:function(data){
				var list = data.datas;	//json 의 대표명
				var str = "<table border='1'>";
				str += "<tr><th>이름</th><th>나이</th></tr>"
				$(list).each(function(index, obj){
					str += "<tr>";
					str += "<td>" + obj["name"] + "</td>";
					str += "<td>" + obj["age"] + "</td>";
					str += "</tr>";
				});
				
				str += "</table>"
				$("#showData").html(str);
			},
			error:function(){
				$("#showData").text("에러 발생!");	//text 사용 시 <br> 인식 못함
			}
		});
	});
});
</script>
</head>
<body>
Spring 이 제공하는 json 읽기 - Ajax<br>
<input type="button" value="단일 자료" id="btn1"><br>
<input type="button" value="복수 자료" id="btn2">
<br><br>
<div id="showData">
</div>
</body>
</html>