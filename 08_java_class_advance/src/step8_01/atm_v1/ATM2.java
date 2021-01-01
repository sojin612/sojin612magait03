package step8_01.atm_v1;
import java.util.Random;
import java.util.Scanner;

public class ATM2 {
	Scanner scan = new Scanner(System.in);
	UserManager userManager = new UserManager();
	
	int identifier= -1;
	void printMainMenu(){
		while(true) {
		System.out.println("메가ATM");
		System.out.println("1.로그인 2.로그아웃 3.회원가입 4.회원탈퇴 0.종료");
		int sel = scan.nextInt();
		if(sel==1) { login(); }
		else if(sel==2) { logout();}
		else if(sel==3) { join(); }
		else if(sel==4) { leave(); }
		else if(sel==0) { break; }
		
		}
	}
	void login() {
		identifier = userManager.logUser();
		if(identifier==-1) {
			printAccountMenu();
		}
		else {
			System.out.println("로그인 실패");
		}
	}
	
	void logout() {
		if(identifier==-1) {
			System.out.println("로그인 후 이용가능");
		}
		else {
			identifier=-1;
			System.out.println("로그아웃 완료");
		}
	}
	
	void join() {
		userManager.addUser();
	}
	
	
	void leave() {
		userManager.leave();
	}
	
	
	void printAccountMenu() {
		
	}
	
}
