package com.example.ex01.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//@Getter
//@Setter
@NoArgsConstructor
//@ToString
@AllArgsConstructor
public class PersonDto {
	
	private String name;
	private int age;
	private String addr;
}
