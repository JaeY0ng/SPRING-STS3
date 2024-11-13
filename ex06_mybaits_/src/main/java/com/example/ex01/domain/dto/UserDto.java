package com.example.ex01.domain.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	@NotBlank(message="ID를 입력 해 주세요")
	private String userid;		//유저ID
	
	@NotBlank(message="패스워드를 입력 해 주세요")
	private String password;	//패스워드
	
	@NotBlank(message="패스워드확인란 을 입력 해 주세요")
	private String repassword;	//패스워드확인
	
	@Size(min = 1, max = 4 , message="이름은 1 ~ 4자 사이로 입력 해야 합니다")
	@NotBlank(message="이름을 입력 해 주세요")
	private String username;	//유저이름
	
	@NotBlank(message="전화번호를 입력 해 주세요")
	private String phone;	    //전화번호
	
	@NotBlank(message="우편번호를 입력 해 주세요")
	private String zipcode;	    //우편번호
	
	@NotBlank(message="기본주소를 입력 해 주세요")
	private String addr1;	    //기본주소
	
	@NotBlank(message="상세주소를 입력 해 주세요")
	private String addr2;       //상세주소
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull(message="생년월일을 입력하세요")
	private LocalDate birthday; //생년월일(yyyy-MM-dd)
	
	
}
