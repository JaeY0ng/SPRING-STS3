package com.example.ex01.domain.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	@Max(value = 65535,message = "최소 숫자는 65535이하 이어야 합니다.")
	@NotNull(message="ID를 입력하세요")
	private Integer id;			//메모ID
	@NotBlank(message="메모를 입력하세요")
	private String text;	//메모내용
	
	@NotBlank(message="작성자를 입력해주세요")
	@Email(message="example@example.com 에 맞게 입력해주세요")
	private String writer;	//작성자
	
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	@NotNull(message="날짜 정보를 선택하세요")
	private LocalDateTime createAt; // ISSUE
	
	@DateTimeFormat
	@NotNull(message="")
	private LocalDate dateTest;
}