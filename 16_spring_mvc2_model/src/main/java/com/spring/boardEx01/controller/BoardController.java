package com.spring.boardEx01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //컨트롤러임을 명시(controller bean에 등록시킴)
public class BoardController {

	//value에는 url주소를 명시, method는 요청타입을 명시
	@RequestMapping(value="/main", method = RequestMethod.GET) 
	public String main() {
		return "boardEx01/01_main";  //servlet-context에 명시된 대로 포워딩 시킬 jsp파일을 작성해준다.
	}
}
