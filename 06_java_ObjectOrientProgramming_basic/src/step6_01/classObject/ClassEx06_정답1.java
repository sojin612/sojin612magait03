package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */


class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	char[] table=new char[5];
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}




public class ClassEx06_정답1 {

	public static void main(String[] args) {

		Ex06 e1= new Ex06();
		
		Random ran = new Random();
			
			for (int i = 0; i < e1.hgd.length; i++) {
				int rnum=ran.nextInt(5)+1;
				e1.hgd[i]=rnum;
			}
			for (int i = 0; i < e1.hgd.length; i++) {
				if(e1.answer[i]==e1.hgd[i]) {
					e1.answerCnt++;
					e1.score+=20;
					e1.table[i]='O';
				}
				else {
					e1.table[i]='X';
				}
			}
			System.out.print(Arrays.toString(e1.answer));
			System.out.print(Arrays.toString(e1.hgd));
			System.out.print(Arrays.toString(e1.table));
			System.out.println("성적은"+e1.score);
		
		
		
		
	}

}
