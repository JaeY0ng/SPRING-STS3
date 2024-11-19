package com.example.ex01.DiTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.ex01.domain.dto.PersonDto;


@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
class DiTests {

	
	@Autowired
	PersonDto personDto1;
	@Autowired
	PersonDto personDto2;
	
	@Autowired
	PersonDto person03;
	
	@Autowired
	PersonDto personBean;
	
	@Autowired
	Component personComponent;
	
	@Test
	void Di_test1() {
		assertNotNull(personDto1);
		System.out.println(personDto1);
		System.out.println(personDto2);
		System.out.println(person03);
		System.out.println(personBean);
		System.out.println(personComponent);
		
	}
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void Di_test_2() {
		assertNotNull(applicationContext);
		System.out.println(applicationContext.getBean("personDto1"));
		System.out.println(applicationContext.getBean("personDto2"));
	}
	
	
	
	
	
	
	
}
