package com.min.edu.service;

import java.util.List;

import com.min.edu.vo.ShortForecastVo;

public interface IShortWeatherService {

	//TODO PCCT05_03
	public List<ShortForecastVo> getAllSaveList();
	
	//TODO PCCT06_03
	public List<ShortForecastVo> getSaveDetail(int seq);
	
	//TODO PCCT07_03
	public int insertWeather(ShortForecastVo vo);
	
	//TODO PCCT08_03
	public int insertSeq();
	
}
