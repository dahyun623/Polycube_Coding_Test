<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> ${title} | 중기예보 </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<%@ include file="header.jsp" %>
<body>
<div class="container">
  <table class="table table-hover">
    <thead>
      <tr>
      	<th>SEQ</th>
      	<th>regId</th>
      </tr>
    </thead>
 	<tbody>
 	<c:forEach var="item" items="${list}">
 		<tr>
			<td>${item.seq}</td>
			<td><a href="./midWeatherDetail.do?seq=${item.seq}">${item.regId}</a></td>
 		</tr>
 	</c:forEach>
 	</tbody>
  </table>
 </div>
</body>	
</html>