window.onload = function(){

	$('input[name="getMidWeather"]').on('click', function() {
	//입력값 유효값 검사
	if($('input[name=tmFc]').val()==""){
		alert("날짜를 입력해주세요");
		$('input[name=tmFc]').focus();
		return false;
	}
	if($('select[name=tmFcTime]').val()==""){
		alert("시간를 선택해주세요");
		$('select[name=tmFcTime]').focus();
		return false;
	}
	if($('input[name=regId]').val()==""){
		alert("예보구역코드를 선택해주세요");
		$('input[name=regId]').focus();
		return false;
	}
	
	var date = $('input[name=tmFc]').val();
	var tmFcTime = $('select[name=tmFcTime]').val();
	
	//날짜 형식 변경
	var tmFc = date.replace(/-/g,'')+tmFcTime;
	var regId = $('select[name=regId]').val();
	var result = document.getElementById("result");
	result.textContent ="";
	
	var xhr = new XMLHttpRequest();
	var url = 'http://apis.data.go.kr/1360000/MidFcstInfoService/getMidLandFcst';
	var options = '?servicekey=FHPCrdS6M%2Br2qPhm89%2FRZXDySSmg2y7d0inT3TmB4bsMn2xnrOdE2elOM4ePV5EOKv%2B6PUkhqORLAVweqqrtCg%3D%3D';
	options += '&pageNo=1';
	options += '&numOfRows=1000';
	options += '&dataType=json';
	options += '&regId='+regId;
	options += '&tmFc='+tmFc;
	console.log(xhr);
	
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
	
    
    
	$('input[name="saveMidWeather"]').on('click', function() {
    var result = $('#result').text();
    console.log(result);
    if(result===""){
		alert('날씨정보를 먼저 불러와 주세요');
		return false;
	}

    $.ajax({
        url: '/saveMidWeather.do', 
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
