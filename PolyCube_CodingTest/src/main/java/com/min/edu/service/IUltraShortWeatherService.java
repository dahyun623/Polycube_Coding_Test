package com.min.edu.service;

import java.util.List;

import com.min.edu.vo.ShortForecastVo;

public interface IUltraShortWeatherService {

	//TODO PCCT09_03
	public List<ShortForecastVo> getAllUltShrtList();
	
	//TODO PCCT10_03
	public List<ShortForecastVo> getSaveDetail(int seq);
	
	//TODO PCCT11_03
	public int insertUltrShrt(ShortForecastVo vo);
	
	//TODO PCCT12_03
	public int insertSeq();
}
