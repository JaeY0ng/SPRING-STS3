package com.example.ex01.domain.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MemoDto {
	private int id;			//메모ID
	private String text;	//메모내용
	private String writer;	//작성자
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime createAt; // ISSUE
}
