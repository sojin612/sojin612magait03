package com.spring.practice.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.practice.dao.PracticeDAO;
import com.spring.practice.dto.PracticeDTO;

@Service
public class PracticeServiceImpl implements PracticeService {

	@Inject
	private PracticeDAO dao;
	
	@Override
	public List<PracticeDTO> listAll() throws Exception {
		
		return dao.getAllBoard();
	}
	

	@Override
	public void insert(PracticeDTO pdto) throws Exception {
		dao.insertBoard(pdto);
		
	}

	@Override
	public PracticeDTO read(int num) throws Exception {
		dao.increaseReadCount(num);
		return dao.getOneBoard(num);
	}


	@Override
	public boolean modify(PracticeDTO pdto) throws Exception {
		boolean isSuccess= false;
		if(dao.validateUserCheck(pdto)!=null) {
			dao.update(pdto);
			isSuccess=true;
		}
		return isSuccess;
	}

	@Override
	public boolean remove(PracticeDTO pdto) throws Exception {
		boolean isSuccess = false;
		if(dao.validateUserCheck(pdto)!=null) {
			dao.delete(pdto.getNum());
			isSuccess= true;
		}
		return isSuccess;
	}





	
	
	
}
