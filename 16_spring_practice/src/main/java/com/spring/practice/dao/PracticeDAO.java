package com.spring.practice.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.spring.practice.dto.PracticeDTO;

public interface PracticeDAO {

	
	public List<PracticeDTO> getAllBoard() throws Exception;
	public void insertBoard(PracticeDTO pdto) throws Exception;
}
