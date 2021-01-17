package loginControllerPractice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginDaoPractice.MemberDAO2;
import loginDtoPractice.MemberDTO2;


@WebServlet("/_07_Apply2")
public class _07_Apply2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession();
		String id=(String)session.getAttribute("memId");
		
		if(id!=null) {
			
			MemberDTO2 mdto=MemberDAO2.getInstance().info(id);
			request.setAttribute("mdto", mdto);
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("_01_loginPractice/07_apply.jsp");
		dis.forward(request, response);
	}
}
