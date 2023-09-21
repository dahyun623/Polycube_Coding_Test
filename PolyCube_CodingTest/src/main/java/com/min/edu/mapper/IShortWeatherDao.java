package com.min.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.min.edu.vo.ShortForecastVo;

@Mapper
public interface IShortWeatherDao {
	
	//TODO PCCT05_02
	public List<ShortForecastVo> getAllSaveList();
	
	//TODO PCCT06_02
	public List<ShortForecastVo> getSaveDetail(int seq);
	
	//TODO PCCT07_02
	public int insertWeather(ShortForecastVo vo);
	
	//TODO PCCT08_02
	public int insertSeq();

}
