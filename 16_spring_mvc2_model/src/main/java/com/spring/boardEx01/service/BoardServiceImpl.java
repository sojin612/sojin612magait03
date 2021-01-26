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
	public List<BoardDTO> listAll() {
		
		return dao.getAllBoard();
	}

}
