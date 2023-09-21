package com.min.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.min.edu.vo.ShortForecastVo;

@Mapper
public interface IUltraShortWeatherDao {
	
	//TODO PCCT09_02
	public List<ShortForecastVo> getAllUltShrtList();
	
	//TODO PCCT10_02
	public List<ShortForecastVo> getSaveDetail(int seq);
	
	//TODO PCCT11_02
	public int insertUltrShrt(ShortForecastVo vo);
	
	//TODO PCCT12_02
	public int insertSeq();

}
