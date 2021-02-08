package com.spring.boardEx02.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.boardEx02.dto.BoardDTO;

@Repository				
public class BoardDAOImpl implements BoardDAO {

	
	@Inject							
	private SqlSession session;		
	
	@Override
	public List<BoardDTO> getSearchBoard(Map<String, Object> searchInfo) throws Exception{
		return session.selectList("com.spring.mapper.BoardMapper.getSearchBoard",searchInfo);
	}
	
	@Override
	public int getAllBoardCount(Map<String, String> searchCountInfo) throws Exception {
		return session.selectOne("com.spring.mapper.BoardMapper.getAllBoardCount" , searchCountInfo);
	}
	
	@Override
	public BoardDTO getOneBoard(int num) throws Exception{
		return session.selectOne("com.spring.mapper.BoardMapper.getOneBoard",num);
	}
	
	@Override
	public void increaseReadCount(int num) throws Exception {
		session.update("com.spring.mapper.BoardMapper.increaseReadCount",num);
	}
	
	@Override
	public void insertBoard(BoardDTO bdto) throws Exception{
		session.insert("com.spring.mapper.BoardMapper.insertBoard",bdto);
	}
	
	@Override
	public void insertReplyBoard(BoardDTO bdto) throws Exception {
		session.insert("com.spring.mapper.BoardMapper.insertReplyBoard",bdto);
	}
	
	@Override
	public void updateBoard(BoardDTO bdto) throws Exception{
		session.update("com.spring.mapper.BoardMapper.updateBoard",bdto);
	}

	@Override
	public void deleteBoard(int num) throws Exception{
		session.delete("com.spring.mapper.BoardMapper.deleteBoard",num);
	}

	@Override
	public void updateBoardReplyStep(BoardDTO bdto) throws Exception {
		session.update("com.spring.mapper.BoardMapper.updateBoardReplyStep" , bdto);
	}
	
	@Override
	public BoardDTO validateUserCheck(BoardDTO bdto) throws Exception {
		return session.selectOne("com.spring.mapper.BoardMapper.validateUserCheck",bdto);
	}

	@Override
	public void makeDummyData(List<BoardDTO> dataLists) throws Exception {
		session.insert("com.spring.mapper.BoardMapper.makeDummyData" , dataLists);
	}



}
