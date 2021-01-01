package step8_03.atm_v3;

import java.util.Random;
import java.util.Scanner;

public class ATM2 {
	
	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	UserManager2 um= UserManager2.getInstance();
	
	ATM2() {
		boolean isLoad=FileManager2.getInstance().loadData();
		if(!isLoad) {
			UserManager2.getInstance().setDummy();
			FileManager2.getInstance().saveData();
		}
	}
	
	
	void showMenu() {
		printAllDataByAllUser();
		while(true) {
			System.out.println("1)회원가입\n2)로그인\n0)종료");
			System.out.print("메뉴선택: ");
			int sel= scan.nextInt();
			if(sel==1) {
				join();
			}
			else if(sel==2) {
				login();
			}
			else if(sel==0) {
				break;
			}
		}
	}
	
	
	void printAllDataByAllUser() {
		um.printAllUserInfo();
		
	}
	
	
	void login() { 
		
		um.loginUser();
	}
	
	
	void join() { 
		
		um.joinUser();
		
	}
	
	
	
}







