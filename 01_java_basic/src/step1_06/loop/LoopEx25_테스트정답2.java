package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계]
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 */


public class LoopEx25_테스트정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int Num = scan.nextInt();
		for (int i = 1; i < 50; i++) {
			int cnt=0;
			for (int j = 1; j <= (Num+i); j++) {
				if((Num+i)%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.println(Num+i);
				break;
			}
			
		}
		
		
		
		
		scan.close();
		
	}

}
