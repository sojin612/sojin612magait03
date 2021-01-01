package step2_01.array;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		int getacc=0;
		int getpw=0;
		int	getacc2=0;
		int getpw2=0;
		int check=1;
		while (isRun) {
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if	(selectMenu == 1) {
				if(accsCnt==5) {
					System.out.println("더이상 가입할 수 없습니다");
					continue;
				}
				System.out.println("계좌번호를 입력하세요");
				getacc=scan.nextInt();
				for (int i = 0; i < pws.length; i++) {
					if(getacc==accs[i]) {
						check=-1;
						if(check==-1) {
							System.out.println("계좌번호가 중복됩니다");
						}
					}
					if(getacc!=accs[i]) {
						System.out.println("비밀번호를 입력하세요");
						getpw=scan.nextInt();
						accs[accsCnt]=getacc;
						pws[accsCnt]=getpw;
						accsCnt++;
						System.out.println("가입이 완료됐습니다");
					}
				}	
			}
			
			else if (selectMenu == 2) {
				check=1;
				System.out.println("탈퇴할 계좌번호를 입력하세요");
				getacc2=scan.nextInt();
				for (int i = 0; i < pws.length; i++) {
					if (getacc2==accs[i]) {
						check=i;
					}
					if(check==1) {
						System.out.println("해당되는 계좌가 없습니다");
					}
					else {
						for (i = 0; i < accsCnt-1; i++) {
							accs[i]=accs[i+1];
							pws[i]=pws[i+1];
						}
						accs[accsCnt]=0;
						pws[accsCnt]=0;
						accsCnt--;
					}
				}
					
			}
			
			else if (selectMenu == 3) {
				isRun= false;
			}
			
		}	
	
		
	}
}
