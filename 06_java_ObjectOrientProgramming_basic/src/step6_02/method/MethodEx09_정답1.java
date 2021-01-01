package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex09 {

	void setRandomValuesinArray(int [] scores) {
		Random ran= new Random();
		for (int i = 0; i < scores.length; i++) {
			scores[i]=ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));
	}
	
	void printScores (int [] scores) {
		int total=0;
		int avg=0;
		for (int i = 0; i < scores.length; i++) {
			total=total+scores[i];
		}
		avg=total/scores.length;
		System.out.println("총점은"+total+"평균은"+avg);
	}
	
	void printNumber(int[] nums) {
		int cnt=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>=60) {
				cnt++;
			}
		}
		System.out.println("합격생의 수는"+cnt);
	}
	
	void printSumAndAverage (int [] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스를 입력하세요");
		int idx= scan.nextInt();
		System.out.println("성적은"+scores[idx]);
	}
	
	void printWinner (int [] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int myScore=scan.nextInt();
		for (int i = 0; i < scores.length; i++) {
			if(myScore==scores[i]) {
				System.out.println("인덱스는"+i);
			}
			
		}
	}
	
	
	void printScore3(int [] hakbuns, int [] scores) {
		Scanner scan= new Scanner(System.in);
		System.out.println("학번을 입력하세요");
		int myHakbun= scan.nextInt();
		for (int i = 0; i < scores.length; i++) {
			if(myHakbun==hakbuns[i]) {
				System.out.println("성적은"+scores[i]);
			}
		}
	}
	
	void printNumberOne (int [] hakbuns, int [] scores) {
		int maxmum=0;
		int maxidx=0;
		for (int i = 0; i < scores.length; i++) {
			if(maxmum<scores[i]) {
				maxmum=scores[i];
				maxidx=i;
			}
		}
		System.out.println("1등학생은"+hakbuns[maxidx]+"성적은"+maxmum);
	}
	
}


public class MethodEx09_정답1 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09 e = new Ex09();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		e.printScores(scores);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		e.printNumber(scores);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printSumAndAverage(scores);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printWinner(scores);
		
		// 문제6) 학번을 입력받아 성적 출력
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns,scores);
		
		// 문제7) 1등학생의 학번과 성적 출력
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);
	}

}
