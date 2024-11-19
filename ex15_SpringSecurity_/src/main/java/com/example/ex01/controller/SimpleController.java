package com.example.ex01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ex01.domain.dto.UserDto;
import com.example.ex01.domain.service.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SimpleController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
//	@GetMapping("/user")
//	public void user(Authentication authentication) {
//		log.info("GET /user..." + authentication);
//		log.info("name..." + authentication.getName());
//		log.info("principal..." + authentication.getPrincipal());
//		log.info("authorities..." + authentication.getAuthorities());
//		log.info("details..." + authentication.getDetails());
//		log.info("credentials..." + authentication.getCredentials());
//	}
//	@GetMapping("/user")
//	public void user() {
//		log.info("GET /user...");
//		
//		Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
//		System.out.println(authentication);
//	}
	
	@GetMapping("/user")
	public void user() {
		log.info("GET /user...JSTL로 auth 확인");
		
	}

	
	@GetMapping("/member")
	public void member() {
		log.info("GET /user...");
	}

	
	@GetMapping("/admin")
	public void admin() {
		log.info("GET /user...");
	}
	
	
	@GetMapping("/login")
	public void login() {
		log.info("GET /login...");
	}
	
	
	@GetMapping("/join")
	public void join() {
		log.info("GET /join...");
	}
	
	@PostMapping("/join")
	public String join_post(UserDto userDto) {
		log.info("POST /join...");
		userServiceImpl.memberJoin(userDto);
		return "redirect:/login";
	}
	
	@GetMapping("/logout")
	public void logout() {
		log.info("GET /logout...");
	}

	
	
}
