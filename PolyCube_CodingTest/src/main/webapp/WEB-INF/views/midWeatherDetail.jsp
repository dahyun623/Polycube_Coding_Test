<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<input name="rnSt3Am" type="hidden" value="${vo.rnSt3Am}">
	<input name="rnSt3Pm" type="hidden" value="${vo.rnSt3Pm}">
	<input name="rnSt4Am" type="hidden" value="${vo.rnSt4Am}">
	<input name="rnSt4Pm" type="hidden" value="${vo.rnSt4Pm}">
	<input name="rnSt5Am" type="hidden" value="${vo.rnSt5Am}">
	<input name="rnSt5Pm" type="hidden" value="${vo.rnSt5Pm}">
	<input name="rnSt6Am" type="hidden" value="${vo.rnSt6Am}">
	<input name="rnSt6Pm" type="hidden" value="${vo.rnSt6Pm}">
	<input name="rnSt7Am" type="hidden" value="${vo.rnSt7Am}">
	<input name="rnSt7Pm" type="hidden" value="${vo.rnSt7Pm}">
	<input name="rnSt8" type="hidden" value="${vo.rnSt8}">
	<input name="rnSt9" type="hidden" value="${vo.rnSt9}">
	<input name="rnSt10" type="hidden" value="${vo.rnSt10}">
	<h2>중기예보 강수 확률 차트</h2>
	<div id="weatherChart">
		<canvas id="myChart"></canvas>
	</div>
	<h2>날씨예보</h2>
  <table class="table table-hover">
    <thead>
      <tr>
      	<th>SEQ</th>
      	<th>예보구역코드(regId)</th>
      	<th>3일 후 오전 날씨예보(wf3Am)</th>
      	<th>3일 후 오후 날씨예보(wf3Pm)</th>
      	<th>4일 후 오전 날씨예보(wf4Am)</th>
      	<th>4일 후 오후 날씨예보(wf4Pm)</th>
      	<th>5일 후 오전 날씨예보(wf5Am)</th>
      	<th>5일 후 오후 날씨예보(wf5Pm)</th>
      	<th>6일 후 오전 날씨예보(wf6Am)</th>
      	<th>6일 후 오후 날씨예보(wf6Pm)</th>
      	<th>7일 후 오전 날씨예보(wf7Am)</th>
      	<th>7일 후 오후 날씨예보(wf7Pm)</th>
      	<th>8일 후 날씨예보(wf8)</th>
      	<th>9일 후 날씨예보(wf9)</th>
      	<th>10일 후 날씨예보(wf10)</th>
      </tr>
    </thead>
 	<tbody>
 		<tr>
			<td>${vo.seq}</td>
			<td>${vo.regId}</td>
			<td>${vo.wf3Am}</td>
			<td>${vo.wf3Pm}</td>
			<td>${vo.wf4Am}</td>
			<td>${vo.wf4Pm}</td>
			<td>${vo.wf5Am}</td>
			<td>${vo.wf5Pm}</td>
			<td>${vo.wf6Am}</td>
			<td>${vo.wf6Pm}</td>
			<td>${vo.wf7Am}</td>
			<td>${vo.wf7Pm}</td>
			<td>${vo.wf8}</td>
			<td>${vo.wf9}</td>
			<td>${vo.wf10}</td>
 		</tr>
 	</tbody>
  </table>
 </div>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.0.1/chart.min.js"></script>
 <script type="text/javascript" src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script type='text/javascript' src="../js/midDetail.js"></script>
</body>	
</html>