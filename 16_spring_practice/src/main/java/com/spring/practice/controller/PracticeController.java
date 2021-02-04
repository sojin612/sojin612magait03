package com.spring.practice.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.practice.dto.PracticeDTO;
import com.spring.practice.service.PracticeService;

@Controller
public class PracticeController {

	@Inject
	private PracticeService practiceService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String main() {
		return "practice/main";
	}
	
	@RequestMapping(value="/boardList")
	public String boardList(Model model) throws Exception {
		List<PracticeDTO> boardList = practiceService.listAll();
		model.addAttribute("boardList",boardList);
		return "practice/bList";
	}
	@RequestMapping(value="/boardWrite",method=RequestMethod.GET)
	public String boardWriteForm()throws Exception{
		return "practice/bWrite";
	}
	@RequestMapping(value="/boardWrite",method=RequestMethod.POST)
	public String boardWriteAction(PracticeDTO pdto)throws Exception{
		practiceService.insert(pdto);
		return "redirect:boardList";
	}
	@RequestMapping(value="/boardInfo")
	public String boardInfo(@RequestParam("num")int num, Model model)throws Exception{
		PracticeDTO pdto=practiceService.read(num);
		model.addAttribute("bdto",pdto);
		return "practice/bInfo";		
	}
	
	@RequestMapping(value="/boardUpdate",method=RequestMethod.GET)
	public String boardUpdateForm(@RequestParam("num")int num,Model model) throws Exception{
		PracticeDTO pdto=practiceService.read(num);
		model.addAttribute("bdto",pdto);
		return "practice/bUpdate";
	}
	
	@RequestMapping(value="/boardUpdate",method=RequestMethod.POST)
	public String boardUpdateAction(PracticeDTO pdto,Model model) throws Exception{
		boolean isSuccess=practiceService.modify(pdto);
		if(isSuccess) model.addAttribute("success",true);
		else model.addAttribute("success", false);
		return "practice/bUpdatePro";
	}
	
	@RequestMapping(value="/boardDelete", method=RequestMethod.GET)
	public String boardDeleteForm(@RequestParam("num")int num, Model model)throws Exception{
		PracticeDTO pdto=practiceService.read(num);
		model.addAttribute("bdto", pdto);
		return "practice/bDelete";
	}
	
	@RequestMapping(value="/boardDelete", method=RequestMethod.POST)
	public String boardDeleteAction(PracticeDTO pdto,Model model) throws Exception{
		boolean isSuccess=practiceService.remove(pdto);
		if(isSuccess) model.addAttribute("success",true);
		else model.addAttribute("success",false);
		return "practice/bDeletePro";
	}
	
}
