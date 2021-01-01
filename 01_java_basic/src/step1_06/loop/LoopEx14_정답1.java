package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */

public class LoopEx14_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i=0;
		int maxmum=0;
		while(i<3) {
			System.out.println("정수를 입력하세요");
			int num = scan.nextInt();
			if(maxmum<num) {
				maxmum=num;
			}
			i++;
			
		}
		System.out.println("최대값은"+maxmum);
	}

}

