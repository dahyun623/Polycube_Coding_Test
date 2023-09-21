<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기상청 단기 예보</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script type="text/javascript" src="../js/shortWeather.js"></script>
<style type="text/css">
	body {
		width:50%;
		height:auto;
		margin: 50px 400px;
	}
	input {
		width: 275px;
	}
</style>
</head>
<%@ include file="header.jsp" %>
<body>
	<div>
		<div class="form-group">
		  <label for="baseDate">날짜:</label>
		  <input name="baseDate" type="date" class="form-control" id="baseDate">
		</div>
		<div class="form-group">
		  <label for="baseTime">시간:</label>
		  <select name="baseTime" class="form-control" id="baseTime">
		  	<option value="0200">2시</option>
			<option value="0500">5시</option>
			<option value="0800">8시</option>
			<option value="1100">11시</option>
			<option value="1400">14시</option>
			<option value="1700">17시</option>
			<option value="2000">20시</option>
			<option value="2300">23시</option>
		  </select>
		</div>
		<div class="form-group">
		  <label for="nx">x값:</label>
		  <input name="nx" type="number" class="form-control" id="nx">
		</div>
		<div class="form-group">
		  <label for="ny">y값:</label>
		  <input name="ny" type="number" class="form-control" id="ny">
		</div>
		<input name="getShortWeather" type="button" value="단기예보 정보(JSON) 불러오기" class="btn btn-primary">
		<input name="saveShortWeather" type="button" value="날씨 정보 저장하기" class="btn btn-success">
		<input name="savedShortWeatherInfo" type="button" onclick="location.href='./shortWeatherList.do'" value="저장된 정보 목록으로 이동" class="btn btn-info">
		<b>▼ 불러온 값</b>
		<div id="result"></div>
	</div>
</body>
</html>