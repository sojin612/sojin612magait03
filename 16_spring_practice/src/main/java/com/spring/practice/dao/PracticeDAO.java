package com.spring.practice.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.spring.practice.dto.PracticeDTO;

public interface PracticeDAO {

	

	public List<PracticeDTO> getAllBoard() throws Exception;
	public void insertBoard(PracticeDTO pdto) throws Exception;
	public PracticeDTO getOneBoard(int num) throws Exception;
	public void increaseReadCount(int num) throws Exception;
	public void update(PracticeDTO pdto) throws Exception;
	public PracticeDTO validateUserCheck(PracticeDTO pdto) throws Exception;
	public void delete(int num) throws Exception;
}
