package loginControllerPractice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginDaoPractice.MemberDAO2;
import loginDtoPractice.MemberDTO2;


@WebServlet("/_03_JoinAction2")
public class _03_JoinAction2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		String name= request.getParameter("name");
		String tel= request.getParameter("tel");
		String email= request.getParameter("email");
		
		MemberDTO2 mdto = new MemberDTO2();
		mdto.setId(id);
		mdto.setPw(pw);
		mdto.setName(name);
		mdto.setTel(tel);
		mdto.setEmail(email);
		
		boolean isJoin=MemberDAO2.getInstance().joinMember(mdto);
		
		request.setAttribute("isJoin", isJoin);
		
		RequestDispatcher dis= request.getRequestDispatcher("_01_loginPractice/03_joinPro.jsp");
		dis.forward(request, response);
		
	}
}
