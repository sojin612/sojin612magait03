package com.spring.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.practice.dto.PracticeDTO;


public interface PracticeService {
	public List<PracticeDTO> listAll() throws Exception;
	public void insert(PracticeDTO pdto) throws Exception;
	public PracticeDTO read(int num) throws Exception;
	public boolean modify(PracticeDTO pdto) throws Exception;
	public boolean remove(PracticeDTO pdto) throws Exception;
	
}
