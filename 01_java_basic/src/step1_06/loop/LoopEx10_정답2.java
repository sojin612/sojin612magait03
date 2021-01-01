package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 */

public class LoopEx10_정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(identifier!=-1) {
					System.out.println("재로그인 불가/로그아웃상태에서만 이용가능");
				}
				else {
					System.out.println("아이디 입력");
					int id= scan.nextInt();
					System.out.println("pw입력");
					int pw= scan.nextInt();
					if(id==dbAcc1 && pw==dbPw1) {
						identifier=1;
						System.out.println("로그인 완료");
					}
					else if(id==dbAcc2 && pw==dbPw2) {
						identifier=2;
						System.out.println("로그인 완료");
					}
					else {
						System.out.println("아이디와 비번을 다시 확인해주세요");
					}
				}
			}
			else if(sel == 2) {
				if(identifier==-1) {
					System.out.println("로그인후 이용가능");
				}
				else {
					identifier=-1;
					System.out.println("로그아웃 완료");
				}
			}
			else if(sel == 3) {
				if(identifier==-1) {
					System.out.println("로그인후 이용가능");
				}
				else {
					if(identifier==1) {
						System.out.println("입금할 금액 입력");{
						int money=scan.nextInt();
						dbMoney1+=money;
						System.out.println("입금완료");
						}
					}
					else if(identifier==2) {
						System.out.println("입금할 금액 입력");{
						int money=scan.nextInt();
						dbMoney2+=money;
						System.out.println("입금완료");
						}
					}
				}
			}
			else if(sel == 4) {
				if(identifier==-1) {
					System.out.println("로그인후 이용가능");
				}
				else {
					if(identifier==1) {
						System.out.println("출금할 금액입력");
						int money= scan.nextInt();
						if(dbMoney1>=money) {
							dbMoney1-=money;
							System.out.println("출금완료");
						}
						else {
							System.out.println("잔액이 모자랍니다");
						}
					}
					else if(identifier==2) {
						System.out.println("출금할 금액입력");
						int money= scan.nextInt();
						if(dbMoney2>=money) {
							dbMoney2-=money;
							System.out.println("출금완료");
						}
						else {
							System.out.println("잔액이 모자랍니다");
						}
					}
				}
			}
			else if(sel == 5) {
				if(identifier==-1) {
					System.out.println("로그인후 이용가능");
				}
				else {
					if(identifier==1) {
						System.out.println("이체할 계좌입력");
						int acc=scan.nextInt();
						if(acc==dbAcc2) {
							System.out.println("이체할 금액입력");
							int money=scan.nextInt();
							if(dbMoney1>=money) {
								dbMoney1-=money;
								dbMoney2+=money;
								System.out.println("이체완료");
							}
							else {
								System.out.println("잔액이 모자랍니다");
							}
						}
						else{
							System.out.println("계좌번호를 다시 확인해주세요");
						}
					}
					if(identifier==2) {
						System.out.println("이체할 계좌입력");
						int acc=scan.nextInt();
						if(acc==dbAcc1) {
							System.out.println("이체할 금액입력");
							int money=scan.nextInt();
							if(dbMoney2>=money) {
								dbMoney2-=money;
								dbMoney1+=money;
								System.out.println("이체완료");
							}
							else {
								System.out.println("잔액이 모자랍니다");
							}
						}
						else {
							System.out.println("계좌번호를 다시 확인해주세요");
						}
					}
				}
			}
			else if(sel == 6) {
				if(identifier==-1) {
					System.out.println("로그인후 이용가능");
				}
				else {
					if(identifier==1) {
						System.out.println("잔액은"+dbMoney1+"원 입니다");
					}
					else if(identifier==2) {
						System.out.println("잔액은"+dbMoney2+"원 입니다");
					}
				}
			}
			else if(sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	

	}

}
