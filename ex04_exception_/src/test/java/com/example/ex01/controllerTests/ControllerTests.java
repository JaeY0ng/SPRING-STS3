package com.example.ex01.controllerTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import com.example.ex01.controller.ParameterTestController;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@WebAppConfiguration
@Slf4j
class ControllerTests {

	@Autowired
	private ParameterTestController parameterTestController;

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void test1() throws Exception {
		// GET /param/p01
		mockMvc.perform(get("/param/p01").param("name", "이재용")).andExpect(status().isOk()).andDo(print());

	}

	@Test
	public void test2() throws Exception {
		
		// POST /param/p03
		mockMvc.perform(post("/param/p03")
	            .contentType(MediaType.APPLICATION_FORM_URLENCODED)
	            .param("name","이재용"))
	            .andExpect(status().isOk())
	            .andDo(print());

	}
	
	@Test
	public void test3() throws Exception {
		
		// POST /param/p04
		mockMvc.perform(post("/param/p04")
				.content("{\"name\":\"홍길동\"}")
		.contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(status().isOk())
		.andDo(print());
		
	}
	
	

}
