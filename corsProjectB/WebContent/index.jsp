<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/cors.js"></script>
<link href="css/cors.css" rel="stylesheet" />
<body>
	<div class="corsMain">
		<h1>CORS 테스트 B도메인</h1>

		<input type="text" id="name" name="name">
		<button id="btn">확인</button>

		<div id="printBox">
			<span id="printLayer1"></span><br /> 
			<span id="printLayer2"></span><br />
			<span id="printLayer3"></span>
		</div>
		<button id="clean">초기화</button>
	</div>
</body>
</html>