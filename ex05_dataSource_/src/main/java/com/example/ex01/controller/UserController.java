package com.example.ex01.controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ex01.domain.dto.UserDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

	@InitBinder
	public void dataBinder(WebDataBinder webDataBinder) {
		log.info("MemoController's dataBinder..." + webDataBinder);
		webDataBinder.registerCustomEditor(LocalDate.class, "birthday", new BirthdayEditor());
		webDataBinder.registerCustomEditor(LocalDate.class, "phone", new PhoneEditor());
	}

	@Slf4j
	private static class BirthdayEditor extends PropertyEditorSupport {
		@Override
		public void setAsText(String birthday) throws IllegalArgumentException {
			birthday = birthday.replaceAll("~", "-");
			LocalDate date = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			setValue(date);
		}

	}
	
	@Slf4j
	private static class PhoneEditor extends PropertyEditorSupport {
		@Override
		public void setAsText(String phone) throws IllegalArgumentException {
			phone = phone.replaceAll("-", "");
			setValue(phone);
		}
		
	}

	@GetMapping("/join")
	public void join_get() {
		log.info("GET /user/join..");
	}

	@PostMapping("/join")
	public void join_post(@ModelAttribute @Valid UserDto userDto, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			log.info("데이터 유효성 체크 오류 : " + bindingResult.getFieldError("userid").getDefaultMessage());
//			model.addAttribute("id",bindingResult.getFieldError("id").getDefaultMessage());
			for (FieldError error : bindingResult.getFieldErrors()) {
				log.info("Error Field " + error.getField() + " Error Msg : " + error.getDefaultMessage());
				model.addAttribute(error.getField(), error.getDefaultMessage());
			}
		}
	}
}
