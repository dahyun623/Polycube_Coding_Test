<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기상청 중기 예보</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script type="text/javascript" src="../js/midWeather.js"></script>
<style type="text/css">
	body {
		width:50%;
		height:auto;
		margin: 50px 400px;
	}
	input {
		width: 275px;
	}
	.container{
		width: 50%;	
	}
</style>
</head>
<%@ include file="header.jsp" %>
<body>
	<div class="container">
		<div class="form-group">
		  <label for="tmFc">날짜:</label>
		  <input name="tmFc" type="date" class="form-control" id="tmFc">
		</div>
		<div class="form-group">
		  <label for="tmFcTime">시간:</label>
		  <select name="tmFcTime" class="form-control" id="tmFcTime">
		  	<option value="0600">6시</option>
		  	<option value="1800">18시</option>
		  </select>
		</div>
		<div class="form-group">
		  <label for="regId">예보구역:</label>
		  <select name="regId" class="form-control" id="regId">
		  	<option value="11B00000">서울, 인천, 경기도</option>
			<option value="11D10000">강원도영서</option>
			<option value="11D20000">강원도영동</option>
			<option value="11C20000">대전, 세종, 충청남도</option>
			<option value="11C10000">충청북도</option>
			<option value="11F20000">광주, 전라남도</option>
			<option value="11F10000">전라북도</option>
			<option value="11H10000">대구, 경상북도</option>
			<option value="11H20000">부산, 울산, 경상남도</option>
			<option value="11G00000">제주도</option>
		  </select>
		</div>
		<input name="getMidWeather" type="button" value="중기예보 정보(JSON) 불러오기" class="btn btn-primary">
		<input name="saveMidWeather" type="button" value="날씨 정보 저장하기" class="btn btn-success">
		<input name="savedMidWeatherInfo" type="button" onclick="location.href='./midWeatherList.do'" value="저장된 정보 목록으로 이동" class="btn btn-info">
		<b>▼ 불러온 값</b>
		<div id="result"></div>
	</div>
</body>
</html>