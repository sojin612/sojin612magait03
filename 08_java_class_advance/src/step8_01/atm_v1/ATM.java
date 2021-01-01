package step8_01.atm_v1;
import java.util.Random;
import java.util.Scanner;

public class ATM {
	
	Scanner scan = new Scanner(System.in);
	Random ran   = new Random();
	UserManager userManager = new UserManager();
	int identifier = -1;
	
	void printMainMenu() {
				
		while (true) {
			
			System.out.println("\n[ MEGA ATM ]");
			System.out.print("[1.로그인] [2.로그아웃] [3.회원가입] [4.회원탈퇴] [0.종료] : ");
			int sel = scan.nextInt();
			
			if      (sel == 1) 	    login();
			else if (sel == 2) 		logout();
			else if (sel == 3) 		join();
			else if (sel == 4) 		leave();
			else if (sel == 0) {
				System.out.println("[메시지] 프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
	
	
	
	void login() {
		
		identifier = userManager.logUser();
		
		if (identifier != -1) {
			printAccountMenu();
		}
		else {
			System.out.println("[메세지] 로그인실패.");
		}
		
	}
	
	
	
	void join() {	
		
		userManager.addUser();
		
	}
	
	
	
	void logout() {
		
		if (identifier == -1) {
			System.out.println("[메시지] 로그인을 하신 후 이용하실 수 있습니다.");
		}
		else {
			identifier = -1;
			System.out.println("[메시지] 로그아웃 되었습니다.");
		}
		
	}
	
	
	
	void leave() {
		
		userManager.leave();
		
	}
	
	
	
	void printAccountMenu() {
		
		while (true) {
			System.out.print("[1.계좌생성] [2.계좌삭제] [3.조회] [0.뒤로가기] : ");
			int sel = scan.nextInt();
			if 		(sel == 1) {
				
				System.out.println("생성할 계좌번호를 입력하세요");
				String myAcc= scan.next();
				int check=userManager.user[identifier].check_acc(myAcc);
				if(check==-1) {
					userManager.user[identifier].add_acc(myAcc);
					System.out.println("계좌생성완료");
				}
				else {
					System.out.println("중복된 계좌입니다");
				}
			} 	
			else if (sel == 2) {
				
				System.out.println("삭제할 계좌번호를 입력하세요");
				String delAcc=scan.next();
				int check=userManager.user[identifier].check_acc(delAcc);
				if(check==-1) {
					System.out.println("없는 계좌입니다");
				}
				else {
					System.out.println(userManager.user[identifier].acc[check].number+"님의 계좌가 삭제되었습니다");
					int delidx=userManager.user[identifier].remove_acc(check);
				}
			} 	
			else if (sel == 3) {
				userManager.user[identifier].printAccount();
					
			}  
			
			else if (sel == 0) break; 	
		}
		
	}	
}
