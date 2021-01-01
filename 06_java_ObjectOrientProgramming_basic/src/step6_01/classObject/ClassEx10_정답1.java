package step6_01.classObject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */
//9:35~10:20
import java.util.Scanner;

class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}


public class ClassEx10_정답1 {

	public static void main(String[] args) {
		Ex10 e1= new Ex10();
		Scanner scan= new Scanner(System.in);
		int sel=0;
		int size=e1.arPrice.length;
		while(true) {
			System.out.println(e1.name);
			for (int i = 0; i < e1.arMenu.length; i++) {
				System.out.println((i+1)+e1.arMenu[i]+" "+e1.arPrice[i]);
			}
				System.out.println("5.주문");
				System.out.println("6.결제");
				sel=scan.nextInt();
			if(sel==5) {
				
				System.out.println("주문할 메뉴번호를 입력하세요");
				int choice=scan.nextInt();
				if(choice>=1 && choice<= size) {
					choice--;
					e1.arCount[choice]++;
				}
			}
			if(sel==6) {
				for (int i = 0; i < e1.arMenu.length; i++) {
					System.out.println(e1.arMenu[i]+e1.arCount[i]+"개"+e1.arCount[i]*e1.arPrice[i]);
					e1.total=e1.total+(e1.arCount[i]*e1.arPrice[i]);
				}
				System.out.println("결제할 금액"+e1.total+"원 입니다");
				System.out.println("입금할 금액을 입력하세요");
				int deposit = scan.nextInt();
				if(deposit>=e1.total) {
					System.out.println("영수증");
					for (int i = 0; i < e1.arMenu.length; i++) {
						System.out.println(e1.arMenu[i]+e1.arCount[i]+"개"+e1.arCount[i]*e1.arPrice[i]);
					}
					System.out.println("합계"+e1.total);
					System.out.println("받은금액"+deposit);
					System.out.println("잔돈"+(deposit-e1.total));
				}
				else {
					System.out.println("잔액이 모자랍니다");
				}
			}
				
		}
		
		
		
	}

}
