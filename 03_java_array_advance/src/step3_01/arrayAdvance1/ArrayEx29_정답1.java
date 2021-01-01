package step3_01.arrayAdvance1;

import java.util.Arrays;
import java.util.Random;

/*
 * # 숫자 야구 게임
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		    strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 7 5 1        : 1b
 * 1 5 6		: 1s
 * 1 7 3        : 1s 2b
 * 2 4 9        : 없음
 * 1 7 3        : 3s  > 게임종료
 * 
 */

public class ArrayEx29_정답1 {

	public static void main(String[] args) {
		
		int[] com = {1,7,3};
		int[] me  = new int[3];
		
		int strike=0;
		int ball=0;
		Random ran = new Random();
		int[] check = new int[9];
		while(true) {
			for (int i = 0; i < me.length; i++) {
				int rannum=ran.nextInt(9);
				if(check[rannum]==0) {
					check[rannum]=1;
					me[i]=rannum+1;
				}
				else {
					i--;
				}
			}
			System.out.println(Arrays.toString(com));
			System.out.println(Arrays.toString(me));
			for (int i = 0; i < me.length; i++) {
				for (int j = 0; j < me.length; j++) {
					if(com[i]==me[j]) {
						if(i==j) {
							strike++;
							if(strike==3) {
								break;
							}
						}
						if(i!=j) {
							ball++;
						}
					}
				}
			}
		}
		
	}
	
}
