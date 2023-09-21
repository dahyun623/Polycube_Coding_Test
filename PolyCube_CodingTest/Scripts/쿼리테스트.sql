#중기 예보 저장
INSERT INTO MID_FORECAST
	(SEQ, regId, rnSt3Am, rnSt3Pm, rnSt4Am, rnSt4Pm, rnSt5Am, rnSt5Pm, rnSt6Am, rnSt6Pm, rnSt7Am, rnSt7Pm, rnSt8, rnSt9, rnSt10, wf3Am, wf3Pm, wf4Am, wf4Pm, wf5Am, wf5Pm, wf6Am, wf6Pm, wf7Am, wf7Pm, wf8, wf9, wf10)
	VALUES((SELECT IFNULL(MAX(SEQ),0)+1 FROM M_SEQ_TABLE), '11B00000', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '', '', '', '', '', '', '', '', '', '', '');

#중기예보 시퀀스 테이블 입력
INSERT INTO M_SEQ_TABLE (SELECT IFNULL(MAX(SEQ),0) FROM MID_FORECAST);

#중기예보 정보 목록 조회
SELECT SEQ, regId, rnSt3Am, rnSt3Pm, rnSt4Am, rnSt4Pm, rnSt5Am, rnSt5Pm, rnSt6Am, rnSt6Pm, rnSt7Am, rnSt7Pm, rnSt8, rnSt9, rnSt10, wf3Am, wf3Pm, wf4Am, wf4Pm, wf5Am, wf5Pm, wf6Am, wf6Pm, wf7Am, wf7Pm, wf8, wf9, wf10
	FROM MID_FORECAST
	ORDER BY SEQ;

#중기예보 정보 상세 조회
SELECT SEQ, regId, rnSt3Am, rnSt3Pm, rnSt4Am, rnSt4Pm, rnSt5Am, rnSt5Pm, rnSt6Am, rnSt6Pm, rnSt7Am, rnSt7Pm, rnSt8, rnSt9, rnSt10, wf3Am, wf3Pm, wf4Am, wf4Pm, wf5Am, wf5Pm, wf6Am, wf6Pm, wf7Am, wf7Pm, wf8, wf9, wf10
		FROM MID_FORECAST
		WHERE SEQ = 1;

#단기 예보 저장 목록 조회
SELECT SEQ,baseDate, baseTime, nx, ny
	FROM SHORT_FORECAST
	GROUP BY SEQ,baseDate, baseTime, nx, ny
		
#단기 예보 상세 조회
SELECT SEQ, baseDate, baseTime, category, fcstDate, fcstTime, fcstValue, nx, ny
	FROM SHORT_FORECAST
	WHERE SEQ = 1;
	
#단기 예보 저장
INSERT INTO weatherDB.SHORT_FORECAST
	(SEQ, baseDate, baseTime, category, fcstDate, fcstTime, fcstValue, nx, ny)
	VALUES(0, '', '', '', 0, 0, '', 0, 0);

#단기예보 시퀀스 테이블 입력
INSERT INTO S_SEQ_TABLE (SELECT IFNULL(MAX(SEQ),0) FROM SHORT_FORECAST);


#초단기 예보 목록 조회
SELECT SEQ,baseDate, baseTime, nx, ny
		FROM ULTRA_SHORT_FORECAST
		GROUP BY SEQ,baseDate, baseTime, nx, ny

#초단기 예보 상세 조회
SELECT SEQ, baseDate, baseTime, category, fcstDate, fcstTime, fcstValue, nx, ny
	FROM ULTRA_SHORT_FORECAST
	WHERE SEQ = 1;

#초단기 예보 저장
INSERT INTO ULTRA_SHORT_FORECAST
	(SEQ, baseDate, baseTime, category, fcstDate, fcstTime, fcstValue, nx, ny)
	VALUES((SELECT IFNULL(MAX(SEQ),0)+1 FROM M_SEQ_TABLE), '20230920', '1500', 0, 0, 0, 0, 0, 0);

#초단기 예보 시퀀스 입력
INSERT INTO US_SEQ_TABLE (SELECT IFNULL(MAX(SEQ),0) FROM ULTRA_SHORT_FORECAST);

