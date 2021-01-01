package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx22_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(50) + 1;
		System.out.println("문제 = " + rNum);
		
		int x = rNum / 10;
		int y = rNum % 10;
		
		int cnt = 0;       
		if(x == 3 || x == 6 || x == 9 ) {
			cnt = cnt + 1;
		}
		if(y == 3 || y == 6 || y == 9) {
			cnt = cnt + 1;
		}
		
		if(cnt == 2) {
			System.out.println("짝짝");
		}else if(cnt == 1) {
			System.out.println("짝");
		}else {
			System.out.println(rNum);
		}

	}

}
