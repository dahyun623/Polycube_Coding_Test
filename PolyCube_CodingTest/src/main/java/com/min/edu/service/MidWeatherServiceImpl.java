package com.min.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.mapper.IMidWeatherDao;
import com.min.edu.vo.MidForecastVo;

@Service
public class MidWeatherServiceImpl implements IMidWeatherService {

	
	@Autowired
	private IMidWeatherDao dao;
	
	//TODO PCCT01_04
	@Override
	public int insertMidWeather(MidForecastVo vo) {
		return dao.insertMidWeather(vo);
	}

	//TODO PCCT02_04
	@Override
	public int insertMidSeq() {
		return dao.insertMidSeq();
	}

	//TODO PCCT03_04
	@Override
	public List<MidForecastVo> getMidList() {
		return dao.getMidList();
	}

	//TODO PCCT04_04
	@Override
	public MidForecastVo getMidDetail(int seq) {
		return dao.getMidDetail(seq);
	}

}
