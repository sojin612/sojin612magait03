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


@WebServlet("/_08_ApplyAction2")
public class _08_ApplyAction2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		String id= (String)session.getAttribute("memId");
		
		String field=request.getParameter("field");
		String[] temp=request.getParameterValues("skill");
		String major=request.getParameter("major");
		String skill="";
		for (int i = 0; i < temp.length; i++) {
			skill+=temp[i];
			if(i!=temp.length-1) {
				skill+=",";
			}
		}
		
		MemberDAO2.getInstance().apply(id,field,skill,major);
		
		RequestDispatcher dis= request.getRequestDispatcher("_01_loginPractice/08_applyPro.jsp");
		dis.forward(request, response);
		
	}
}
