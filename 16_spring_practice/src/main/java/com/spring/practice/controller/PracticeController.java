package com.spring.practice.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String boardList(Model model) throws Exception{
		List<PracticeDTO> boardList= practiceService.listAll();
		model.addAttribute("boardList",boardList);
		return "practice/bList";
	}
	
	@RequestMapping(value="/boardWrite", method=RequestMethod.GET)
	public String boardWriteForm() throws Exception{
		return "practice/bWrite";
	}
	
	@RequestMapping(value="/boardWrite", method=RequestMethod.POST)
	public String boardWriteAction(PracticeDTO pdto) throws Exception{
		practiceService.insert(pdto);
		return "redirect:boarList";
	}
	
}
