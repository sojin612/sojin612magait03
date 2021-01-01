package step8_02.atm_v2;

import java.util.Scanner;

public class ATM2 {
	
	 Scanner scan = new Scanner(System.in);
	 UserManager um = UserManager.getInstance();
	 int identifier=-1;
	
	void play() {
		
		FileManager.getInstance().load();
		um.printAllUser();
		
		while(true) {
			System.out.println("1)회원가입");
			System.out.println("2)로그인");
			System.out.println("0)종료");
			System.out.print("메뉴 선택");
			int sel=scan.nextInt();
			if(sel==1) join();
			else if(sel==2) login();
			else if(sel==0) break;	
		}
	}
	void login() {
		identifier =um.logUser();
		if(identifier==-1) {
			System.out.println("로그인실패");
		}
		else {
			loginMenu();
		}
	}
	void loginMenu() {
		while(true) {
			System.out.println("1.계좌생성");
			System.out.println("2.계좌삭제");
			System.out.println("3.조 회");
			System.out.println("4.회원탈퇴");
			System.out.println("5.로그아웃");
			System.out.print("메뉴선택: ");
			int sel= scan.nextInt();
			if(sel==1) {
				AccountManager2.getInstance().creatAcc(identifier);
			}
			else if(sel==2) {
				AccountManager2.getInstance().delAcc(identifier);
				
			}
			else if(sel==3) {
				AccountManager2.getInstance().printAcc(identifier);
			}
			else if(sel==4) {
				identifier = um.deleteMember(identifier);
				break;
			}
			else if(sel==5) {
				identifier=-1;
				System.out.println("로그아웃완료");
				break;
			}
		
		}
	}

	void join() {
		um.joinMember();
	}
	
}
