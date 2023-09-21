package com.min.edu;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.min.edu.vo.MidForecastVo;
import com.min.edu.vo.ShortForecastVo;


@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class MockMVCTest {

	@Autowired
	private MockMvc mockMvc;
	
//	@Test
	@DisplayName("midWeatherList Service 테스트")
    void midWeatherListServiceTest() throws Exception {
		mockMvc
                .perform(
                        get("/midWeatherList.do")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("shortWeatherList Service 테스트")
    void shortWeatherListServiceTest() throws Exception {
		mockMvc
                .perform(
                        get("/shortWeatherList.do")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("ultraShortWeatherList Service 테스트")
    void ultraShortWeatherListServiceTest() throws Exception {
		mockMvc
                .perform(
                        get("/ultraShortWeatherList.do")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("midWeatherDetail Service 테스트")
    void midWeatherDetailServiceTest() throws Exception {
		mockMvc
                .perform(
                        get("/midWeatherDetail.do")
                        .param("seq", "1")
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("shortWeatherDetail Service 테스트")
    void shortWeatherDetailServiceTest() throws Exception {
		mockMvc
                .perform(
                        get("/shortWeatherDetail.do")
                        .param("seq", "1")
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("ultraShortWeatherDetail Service 테스트")
    void ultraShortWeatherDetailServiceTest() throws Exception {
		mockMvc
                .perform(
                        get("/ultraShortWeatherDetail.do")
                        .param("seq", "1")
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("saveMidWeather Service 테스트")
    void saveMidWeatherServiceTest() throws Exception {
		 List<MidForecastVo> list = new ArrayList<>();
		    MidForecastVo vo = new MidForecastVo(1, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "", "", "", "", "", "", "", "", "", "", "", "");
		    list.add(vo);

		    ObjectMapper objectMapper = new ObjectMapper();
		    String jsonList = objectMapper.writeValueAsString(list);
				
		mockMvc
                .perform(
                        post("/saveMidWeather.do")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonList)
                		)
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("saveShortWeather Service 테스트")
    void saveShortWeatherServiceTest() throws Exception {
		 List<ShortForecastVo> list = new ArrayList<>();
		    ShortForecastVo vo = new ShortForecastVo(1, "", "", "", 0, 0, "", 0, 0);
		    list.add(vo);

		    ObjectMapper objectMapper = new ObjectMapper();
		    String jsonList = objectMapper.writeValueAsString(list);
				
		mockMvc
                .perform(
                        post("/saveShortWeather.do")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonList)
                		)
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
	@DisplayName("saveUltraShortWeather Service 테스트")
    void saveUltraShortWeatherServiceTest() throws Exception {
		 List<ShortForecastVo> list = new ArrayList<>();
		    ShortForecastVo vo = new ShortForecastVo(1, "", "", "", 0, 0, "", 0, 0);
		    list.add(vo);

		    ObjectMapper objectMapper = new ObjectMapper();
		    String jsonList = objectMapper.writeValueAsString(list);
				
		mockMvc
                .perform(
                        post("/saveUltraShortWeather.do")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonList)
                		)
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
               
    }
	
//	@Test
    @DisplayName("API 테스트")
    void postTestReturn() throws Exception {

        MvcResult mvcResult = mockMvc
                .perform(
                        get("/weatherApiTest.do")
                                .contentType(MediaType.APPLICATION_JSON) // contentType 설정
                )
                .andDo(print())
                .andReturn();

    }
}
