package com.min.edu;

import static org.junit.jupiter.api.Assertions.*;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@ExtendWith({MockitoExtension.class, RestDocumentationExtension.class, SpringExtension.class})
@AutoConfigureMockMvc
class DocsTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@BeforeEach
	public void setUp(WebApplicationContext applicationContext,RestDocumentationContextProvider restDocumentation) {
		this.mockMvc = MockMvcBuilders
				.webAppContextSetup(applicationContext)
				.apply(documentationConfiguration(restDocumentation))
				.build();
	}
	
	
	@Test
	void docTest() throws Exception{
		this.mockMvc.perform(get("/midWeatherView.do").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(document("index"))
				.andDo(print());
	}
	
	@Test
	@DisplayName("midWeatherList Service 테스트")
    void midWeatherListServiceTest() throws Exception {
		this.mockMvc
                .perform(
                        get("/midWeatherList.do")
                )
                .andExpect(status().isOk())
                .andDo(document("index"))
                .andDo(print());
               
    }

}
