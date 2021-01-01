package step3_02.arrayAdvance2;

import java.util.Arrays;
import java.util.Random;

/*
 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 5
 * 
 *  - 1부터 5까지 숫자를 2개씩 넣고 셔플로 이용해서 섞지 말것
 * 
 */

public class ArrayEx46_테스트문제정답1 {

	public static void main(String[] args) {
		
		Random ran =new Random();
		int[] arr= new int[10];
		int[]check= new int[10];
		int rNum=0;
		
		for (int i = 0; i < arr.length; i++) {
			rNum=ran.nextInt(5);
			if(check[rNum]==0) {
				check[rNum]=1;
				arr[i]=rNum+1;
			}
			else if(check[rNum]==1) {
					check[rNum]=2;
					arr[i]=rNum+1;	
			}
			else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	
	}

}
