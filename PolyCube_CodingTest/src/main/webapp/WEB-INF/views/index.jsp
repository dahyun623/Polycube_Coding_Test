<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫화면</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
	body {
		text-align: center;
	}
	div {
		margin: 50px;	
	}
</style>
</head>
<%@ include file="header.jsp" %>
<body>
<div>
<button class="btn btn-primary" onclick="location.href='./midWeatherView.do'">기상청 중기 예보</button>
<button class="btn btn-primary" onclick="location.href='./shortWeatherView.do'">기상청 단기 예보</button>
<button class="btn btn-primary" onclick="location.href='./ultraShortWeatherView.do'">기상청 초단기 예보</button>
</div>
</body>
</html>