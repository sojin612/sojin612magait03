package step2_01.array;

import java.util.Scanner;

/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */



public class ArrayEx09_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X','X','X','X','X','X','X'};
		//7
		int index = 0;
		int fee=0;
		for (int i = 0; i < seat.length; i++) {
			System.out.println("좌석번호를 입력하세요.");
			index =scan.nextInt();
			if(seat[index]==1) {
				System.out.println("이미 예매가 완료된 좌석임으로 구매가 불가능합니다.");
			}	
			else if(seat[index]!=1) {
				seat[index]=1;
				fee=fee+12000;
			}
			
		}
		System.out.println("매출액은"+fee);
		
		
		
	}
	
}
