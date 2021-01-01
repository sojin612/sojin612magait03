package step3_01.arrayAdvance1;

import java.util.Arrays;

/*
 * # 석차 출력
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_정답2 {
	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		
		for (int i = 0; i < scores.length; i++) {
			int name1=scores[i];
			int idx=i;
			for (int j = i; j < scores.length; j++) {
				if(name1<scores[j]) {
					name1=scores[j];
					idx=j;
				}
			}
			int temp=scores[i];
			scores[i]=scores[idx];
			scores[idx]=temp;
			
			String temp2=names[i];
			names[i]=names[idx];
			names[idx]=temp2;
		}
		
		System.out.println(Arrays.toString(names));
	}

}
