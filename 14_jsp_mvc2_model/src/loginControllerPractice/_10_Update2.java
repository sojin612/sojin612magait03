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


@WebServlet("/_10_Update2")
public class _10_Update2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id= (String)session.getAttribute("memId");
		
		MemberDTO2 mdto=MemberDAO2.getInstance().info(id);
		
		if(mdto.getField() != null) {
			
			String[] skills= mdto.getSkill().split(",");
			for (String skill : skills) {
				if(skill.equals("html")) request.setAttribute("html", true);
				if(skill.equals("css")) request.setAttribute("css", true);
				if(skill.equals("javascript")) request.setAttribute("javascript", true);
			}
			
			request.setAttribute("mdto", mdto);
			request.setAttribute("isFirstApply", false);
			
		}else {
			request.setAttribute("isFirstApply", true);
		}
		
		RequestDispatcher dis= request.getRequestDispatcher("_01_loginPractice/10_update.jsp");
		dis.forward(request, response);
		
	}
}
