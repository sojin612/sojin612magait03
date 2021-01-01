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


public class ArrayEx25_정답3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int idx=0;
		int cnt=0;
		while(cnt<5) {
			int max=0;
			System.out.println(Arrays.toString(arr));
			System.out.println("가장 큰값을 입력");
			int num=scan.nextInt();
			for (int i = 0; i < arr.length; i++) {
				if(max<arr[i]) {
					max=arr[i];	
					idx=i;
				}
			}
			if(num==max) {
				arr[idx]=0;
				cnt++;
			}
			else {
				System.out.println("정답이 아닙니다");
				continue;
			}
			
		}
		
		
	}
}
