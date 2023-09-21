package com.min.edu;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.min.edu.mapper.IMidWeatherDao;
import com.min.edu.mapper.IShortWeatherDao;
import com.min.edu.mapper.IUltraShortWeatherDao;
import com.min.edu.service.IShortWeatherService;
import com.min.edu.vo.MidForecastVo;
import com.min.edu.vo.ShortForecastVo;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class PolyCubeCodingTestApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private IMidWeatherDao midDao;
	
	@Autowired
	private IShortWeatherDao shrtDao;
	
	@Autowired
	private IUltraShortWeatherDao usDao;
	
	
//	@Test
	public void midWeatherDaoTest() {
		
		//예보저장 테스트
//		MidForecastVo midVo = new MidForecastVo();
//		midVo.setRegId("11B00000");
//		midVo.setRnSt3Am(30);
//		midVo.setRnSt3Pm(40);
//		midVo.setRnSt4Am(40);
//		midVo.setRnSt4Pm(40);
//		midVo.setRnSt5Am(40);
//		midVo.setRnSt5Pm(40);
//		midVo.setRnSt6Am(40);
//		midVo.setRnSt6Pm(40);
//		midVo.setRnSt7Am(40);
//		midVo.setRnSt7Pm(40);
//		midVo.setRnSt8  (40);
//		midVo.setRnSt9  (40);
//		midVo.setRnSt10 (40);
//		midVo.setWf3Am  ("구름많음");
//		midVo.setWf3Pm  ("구름많음");
//		midVo.setWf4Am  ("구름많음");
//		midVo.setWf4Pm  ("구름많음");
//		midVo.setWf5Am  ("흐림");
//		midVo.setWf5Pm  ("흐림");
//		midVo.setWf6Am  ("흐림");
//		midVo.setWf6Pm  ("흐림");
//		midVo.setWf7Am  ("흐림");
//		midVo.setWf7Pm  ("구름많음");
//		midVo.setWf8    ("구름많음");
//		midVo.setWf9    ("맑음");
//		midVo.setWf10   ("맑음");
//		int n = midDao.insertMidWeather(midVo);
//		assertEquals(1, n);
		
		//SEQ 저장
//		int n = midDao.insertMidSeq();
//		assertEquals(1, n);
		
		//저장 목록 조회
//		List<MidForecastVo> list = midDao.getMidList();
//		assertNotNull(list);
		
		//중기예보 상세 조회
//		MidForecastVo vo = midDao.getMidDetail(1);
//		assertNotNull(vo);
		
	}
	
//	@Test
	public void shortWeatherDaoTest() {
		//getAllSaveList 테스트
//		List<ShortForecastVo> list = shrtDao.getAllSaveList();
//		log.info(list);
//		assertNotNull(list);
		
		//getSaveDetail 테스트
//		List<ShortForecastVo> list = shrtDao.getSaveDetail(1);
//		log.info(list.toString());
//		assertNotNull(list);
		
		//insertWeather 테스트
//		ShortForecastVo vo = new ShortForecastVo();
//		vo.setBaseDate("20230919");
//		vo.setBaseTime("1700");
//		vo.setCategory("TMP");
//		vo.setFcstDate(20230920);
//		vo.setFcstTime(900);
//		vo.setNx(55);
//		vo.setNy(127);
//		vo.setFcstValue("테스트");
//		int n = shrtDao.insertWeather(vo);
//		assertEquals(1, n);

		//insertSeq 테스트
//		int n = shrtDao.insertSeq();
//		assertEquals(1, n);
	}
	
	
//	@Test
	public void ultraShortWeatherDaoTest() {
		
		//저장 목록 조회
//		List<ShortForecastVo> list = usDao.getAllUltShrtList();
//		assertNotNull(list);
		
		//초단기 예보 조회
//		List<ShortForecastVo> list = usDao.getSaveDetail(1);
//		assertNotNull(list);
		
		//예보 저장
//		ShortForecastVo vo = new ShortForecastVo();
//		vo.setBaseDate("20230919");
//		vo.setBaseTime("1430");
//		vo.setFcstDate(20230919);
//		vo.setBaseTime("1430");
//		vo.setCategory("LGT");
//		vo.setFcstValue("강수없음");
//		vo.setNx(55);
//		vo.setNy(127);
//		int n =usDao.insertUltrShrt(vo);
//		assertEquals(1, n);
		
		//SEQ 저장
//		int n = usDao.insertSeq();
//		assertEquals(1, n);
		
	}
	
	@Test
	public void postTest() throws Exception {
		Map<String, String> requestMap = new HashMap<String,String>();

        String content = new ObjectMapper().writeValueAsString(requestMap);
        
        mockMvc
        	.perform(
        			get("./ultraShortWeatherList.do")
        				.contentType(MediaType.APPLICATION_JSON)
        					.content(content)
        			)
        				.andDo(print())
        				.andExpect(status().isOk()); // response status 200 검증
	}
	
	
	
}
