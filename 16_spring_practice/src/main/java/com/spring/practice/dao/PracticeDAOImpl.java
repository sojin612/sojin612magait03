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

	@Override
	public PracticeDTO getOneBoard(int num) throws Exception {
		
		return session.selectOne("com.spring.mapper.BoardMapper2.getOneBoard",num);
	}

	@Override
	public void increaseReadCount(int num) throws Exception {
		session.update("com.spring.mapper.BoardMapper2.increaseReadCount", num);
		
	}

	@Override
	public PracticeDTO validateUserCheck(PracticeDTO pdto) throws Exception {
		return session.selectOne("com.spring.mapper.BoardMapper2.validateUserCheck", pdto);
		
	}

	@Override
	public void update(PracticeDTO pdto) throws Exception {
		session.update("com.spring.mapper.BoardMapper2.update",pdto);
		
	}

	@Override
	public void delete(int num) throws Exception {
		session.update("com.spring.mapper.BoardMapper2.delete",num);
		
	}


	
	

}
