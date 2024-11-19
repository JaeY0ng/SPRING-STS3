package com.example.ex01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/test")
public class SimpleController {
	
	
	@RequestMapping(value="/t1",method=RequestMethod.GET)
	public void t1() {
		log.info("GET /t1...");
	}
	@RequestMapping(value="/t2",method=RequestMethod.POST)
	public void t2() {
		log.info("GET /t2...");
	}
	@RequestMapping(value="/t3",method= {RequestMethod.GET,RequestMethod.POST})
	public void t3() {
		log.info("GET /t3...");
	}
	
}
