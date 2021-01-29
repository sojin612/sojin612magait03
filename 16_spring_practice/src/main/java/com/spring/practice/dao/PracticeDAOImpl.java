package com.spring.practice.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.practice.dto.PracticeDTO;

@Repository
public class PracticeDAOImpl implements PracticeDAO {
	
	@Inject
	private SqlSession session;

	@Override
	public List<PracticeDTO> getAllBoard() throws Exception {
	
		return session.selectList("com.spring.mapper.BoardMapper2.getAllBoard");
	}

	@Override
	public void insertBoard(PracticeDTO pdto) throws Exception {
		session.insert("com.spring.mapper.BoardMapper2.insertBoard",pdto);
		
	}
	
	

}
