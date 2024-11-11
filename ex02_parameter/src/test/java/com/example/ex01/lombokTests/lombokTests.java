package com.example.ex01.lombokTests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.ex01.domain.dto.PersonDto;

public class lombokTests {

	
	@Test
	void personDto_Tests() {
		PersonDto dto1 = new PersonDto();
		dto1.setName("홍길동");
		dto1.setAge(10);
		dto1.setName("대구");
		
		System.out.println(dto1);
	}
	@Test
	void personDto_Tests_2() {
		PersonDto dto = PersonDto.builder()
								  .addr("울산")
								  .name("티모")
								  .build();
		System.out.print(dto);
		
		assertNotNull(dto);
		
	}
}
