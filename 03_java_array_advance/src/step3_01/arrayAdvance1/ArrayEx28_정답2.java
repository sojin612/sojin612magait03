package step3_01.arrayAdvance1;

import java.util.Arrays;
import java.util.Random;

/*
 * # 중복숫자 금지[2단계]
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */


public class ArrayEx28_정답2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int[] check=new int[10];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			int rnum=ran.nextInt(10);
			if(check[rnum]==0) {
				check[rnum]=1;
				arr[i]=rnum+1;
			}
			else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
