package com.example.ex01.domain.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex01.domain.dao.MemoDaoImpl;
import com.example.ex01.domain.dto.MemoDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemoServiceImpl {
	
	@Autowired
	private MemoDaoImpl memoDaoImpl;
	
	public boolean memoRegistration(MemoDto memoDto) throws SQLException {
		
		// Dao - 메모 insert 이후 true /false 반환
		 return memoDaoImpl.insert(memoDto) > 0;
		
	}
}
