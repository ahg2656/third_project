<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
window.onload= function() {
	document.getElementById("btn_serch").onclick = function() {
		if(frm.serch.value ==""){
			alert("재료를 입력해 주세요");
			frm.serch.focus();
			retun;
		}
		frm.submit();
		
	}
}
</script>
</head>
<body>
<div class="serch_1">
<div class="serch_2" align="center">재료 검색 창</div>
<div class="serch_3" align="center">
<form action="serch" name="frm">
<input type="text" name="serch" placeholder="재료검색">
<input type="button" value="확인" id="btn_serch"> 
</form>
</div>
<div class="serch_4">
재료 큰 분류<br>
<ul>
<li><a href="#">견과류</a></li>
<li><a href="#">곡류</a></li>
<li><a href="#">과실류</a></li>
<li><a href="#">기타</a></li>
<li><a href="#">난류</a></li>
<li><a href="#">당류</a></li>
<li><a href="#">두류</a></li>
<li><a href="#">버섯류</a></li>
<li><a href="#">어패류</a></li>
<li><a href="#">유제품</a></li>
<li><a href="#">유지류</a></li>
<li><a href="#">음료</a></li>
<li><a href="#">전분류</a></li>
<li><a href="#">조리가공식품류</a></li>
<li><a href="#">조미료류</a></li>
<li><a href="#">채소류</a></li>
<li><a href="#">해조류</a></li>
</ul>
</div>
<div class="serch_5">
재료 세부 분류
</div>
<div class="serch_6">
선택  재료 
</div>
</div>
</body>
</html>