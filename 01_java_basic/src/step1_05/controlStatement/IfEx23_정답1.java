package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx23_정답1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("정거장 수를 입력해");
		int station = scan.nextInt();
		int fee=0;
		int n=station-10;
		if(station>=1&&station<=5) {
			fee=500;
		}
		else if(station>=6&&station<=10) {
			fee=600;
		}
		
		else if (station>10) {
			fee=600+(n+1)/2*50;
		}
		
		System.out.println("요금은="+fee);
		
	}

}
