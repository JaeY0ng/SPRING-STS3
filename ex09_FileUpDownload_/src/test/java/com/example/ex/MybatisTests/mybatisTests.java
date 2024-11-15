package com.example.ex.MybatisTests;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.ex01.domain.dao.MemoDaoImpl;
import com.example.ex01.domain.dto.MemoDto;
import com.example.ex01.domain.mapper.MemoMapper;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
class mybatisTests {

	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	void test_1() {
		System.out.println(sqlSessionFactory.toString());
		SqlSession sqlSession =  sqlSessionFactory.openSession();
		Connection conn =  sqlSession.getConnection();
		System.out.println(conn.toString());
		
	}
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	@Test
	void test_2() {
		System.out.println(sqlSessionTemplate);
		Connection conn =  sqlSessionTemplate.getConnection();
	}
	
	@Autowired
	MemoMapper memoMapper;
	@Test
	void test_3() {

		////INSERT UPDATE DELETE
		//memoMapper.Insert(new MemoDto(-1,"MYBATIS!!","ex@ex.com"));
		//memoMapper.Update(new MemoDto(16,"MYBATIS_UPDATE","ex@ex.com"));
		//memoMapper.Delete(16);

		////SELECT
//		MemoDto dto = memoMapper.SelectOne(14);
//		System.out.println(dto);

		////SELECT
//		List<MemoDto> list = memoMapper.SelectAll();
//		list.forEach(System.out::println);

		////SELECT
//		List< Map<String,Object> >listMap = memoMapper.SelectAllByResultMap();
//		listMap.forEach(map->{
//			
//			for(String key : map.keySet()) {
//				System.out.println(key + " : " + map.get(key));
//			}
//			
//		});
		
		//INSERT _ XML
		//int r= memoMapper.Insert_xml(new MemoDto(-1,"MYBATIS_xml_2!!","xml@xml.com"));
		//memoMapper.Delete_xml(14);
		
//		MemoDto memoDto = memoMapper.SelectOne_xml(15);
//		System.out.println(memoDto);
		
//		List<MemoDto> list = memoMapper.SelectAll_xml_1();
//		list.forEach(System.out::println);
		
//		List<Map<String,Object>> listMap = memoMapper.SelectAll_xml_2();
//		listMap.forEach(map->{
//			
//			for(String key : map.keySet())
//				System.out.println(key + " : " + map.get(key));
//			
//		});
		
		List<Map<String,Object>> listMap = memoMapper.SelectAll_xml_3();
		listMap.forEach(map->{
			
			for(String key : map.keySet())
				System.out.println(key + " : " + map.get(key));
			
		});	
	}
	
	
	@Test
	void test_4() {
		MemoDto memoDto = new MemoDto(-1,"MEMO_KEY_XML","ex@ex.com");
		System.out.println(memoDto);
		
		//memoMapper.Insert(memoDto);
		memoMapper.Insert_xml(memoDto);
		
		System.out.println(memoDto);
	}
	
	@Test
	void test_5() {
		
		Map<String,Object> param = new HashMap();
		param.put("type", "text");
		param.put("keyword", "!!");
		//IF TEST
		List<Map<String,Object>> listMap =  memoMapper.Select_if_xml(param);
		
		listMap.forEach(map->{
			for(String key : map.keySet())
				System.out.println(key + " : " + map.get(key));
		});
		
	}
	@Test
	void test_6() {
		
		Map<String,Object> param = new HashMap();
		param.put("type", "createAt");
		param.put("keyword", "2024-11-13 15:22:16");
		//IF TEST
		List<Map<String,Object>> listMap =  memoMapper.Select_when_xml(param);
		
		listMap.forEach(map->{
			for(String key : map.keySet())
				System.out.println(key + " : " + map.get(key));
		});
		
	}
	
	@Autowired
	private MemoDaoImpl memoDaoImpl;
	
	@Test
	void test_7() throws SQLException {
		int result = memoDaoImpl.insert(new MemoDto(-1,"DAO_MYBATIS","ex@ex.com"));
		System.out.println("RESULT : " + result);
	}
	
	@Test
	void test_8() throws SQLException {
		List<MemoDto> list = memoDaoImpl.selectAll();
		list.forEach(System.out::println);
	}
	

}





