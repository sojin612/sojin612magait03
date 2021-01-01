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


public class LoopEx25_테스트정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter Number ? ");
			int getNumber = scan.nextInt();
			
			for (int k = 0; k < 10; k++) {
				int count=0;
				int sosu=getNumber+k;
				if(getNumber<sosu) {
					for (int i = 1; i <=sosu; i++) {
						if((sosu)%i==0)
							count++;
					}
					if(count==2) {
						System.out.println(sosu);
						break;
					}
					
				}
			}
				
		}
		
		
		
		
		
	}

}
