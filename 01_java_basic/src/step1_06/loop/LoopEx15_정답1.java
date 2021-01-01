package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */

public class LoopEx15_정답1 {

	public static void main(String[] args) {
		
		Random ran= new Random();
		int total=0;
		int cnt=0;
		int max=0;
		int idx=0;
		double avg=0.0;
		for (int i = 0; i < 10; i++) {
			int rnum=ran.nextInt(100)+1;
			if(rnum>=60) {
				cnt++;
			}
			if(max<rnum) {
				max=rnum;
				idx=i;
			}
			total=total+rnum;
			avg=(double)total/10;
		}
		System.out.println("전교생의 총점은"+total+" 평균은"+avg);
		System.out.println("합격자의 수는"+cnt);
		System.out.println("1등학생의 번호는"+idx+" 성적은"+max);
	}

}
