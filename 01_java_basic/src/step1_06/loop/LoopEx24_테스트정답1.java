package step1_06.loop;

/*
 
	# 문제2)  9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63

	# 문제3) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제4) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제5) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제6) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx24_테스트정답1 {

	public static void main(String[] args) {
		//문제2
		for (int i = 9; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i*j/10==6)
					System.out.println(i*j);
			}
		}
		
		//문제3
		int num=0;
		int maxmum=0;
		for (int i = num; i < 150; i++) {
			for (int j = 8; j  < 63; j+=8) {
				if(i%j==5) {
					if(maxmum<i && i<150) {
						maxmum=i;
					}
						
				}
			}
		}
		System.out.println(maxmum);
		
		//문제4
		for (int j = 9; j <= 100; j+=9) {
			if(j>=50 && j<=100) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		//문제5
		maxmum=0;
		for (int i = 28; i < 1000; i+=28) {
			if(maxmum<i)
				maxmum=i;
		}
		System.out.println(maxmum);
		
		//문제6
		int k=5;
		for (int i = 0; i <8*k; i+=8) {
			System.out.print(i+" ");
		}
		
	}

}
