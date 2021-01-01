package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */

public class LoopEx08_정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(identifier==-1) {
					System.out.println("계좌번호를 입력하세요");
					int myAcc= scan.nextInt();
					System.out.println("비밀번호를 입력하세요");
					int myPw= scan.nextInt();
					if(dbAcc1==myAcc && dbPw1==myPw) {
						System.out.println("로그인 성공");
						identifier=1;
					}
					else if(dbAcc2==myAcc && dbPw2==myPw) {
						System.out.println("로그인 성공");
						identifier=2;
					}
					else {
						System.out.println("계좌번호와 비밀번호를 확인하세요");
					}
				}
				else if(identifier==1||identifier==2) {
					System.out.println("재로그인 불가,로그아웃상태에서만 이용가능");
				}
			}
			else if(sel == 2) {
				if(identifier==1||identifier==2) {
					System.out.println("로그아웃 성공");
					identifier=-1;
				}
				else if(identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
			}
			else if(sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		

		}	
	}

}
