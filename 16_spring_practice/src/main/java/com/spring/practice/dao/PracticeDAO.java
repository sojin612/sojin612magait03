package com.spring.practice.dao;

import java.util.List;

import com.spring.practice.dto.PracticeDTO;

public interface PracticeDAO {
	
	public List<PracticeDTO> getAllBoard() throws Exception;
	public void insert(PracticeDTO pdto) throws Exception;
}
