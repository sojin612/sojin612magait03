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


public class ArrayEx25_정답1 {

	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		Scanner scan = new Scanner(System.in);
		int maxmum=0;
		int maxnum=0;
		int count=0;
		
			for (int i = 0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr));
				System.out.println("가장 큰 값을 입력하세요");
				int num=scan.nextInt();
				for (int j = 0; j < arr.length; j++) {
					if(maxmum<arr[j]) {
						maxmum=arr[j];
						maxnum=j;
					}	
				}
				
				if(maxmum==num) {
					arr[maxnum]=0;
					maxmum=0;
					count++;
				}
				else {
					System.out.println("정답이 아닙니다");
					continue;
				}
				if(count==5) {
					System.out.println("종료");
					break;
				}
			}
	}
}
