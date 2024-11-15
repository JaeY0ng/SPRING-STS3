package com.example.ex01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ex01.config.WebMvcConfig;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/file")
public class FileUpDownloadController {
	
	@GetMapping("/upload")
	public void upload() {
		log.info("GET /file/upload");
	}
	
	@Autowired
	private WebMvcConfig webMvcConfig;
	
}
