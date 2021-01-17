package boardControllerPractice;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import boardDAO2.BoardDAO2;
import boardDTO2.BoardDTO2;


@WebServlet("/_04_bList2")
public class _04_bList2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Vector<BoardDTO2> boardList= BoardDAO2.getInstance().getAllBoard();
		
		request.setAttribute("boardList", boardList);
		
		RequestDispatcher dis= request.getRequestDispatcher("boardPractice/04_bList.jsp");
		dis.forward(request, response);
		
	}
}
