<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> ${title} | 단기예보 </title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<%@ include file="header.jsp" %>
<body>
<div class="container">
  <table class="table table-hover">
    <thead>
      <tr>
      	<th>예보날짜</th>
      	<th>예보시간</th>
      	<th>카테고리</th>
      	<th>값</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${detailList}">
    	<tr>
    		<td>${item.fcstDate}</td>
    		<td>
            	<fmt:formatNumber value="${item.fcstTime}" pattern="0000"/>
        	</td>
    		<td>${item.category}</td>
    		<td>${item.fcstValue}</td>
    	</tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>