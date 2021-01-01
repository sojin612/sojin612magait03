package step3_01.arrayAdvance1;

import java.util.Scanner;

/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */


public class ArrayEx30_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int usrCnt = 0;
		int identifier = -1;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			
			
			System.out.println("현재 회원수는"+usrCnt+"명입니다");
			for (int i = 0; i < usrCnt; i++) {
				System.out.println(arId[i]+":"+arPw[i]+"("+arMoney[i]+"원)");
			}
			System.out.print("접속자: ");
			if(identifier==-1) {
				System.out.println("없음");
			}
			else {
				System.out.println(arId[identifier]);
			}
			System.out.println(menu);
			
			int sel = scan.nextInt();
			if(sel == 1) {
				int check=0;
				if(usrCnt==5) {
					System.out.println("회원가입은 5명까지만 가능합니다");
				}
				else {
					System.out.println("가입할 id를 입력하세요");
					int getId=scan.nextInt();
					for (int i = 0; i < usrCnt; i++) {
						if(getId==arId[i]) {
							check=-1;
						}	
					}
					if(check==-1) {
						System.out.println("id가 중복됩니다");
						continue;
					}
					else {
						System.out.println("pw를 입력하세요");
						int getPw=scan.nextInt();
						arId[usrCnt]=getId;
						arPw[usrCnt]=getPw;
						arMoney[usrCnt]=1000;
						usrCnt++;
						System.out.println("가입이 완료되었습니다");
					}
				}
			}
			else if(sel == 2) {
				if(identifier==-1) {
					System.out.println("로그인시 이용가능");
				}
				else {
					for (int i = identifier; i < usrCnt-1; i++) {
						arId[i]=arId[i+1];
						arPw[i]=arPw[i+1];
						arMoney[i]=arMoney[i+1];
					}
					usrCnt--;
					identifier=-1;
					System.out.println("회원탈퇴 되었습니다");
				}
			}
			else if(sel == 3) {
				if(identifier==-1) {
					int check=-1;
					System.out.println("id를 입력하세요");
					int logId=scan.nextInt();
					System.out.println("pw를 입력하세요");
					int logPw=scan.nextInt();
					for (int i = 0; i < usrCnt; i++) {
						if(logId==arId[i] && logPw==arPw[i]) {
							check=i;
						}
					}
					if(check==-1) {
						System.out.println("id와 pw를 확인해주세요");
					}
					else {
						identifier=check;
						System.out.println(arId[identifier]+"님 환영합니다");
					}
				}
				else {
					System.out.println("현재"+arId[identifier]+"님이 로그인중입니다");
				}
			}
			else if(sel == 4) {
				if(identifier==-1) {
					System.out.println("로그인 시 이용가능");
				}
				else {
					identifier=-1;
					System.out.println("로그아웃 되었습니다");
				}
			}
			else if(sel == 5) {
				if(identifier==-1) {
					System.out.println("로그인시 이용가능");
				}
				else {
					System.out.println("입금할 금액을 입력하세요");
					int deposit=scan.nextInt();
					arMoney[identifier]+=deposit;
					System.out.println("입금이 완료되었습니다");
				}
			}
			else if(sel == 6) {
				if(identifier==-1) {
					System.out.println("로그인시 이용가능");
				}
				else {
					int check=-1;
					System.out.println("이체할 계좌번호를 입력하세요");
					int acc=scan.nextInt();
					for (int i = 0; i < usrCnt; i++) {
						if(acc==arId[i]) {
							check=i;
						}
					}
						if(check==-1) {
							System.out.println("계좌번호를 확인해주세요");
							continue;
						}
						else {
							System.out.println("이체할 금액을 입력하세요");
							int money=scan.nextInt();
							if(arMoney[identifier]>=money) {
								arMoney[identifier]-=money;
								arMoney[check]+=money;
								System.out.println("이체가 완료되었습니다");
							}
							else {
								System.out.println("잔액이 모자랍니다");
							}
						}
					
				}
			}
			else if(sel == 7) {
				if(identifier==-1) {
					System.out.println("로그인시 이용가능");
				}
				else {
					System.out.println(arId[identifier]+"님의 잔액은"+arMoney[identifier]+"원입니다");
				}
			}
			else if(sel == 0) {
				break;
			}
		}



	}

}
