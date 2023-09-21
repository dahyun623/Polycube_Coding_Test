CREATE TABLE MID_FORECAST(
	SEQ INT not null,
	regId VARCHAR(10) not null,
	rnSt3Am INT not null,
	rnSt3Pm INT not null,
	rnSt4Am INT not null,
	rnSt4Pm INT not null,
	rnSt5Am INT not null,
	rnSt5Pm INT not null,
	rnSt6Am INT not null,
	rnSt6Pm INT not null,
	rnSt7Am INT not null,
	rnSt7Pm INT not null,
	rnSt8 INT not null,
	rnSt9 INT not null,
	rnSt10 INT not null,
	wf3Am VARCHAR(10) not null,
	wf3Pm VARCHAR(10) not null,
	wf4Am VARCHAR(10) not null,
	wf4Pm VARCHAR(10) not null,
	wf5Am VARCHAR(10) not null,
	wf5Pm VARCHAR(10) not null,
	wf6Am VARCHAR(10) not null,
	wf6Pm VARCHAR(10) not null,
	wf7Am VARCHAR(10) not null,
	wf7Pm VARCHAR(10) not null,
	wf8 VARCHAR(10) not null,
	wf9 VARCHAR(10) not null,
	wf10 VARCHAR(10) not null
);


create table M_SEQ_TABLE(
	SEQ INT not null
);



CREATE TABLE SHORT_FORECAST(
	SEQ INT not null,
	baseDate VARCHAR(8) not null,
	baseTime VARCHAR(4) not null,
	category VARCHAR(20) not null,
	fcstDate INT not null,
	fcstTime INT not null,
	fcstValue VARCHAR(20) not null,
	nx INT not null,
	ny INT not null
);

create table S_SEQ_TABLE(
	SEQ INT not null
);

CREATE TABLE ULTRA_SHORT_FORECAST(
	SEQ INT not null,
	baseDate VARCHAR(8) not null,
	baseTime VARCHAR(4) not null,
	category VARCHAR(20) not null,
	fcstDate INT not null,
	fcstTime INT not null,
	fcstValue VARCHAR(20) not null,
	nx INT not null,
	ny INT not null
);


create table US_SEQ_TABLE(
	SEQ INT not null
);










