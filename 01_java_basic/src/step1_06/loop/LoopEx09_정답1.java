package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */

public class LoopEx09_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int deposit=0;
			int withdraw=0;
			int acc=0;
			int cash=0;
			
			if(sel == 1) {
				System.out.println("입금할 금액을 입력하시오");
				cash= scan.nextInt();
				myMoney= myMoney+deposit;
			}
			else if(sel == 2) {
				System.out.println("출금할 금액을 입력하시오");
				withdraw=scan.nextInt();
				myMoney=myMoney-withdraw;
				if(withdraw>myMoney) {
					System.out.println("출금불가");
				}
			}
			else if(sel == 3) {
				System.out.println("이체할 계좌번호를 입력하시오");
				acc=scan.nextInt();
				if(acc==yourAcc) {
					System.out.println("이체할 금액을 입력하시오");
					cash=scan.nextInt();
					myMoney=myMoney-cash;
					yourMoney=yourMoney+cash;
					if(cash>yourMoney) {
						System.out.println("이체불가");
					}
				}
			}
			else if(sel == 4) {
				System.out.println("내잔액은="+myMoney+"이체한계좌잔액은="+yourMoney);
				
			}
			else if(sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}


	}

}
