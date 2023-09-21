$(document).ready(function() { 
	
	var rnSt3Am  = $('input[name="rnSt3Am"]').val(); 
	var rnSt3Pm  = $('input[name="rnSt3Pm"]').val(); 
	var rnSt4Am  = $('input[name="rnSt4Am"]').val(); 
	var rnSt4Pm  = $('input[name="rnSt4Pm"]').val(); 
	var rnSt5Am  = $('input[name="rnSt5Am"]').val(); 
	var rnSt5Pm  = $('input[name="rnSt5Pm"]').val(); 
	var rnSt6Am  = $('input[name="rnSt6Am"]').val(); 
	var rnSt6Pm  = $('input[name="rnSt6Pm"]').val(); 
	var rnSt7Am  = $('input[name="rnSt7Am"]').val(); 
	var rnSt7Pm  = $('input[name="rnSt7Pm"]').val(); 
	var rnSt8  = $('input[name="rnSt8"]').val(); 
	var rnSt9  = $('input[name="rnSt9"]').val(); 
	var rnSt10  = $('input[name="rnSt10"]').val(); 
	
	var dataArray = new Array();
	dataArray.push(rnSt3Am);
	dataArray.push(rnSt3Pm);
	dataArray.push(rnSt4Am);
	dataArray.push(rnSt4Pm);
	dataArray.push(rnSt5Am);
	dataArray.push(rnSt5Pm);
	dataArray.push(rnSt6Am);
	dataArray.push(rnSt6Pm);
	dataArray.push(rnSt7Am);
	dataArray.push(rnSt7Pm);
	dataArray.push(rnSt8);
	dataArray.push(rnSt9);
	dataArray.push(rnSt10);
	
	console.log(dataArray);

	var ctx = document.getElementById("myChart").getContext('2d');

	

	myChart = new Chart(ctx, {
		type: 'bar',
		data: {
		labels: [
				'3일 후 오전',
				'3일 후 오후',
				'4일 후 오전',
				'4일 후 오후',
				'5일 후 오전',
				'5일 후 오후',
				'6일 후 오전',
				'6일 후 오후',
				'7일 후 오전',
				'7일 후 오후',
				'8일 후',
				'9일 후',
				'10일 후'
				],
			datasets: [{
				label: '강수 확률',
				data: dataArray,
				backgroundColor:'rgba(54, 162, 235, 0.2)',
				borderColor:'#rgb(75, 192, 192)'
			}]
		}
	});
})