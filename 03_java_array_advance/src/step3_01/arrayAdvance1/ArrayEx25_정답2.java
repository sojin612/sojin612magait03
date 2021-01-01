package step3_01.arrayAdvance1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 * 
 */


public class ArrayEx25_정답2 {

	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int count=0;
		int getscore=0;
		while(count<5) {
			int maxidx=0;
			int maxmum=0;
			System.out.println(Arrays.toString(arr));
			Scanner scan = new Scanner(System.in);
			System.out.println("가장 큰 숫자를 입력하세요");
			getscore= scan.nextInt();
			for (int i = 0; i < arr.length; i++) {
				if(maxmum<arr[i]) {
					maxmum=arr[i];
					maxidx=i;
				}
			}
			if(getscore==arr[maxidx]) {
				arr[maxidx]=0;
				count++;
				
			}
			else {
				System.out.println("잘못입력했습니니다");
			}
		}
		
	}
}
