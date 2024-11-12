package com.example.ex01.domain.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;

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
	
	
	@Min(value = 10,message = "최소 숫자는 10이상 이어야 합니다.")
	private int id;			//메모ID
	private String text;	//메모내용
	private String writer;	//작성자
	
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private LocalDateTime createAt; // ISSUE
}
