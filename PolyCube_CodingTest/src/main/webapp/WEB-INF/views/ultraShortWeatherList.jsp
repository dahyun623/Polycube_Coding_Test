<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> ${title} | 초단기예보 </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<%@ include file="header.jsp" %>
<body>
<div class="container">
  <table class="table table-hover">
    <thead>
      <tr>
      	<th>순번</th>
      	<th>날짜</th>
      	<th>시간</th>
      	<th>x값</th>
      	<th>y값</th>
      </tr>
    </thead>
 	<tbody>
 		<c:forEach var="item" items="${list}">
 		<tr>
			<td>${item.seq}</td>
			<td><a href="./ultraShortWeatherDetail.do?seq=${item.seq}">${item.baseDate}</a></td>
			<td>${item.baseTime}</td>
			<td>${item.nx}</td>
			<td>${item.ny}</td>
 		</tr>
		</c:forEach>
 	</tbody>
  </table>
 </div>
</body>	
</html>