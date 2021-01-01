package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_정답1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력");
		int x = scan.nextInt();
		System.out.println("정수입력");
		int y = scan.nextInt();
		System.out.println("정수입력");
		int z = scan.nextInt();
		
		int maxmum=x;
		
		if(maxmum<y) {
			maxmum=y;
		}
		if(maxmum<z) {
			maxmum=z;
		}
		
		System.out.println("최대값은="+maxmum);
		
		

	}

}
