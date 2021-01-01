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

public class ArrayEx46_테스트문제정답2 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] check = new int[5];
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int rnum= ran.nextInt(5);
			if(check[rnum]==0) {
				check[rnum]=1;
				arr[i]=rnum+1;
				
			}
			else if(check[rnum]==1) {
				check[rnum]=2;
				arr[i]=rnum+1;
				
			}
			else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
