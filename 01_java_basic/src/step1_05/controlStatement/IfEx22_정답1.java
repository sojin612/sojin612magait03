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

public class IfEx22_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int xy= ran.nextInt(50)+1;
		int x=xy/10;
		int y=xy%10;
		int count = 0;
		if(x==3||x==6||x==9) {
		  count=count+1;
		}
		if(y==3||y==6||y==9) {
			count = count+1;
		}
		if(count==1) {
			System.out.println(xy+"짝");
		}
		if(count==2) {
			System.out.println(xy+"짝짝");
		}
		if(count==0) {
			System.out.println(xy);
		}
		
	}

}
