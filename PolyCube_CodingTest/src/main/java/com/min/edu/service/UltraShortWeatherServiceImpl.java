package com.min.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.mapper.IUltraShortWeatherDao;
import com.min.edu.vo.ShortForecastVo;

@Service
public class UltraShortWeatherServiceImpl implements IUltraShortWeatherService {

	
	@Autowired
	private IUltraShortWeatherDao dao;
	
	//TODO PCCT09_04
	@Override
	public List<ShortForecastVo> getAllUltShrtList() {
		return dao.getAllUltShrtList();
	}

	//TODO PCCT10_04
	@Override
	public List<ShortForecastVo> getSaveDetail(int seq) {
		return dao.getSaveDetail(seq);
	}

	//TODO PCCT11_04
	@Override
	public int insertUltrShrt(ShortForecastVo vo) {
		return dao.insertUltrShrt(vo);
	}

	//TODO PCCT12_04
	@Override
	public int insertSeq() {
		return dao.insertSeq();
	}
}
