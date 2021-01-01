package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_정답1 {

	public static void main(String[] args) {
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		Ex04 e1= new Ex04();
		
		Random ran = new Random();
		
		for (int i = 0; i < 5; i++) {
			int rnum=ran.nextInt(100)+1;
			e1.scores[i]=rnum;
		}
		for (int i = 0; i < e1.scores.length; i++) {
			System.out.print(e1.scores[i]+" ");
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total=0;
		double avg=0;
		for (int i = 0; i < e1.scores.length; i++) {
			total=total+e1.scores[i];
		}
		avg=(double)total/e1.scores.length;
		System.out.println("total:"+total+" avg:"+avg);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt=0;
		for (int i = 0; i < e1.scores.length; i++) {
			if(e1.scores[i]>=60) {
				cnt++;
			}
		}
		System.out.println("합격생수는"+cnt+"명");
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		Scanner scan= new Scanner(System.in);
		System.out.println("인덱스를 입력하세요");
		int num= scan.nextInt();
		System.out.println(e1.scores[num]);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적을 입력하세요");
		int score=scan.nextInt();
		int idx=0;
		for (int i = 0; i < e1.scores.length; i++) {
			if(score==e1.scores[i]) {
				idx=i;
			}
		}
		System.out.println(idx);
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번을 입력하세요");
		int hakbun=scan.nextInt();
		for (int i = 0; i < e1.scores.length; i++) {
			if(hakbun==e1.hakbuns[i]) {
				idx=i;
			}
		}
		System.out.println(e1.scores[idx]);
		
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.println("학번을 입력하세요");
		hakbun=scan.nextInt();
		idx=0;
		for (int i = 0; i < e1.scores.length; i++) {
			if(hakbun==e1.hakbuns[i]) {
				idx=i;
				break;
			}
			else {
				idx=-1;
			}
		}
		if(idx==-1) {
			System.out.println("해당학번은 존재하지 않습니다");
		}
		else {
			System.out.println(e1.scores[idx]);
		}
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int maxIdx=0;
		int maxScore=0;
		
		for (int i = 0; i < e1.scores.length; i++) {
			if(maxScore<e1.scores[i]) {
				maxScore=e1.scores[i];
						maxIdx=i;
			}
		}
		System.out.println("1등학생의 학번은:"+maxIdx+"성적은:"+maxScore);
		
	}

}
