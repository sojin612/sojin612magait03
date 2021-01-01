package step3_01.arrayAdvance1;

import java.util.Arrays;

/*
 * # 석차 출력
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_정답1 {
	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		int maxmum=0;
		int maxidx=0;
		String temp2="";
		for (int i = 0; i < scores.length; i++) {
			maxmum=scores[i];
			maxidx=i;
			for (int j = i; j < scores.length; j++) {
				if(maxmum<scores[j]) {
					maxmum=scores[j];
					maxidx=j;
				}
				
			}
			int temp=scores[i];
			scores[i]=scores[maxidx];
			scores[maxidx]=temp;
			
			temp2=names[i];
			names[i]=names[maxidx];
			names[maxidx]=temp2;
			
		}
		System.out.println(Arrays.toString(names));
	}

}
