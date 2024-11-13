package com.example.ex01.config;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component // 빈 등록
@Data
public class PersonComponent {
	
	private String name;
	private int age;
	private String addr;
	
	
	PersonComponent(){
		this.name="김준영";
		this.age=50;
		this.addr="대구";
	}
}
