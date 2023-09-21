package com.min.edu.service;

import java.util.List;

import com.min.edu.vo.MidForecastVo;

public interface IMidWeatherService {

	//TODO PCCT01_03
	public int insertMidWeather(MidForecastVo vo);
	
	//TODO PCCT02_03
	public int insertMidSeq();
	
	//TODO PCCT03_03
	public List<MidForecastVo> getMidList();
	
	//TODO PCCT04_03
	public MidForecastVo getMidDetail(int seq);
	
}
