package boardControllerPractice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import boardDAO2.BoardDAO2;
import boardDTO2.BoardDTO2;


@WebServlet("/_07_bUpdateAction2")
public class _07_bUpdateAction2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		reqPro(request, response);
	}

	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		BoardDTO2 bdto =new BoardDTO2();
		bdto.setNum(Integer.parseInt(request.getParameter("num")));
		bdto.setPassword(request.getParameter("password"));
		bdto.setSubject(request.getParameter("subject"));
		bdto.setContent(request.getParameter("content"));
		
		boolean isUpdate=BoardDAO2.getInstance().update(bdto);
		
		request.setAttribute("isUpdate", isUpdate);
		
		RequestDispatcher dis= request.getRequestDispatcher("boardPractice/07_bUpdatePro.jsp");
		dis.forward(request, response);
		
	}

}
