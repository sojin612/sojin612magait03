package loginControllerPractice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import loginDaoPractice.MemberDAO2;
import loginDtoPractice.MemberDTO2;


@WebServlet("/_11_UpdateAction2")
public class _11_UpdateAction2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session= request.getSession();
		
		String id= (String)session.getAttribute("memId");
		String pw= request.getParameter("pw");
		String name= request.getParameter("name");
		String tel= request.getParameter("tel");
		String email= request.getParameter("email");
		String field= request.getParameter("field");
		String[] temp= request.getParameterValues("skill");
		String major= request.getParameter("major");
		
		String skill="";
		
		for (int i = 0; i < temp.length; i++) {
			skill+=temp[i];
			if(i!=temp.length-1) {
				skill+=",";
			}
		}
		MemberDTO2 mdto= new MemberDTO2();
		mdto.setPw(pw);
		mdto.setName(name);
		mdto.setTel(tel);
		mdto.setEmail(email);
		mdto.setField(field);
		mdto.setSkill(skill);
		mdto.setMajor(major);
		
		MemberDAO2.getInstance().update(id, mdto);
		
		RequestDispatcher dis = request.getRequestDispatcher("_01_loginPractice/11_updatePro.jsp");
		dis.forward(request, response);
		
	}

}
