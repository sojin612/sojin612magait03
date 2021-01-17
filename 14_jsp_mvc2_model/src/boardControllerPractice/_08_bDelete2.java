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


@WebServlet("/_08_bDelete2")
public class _08_bDelete2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		reqPro(request, response);
	}

	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		BoardDTO2 bdto=BoardDAO2.getInstance().getOneBoard(Integer.parseInt(request.getParameter("num")));
		
		RequestDispatcher dis= request.getRequestDispatcher("boardPractice/08_bDelete.jsp");
		dis.forward(request, response);
		
		
		
	}

}
