package com.min.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.mapper.IShortWeatherDao;
import com.min.edu.vo.ShortForecastVo;

@Service
public class ShortWeatherServiceImpl implements IShortWeatherService {

	
	@Autowired
	private IShortWeatherDao dao;
	
	
	//TODO PCCT05_04
	@Override
	public List<ShortForecastVo> getAllSaveList() {
		return dao.getAllSaveList();
	}

	//TODO PCCT06_04
	@Override
	public List<ShortForecastVo> getSaveDetail(int seq) {
		return dao.getSaveDetail(seq);
	}

	//TODO PCCT07_04
	@Override
	public int insertWeather(ShortForecastVo vo) {
		return dao.insertWeather(vo);
	}

	//TODO PCCT08_04
	@Override
	public int insertSeq() {
		return dao.insertSeq();
	}


}
