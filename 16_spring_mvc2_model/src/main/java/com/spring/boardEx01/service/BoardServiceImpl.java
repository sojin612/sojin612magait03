package com.spring.boardEx01.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.boardEx01.dao.BoardDAO;
import com.spring.boardEx01.dto.BoardDTO;

@Service //서비스(비지니스 로직)은 service어노테이션을 명시해야 한다. service bean으로 등록.
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao; //Board 객체를 스프링에서 생성하여 주입시킴.
	
	
	@Override
	public List<BoardDTO> listAll() throws Exception{
		
		return dao.getAllBoard();
	}


	@Override
	public void insert(BoardDTO bdto) throws Exception{
		dao.insertBoard(bdto);
	}


	@Override
	public BoardDTO read(int num) throws Exception {
		dao.increaseReadCount(num);
		return dao.getOneBoard(num);
	}


	@Override
	public boolean modify(BoardDTO bdto) throws Exception {
		boolean isSucceed= false;
		if(dao.validateUserCheck(bdto)!=null) {
			dao.updateBoard(bdto);
			isSucceed=true;
		}
		return isSucceed;
	}


	@Override
	public boolean remove(BoardDTO bdto) throws Exception {
		boolean isSucceed = false;
		if(dao.validateUserCheck(bdto)!=null) {
			dao.deleteBoard(bdto.getNum());
			isSucceed=true;
		}
		
		return isSucceed;
	}


	





}
