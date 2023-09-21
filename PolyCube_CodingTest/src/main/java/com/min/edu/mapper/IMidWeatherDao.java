package com.min.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.min.edu.vo.MidForecastVo;

@Mapper
public interface IMidWeatherDao {

	//TODO PCCT01_02
	public int insertMidWeather(MidForecastVo vo);
	
	//TODO PCCT02_02
	public int insertMidSeq();
	
	//TODO PCCT03_02
	public List<MidForecastVo> getMidList();
	
	//TODO PCCT04_02
	public MidForecastVo getMidDetail(int seq);
	
}
