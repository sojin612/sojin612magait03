package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_정답2 {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int total=0;
		for (int i = 0; i <=5; i++) {
			total=total+i;
		}
		System.out.println(total);
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		for (int i = 1; i <= 10; i++) {
			if(i<3 || i>=7) {
				System.out.print(i+" ");
			}
		}
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		total=0;
		for (int i = 1; i <=10; i++) {
			if(i<3 || i>=7) {
				total+=i;
			}	
		}
		System.out.println(total);
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		int cnt=0;
		for (int i = 1; i <=10; i++) {
			if(i<3 || i>=7) {
				cnt++;
			}	
		}
		System.out.println(cnt);
		
		
		
	}

}
