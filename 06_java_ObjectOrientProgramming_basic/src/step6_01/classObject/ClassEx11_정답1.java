package step6_01.classObject;
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
//03:00~4:00
import java.util.Scanner;


class Ex11{
	String name = "";
	
	String[] arAcc = {"", "", "", "", ""};
	String[] arPw  = {"", "", "", "", ""};
	int[] arMoney  = {87000, 34000, 17500, 98000, 12500};
	
	int accCnt = 0;
	int identifier = -1;
}


public class ClassEx11_정답1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11 e = new Ex11();
		e.name = "Mega Bank";
		while (true) {
			int check=-1;
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.println("가입할 id를 입력하세요");
				String myId=scan.next();
				for (int i = 0; i < e.arAcc.length; i++) {
					if(myId.equals(e.arAcc[i])) {
						check=i;
					}
				}
				if(check==-1) {
					System.out.println("pw를 입력하세요");
					String myPw=scan.next();
					e.arAcc[e.accCnt]=myId;
					e.arPw[e.accCnt]=myPw;
					e.arMoney[e.accCnt]+=1000;
					e.accCnt++;
					System.out.println("회원가입완료");
				}
				else {
					System.out.println("id가 중복됩니다");
					continue;
				}
				
			}
			else if (sel == 2) {
				if(e.identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					
					for (int i = 0; i < e.accCnt-1; i++) {
						e.arAcc[i]=e.arAcc[i+1];
						e.arPw[i]=e.arPw[i+1];
						e.arMoney[i]-=1000;
					}
					e.identifier=-1;
					System.out.println("회원탈퇴완료");
				}
			}
			else if (sel == 3) {
				
				if(e.identifier!=-1) {
					System.out.println(e.arAcc[e.identifier]+"님 로그인 중입니다");
				}
				else {
					System.out.println("id를 입력하세요");
					String myId2=scan.next();
					System.out.println("pw를 입력하세요");
					String myPw2=scan.next();
					for (int i = 0; i < e.arAcc.length; i++) {
						if(myId2.equals(e.arAcc[i])&& myPw2.equals(e.arPw[i])) {
							check=i;
							e.identifier=i;
							System.out.println(e.arAcc[e.identifier]+"님 로그인 되었습니다");
						}
					}
					if(check==-1) {
						System.out.println("id와 pw를 확인해주세요");
						continue;
					}
					
				}
			}
			else if (sel == 4) {
				if(e.identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					e.identifier=-1;
					System.out.println("로그아웃 되었습니다");
				}
			}
			else if (sel == 5) {
				if(e.identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					System.out.println("입금할 금액을 입력하세요");
					int deposit=scan.nextInt();
					e.arMoney[e.identifier]+=deposit;
					System.out.println("입금완료");
				}
			}
			else if (sel == 6) {
				if(e.identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					System.out.println("이체할 계좌번호를 입력하세요");
					String youId=scan.next();
					for (int i = 0; i < e.arAcc.length; i++) {
						if(youId.equals(e.arAcc[i])) {
							check=i;
						}
					}
					if(check!=-1) {
						System.out.println("이체할 금액을 입력하세요");
						int money=scan.nextInt();
						if(e.arMoney[e.identifier]>=money) {
							e.arMoney[e.identifier]-=money;
							System.out.println("이체완료");
						}
						else {
							System.out.println("잔액이 모자랍니다");
							continue;
						}
					}
					else {
						System.out.println("계좌번호를 확인해주세요");
						continue;
					}
						
					
				}
			}
			else if (sel == 7) {
				if(e.identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					System.out.println(e.arAcc[e.identifier]+"님의 잔액은"+e.arMoney[e.identifier]);
				}
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		
	}

}
