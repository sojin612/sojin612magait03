package com.spring.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.practice.dto.PracticeDTO;


public interface PracticeService {
	public List<PracticeDTO> listAll() throws Exception;
	public void insert(PracticeDTO pdto) throws Exception;
	
}
