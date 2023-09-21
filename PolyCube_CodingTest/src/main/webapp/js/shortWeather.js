window.onload = function(){

	$('input[name="getShortWeather"]').on('click', function() {
	//입력값 유효값 검사
	if($('input[name=baseDate]').val()==""){
		alert("날짜를 입력해주세요");
		$('input[name=baseDate]').focus();
		return false;
	}
	if($('select[name=baseTime]').val()==""){
		alert("시간를 입력해주세요");
		$('select[name=baseTime]').focus();
		return false;
	}
	if($('input[name=nx]').val()==""){
		alert("위도를 입력해주세요");
		$('input[name=nx]').focus();
		return false;
	}
	if($('input[name=ny]').val()==""){
		alert("경도를 입력해주세요");
		$('input[name=ny]').focus();
		return false;
	}	
	var date = $('input[name=baseDate]').val();
	//날짜 형식 변경
	var baseDate = date.replace(/-/g,'');
	var baseTime = $('select[name=baseTime]').val();
	var nx = $('input[name=nx]').val();
	var ny = $('input[name=ny]').val();
	console.log(baseDate,baseTime,nx,ny);
	var result = document.getElementById("result");
	result.textContent ="";
	
	var xhr = new XMLHttpRequest();
	var url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst';
	var options = '?servicekey=FHPCrdS6M%2Br2qPhm89%2FRZXDySSmg2y7d0inT3TmB4bsMn2xnrOdE2elOM4ePV5EOKv%2B6PUkhqORLAVweqqrtCg%3D%3D';
	options += '&pageNo=1';
	options += '&numOfRows=1000';
	options += '&dataType=json';
	options += '&base_date='+baseDate;
	options += '&base_time='+baseTime;
	options += '&nx='+nx;
	options += '&ny='+ny;
	
	xhr.open('GET', url + options);
	xhr.onreadystatechange = function () {
	    if (this.readyState == 4) {
	        var result = document.getElementById("result");
	        var responseObj = JSON.parse(this.responseText);
        	var items = responseObj.response.body.items.item;
        	console.log(items);
	        result.textContent = JSON.stringify(items);
	    }
	};
	xhr.send('');
	})
	
	
	$('input[name="saveShortWeather"]').on('click', function() {
    var result = $('#result').text();
    console.log(result);
    if(result===""){
		alert('날씨정보를 먼저 불러와 주세요');
		return false;
	}

    $.ajax({
        url: '/saveShortWeather.do', 
        type: 'POST',
        contentType: "application/json;charset=UTF-8",
        data: result,
        success: function() {
			alert('날씨 정보가 저장되었습니다');
        },
        error: function(error) {
            console.log(error);
        }
    });
});

}
