package _00_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Join.do")  // 프로젝트이름/url이름(join.do)
public class Join extends HttpServlet {
	
	private static final long serialVersionUID = 1L;//servlet생성시 기본값으로 생성, 크게의미없음
       
	//get방식으로 요청이 들어왔을때 reqPro로 포워딩
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	//post방식으로 요청이 들어왔을때 reqPro포워딩
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	//get , post 형식으로 요청되어도 결국 아래의 메서드가 실행이 됨
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//페이지 이동방식
		RequestDispatcher dis = request.getRequestDispatcher("step09_servlet/01_join.jsp");// (webcontent안/)패키지명/jsp파일명
		dis.forward(request, response);
		
		
	}

}
