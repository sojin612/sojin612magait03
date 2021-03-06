package com.spring.boardEx01.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.boardEx01.dto.BoardDTO;
import com.spring.boardEx01.service.BoardService;

@Controller //컨트롤러임을 명시(controller bean에 등록시킴)
public class BoardController {
	
	
	@Inject					//DI 의존성 주입
	private BoardService boardService; //Service 호출을 위한 객체 생성
	
	//value에는 url주소를 명시, method는 요청타입을 명시
	@RequestMapping(value="/", method = RequestMethod.GET) 
	public String main() {
		return "boardEx01/main";  //servlet-context에 명시된 대로 포워딩 시킬 jsp파일을 작성해준다.
	}
	
	@RequestMapping(value="/boardList")
	public String boardList(Model model) throws Exception {
		
		List<BoardDTO> boardList= boardService.listAll() ;
		model.addAttribute("boardList",boardList);
		
		return "boardEx01/bList";
	}
	
	@RequestMapping(value="/boardWrite",method=RequestMethod.GET)
	public String boardWriteForm() {
		
		return "boardEx01/bWrite";
	}
	
	@RequestMapping(value="/boardWrite",method=RequestMethod.POST)
	public String boardWriteAction(BoardDTO bdto) throws Exception{
		
		boardService.insert(bdto);
		return "redirect:boardList";   //redirect:해당 페이지로 이동한다.
	}
	
	@RequestMapping(value="/boardInfo")
	public String boardInfo(@RequestParam("num") int num, Model model) throws Exception{ //모델은 객체를 여기서만듬
		BoardDTO bdto=boardService.read(num);
		model.addAttribute("bdto",bdto); //모델은 화면으로 넘겨주는 역할
		return "boardEx01/bInfo";
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.GET)
	public String boardUpdateForm(@RequestParam("num") int num, Model model) throws Exception{
		BoardDTO bdto=boardService.read(num);
		model.addAttribute("bdto",bdto);
		return "boardEx01/bUpdate";	
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.POST)
	public String boardUpdate(BoardDTO bdto, Model model) throws Exception{
		if(boardService.modify(bdto)) model.addAttribute("success" , true);
		else {model.addAttribute("success" , false);}
		return "boardEx01/bUpdatePro";	
	}
	
	@RequestMapping(value="/boardDelete", method=RequestMethod.GET)
	public String deleteBoardForm(@RequestParam("num") int num, Model model) throws Exception{
		BoardDTO bdto=boardService.read(num);
		model.addAttribute("bdto",bdto);
		return "boardEx01/bDelete";
	}
	
	@RequestMapping(value="/boardDelete", method=RequestMethod.POST)
	public String deleteBoard(BoardDTO bdto, Model model) throws Exception{
		boolean isSucceed=boardService.remove(bdto);
		if(isSucceed) {model.addAttribute("success",true);}
		else {
			
			model.addAttribute("success",false);
		}
		return "boardEx01/bDeletePro";
	}
	
}
