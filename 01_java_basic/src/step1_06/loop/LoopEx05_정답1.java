package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_정답1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		
		int menu=0;
		int i=0;
		int n1=0;
		int n2=0;
		int n3=0;
		
		while(i<5) {
			System.out.println("메뉴를 입력해");
			menu =scan.nextInt();
		  if(menu==1) {
			n1=n1+1;
			
		  }
		  if(menu==2) {
			n2=n2+1;
		  }
		  if(menu==3) {
			n3=n3+1;
		  }
		  i++;	
		  
		} 
		int total=price1*n1+price2*n2+price3*n3;
		System.out.println("현금을 입력하세요");
		int cash= scan.nextInt();
		int charge= cash-total;
		System.out.println("영수증");
		System.out.println("불고기버거="+n1);		
		System.out.println("새우버거="+n2);
		System.out.println("콜라="+n3);
		System.out.println("총금액은="+total+"잔액은="+charge);
		
		
	}

}
