<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
function submit(){
	var chatName = $("#chatName").val();
	var chatContent = $("#chatContent").val();
	
	$.ajax({
		type: "post",
		url: "./chatSubmitServlet",
		data : {
			chatName: chatName,
			chatContent: chatContent
		},
		success: function(result){
			if(result == 1){
				autoClosingAlert("#successMessage", 2000);
			} else if(result == 0){
				autoClosingAlert("#dangerMessage", 2000);
			} else {
				autoClosingAlert("#warningMessage", 2000);
			}
		}
	});
	
	$("#chatContent").val("");
}

function autoClosingAlert(selector, delay){
	var alert = $(selector).alert();
	alert.show();
	window.setTimeout(function(){alert.hide()}, delay);
}

function chatList(type){
	$.ajax({
		type: "post",
		url: "./chatListServlet",
		data : {
			listType: type
		},
		success: function(data){
			var parsed = JSON.parse(data);
			var result = parsed.result;
			for(var i = 0; i < result.length; i++){
				addChat(result[i][0].value, result[i][1].value, result[i][2].value);
			}
		}
	});
}

function addChat(chatName, chatContent, chatTime){
	$("#chatlist").append("<div class='row'>" +
							"<div class='col-lg-12'>" + 
							"<div class='media'>" +
							"<a class='pull-left' href='#'>" +
							"<img class='media-object img-circle' src='images/icon.png'>" + 
							"</a>" + 
							"<div class='media-body'>" +
							"<h4 class='media-heading'>" + chatName +
							"<span class='small pull-right'>" + chatTime + 
							"</span>" + 
							"</h4>" + 
							"<p>" + chatContent + "</p></div></div></div></div><hr>")
}
</script>
</head>
<body>
	<div class="container bootstrap snippet">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="portlet portlet-default">
					<div class="portlet-heading">
						<div class="portlet-title">
							<h4>
								<i class="fa fa-circle text-green"></i>실시간 채팅방
							</h4>
						</div>
						<div class="clearfix"></div>
					</div>
					<div id="chat" class="panel-collapse collapse in">
						<div id="chatlist" class="portlet-body chat-widget"
							style="overflow-y: auto; width: auto; height: 300px;">
							
					
						</div>
						<div class="portlet-footer">
							<div class="row">
								<div class="form-group col-xs-4">
									<input type="text" id="chatName" class="form-control"
										placeholder="이름" maxlength="20" style="height: 40px;">
								</div>
							</div>
							<div class="row" style="height: 90px;">
								<div class="form-group col-xs-10">
									<textarea style="height: 80px;" id="chatContent" class="form-control" placeholder="메세지를 입력하세요." maxlength="100"></textarea>
								</div> 
								<div class="form-group col-xs-2">
									<button type="button" class="btn btn-default pull-right" onclick="submit()">전송</button>
									<div class="clearfix"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="alert alert-success" id="successMessage" style="display: none;">
			<strong>메세지 전송에 성공하였습니다.</strong>
		</div>
		<div class="alert alert-danger" id="dangerMessage" style="display: none;">
			<strong>이름과 내용을 모두 입력해주세요.</strong>
		</div>
		<div class="alert alert-warning" id="warningMessage" style="display: none;">
			<strong>데이터베이스 오류가 발생했습니다.</strong>
		</div>
	</div>
	<button type="button" class="btn btn-default pull-right" onclick="chatList('today')">추가</button>
</body>
</html>