package step1_06.loop;




public class LoopEx24_테스트정답2 {

	public static void main(String[] args) {
		
//# 문제2)  9의 배수중 십의 자리가 6인 첫번째 배수 출력
//# 답 : 63
		int num=0;
		for (int i = num; i <81 ; i+=9) {
			if(i/10==6) {
				System.out.println(i);
			}
		}
		
//# 문제3) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
//# 답 149
		int maxmum=0;
		for (int i = 0; i < 150; i++) {
			if(i%8==5) {
				if(maxmum<i) {
					maxmum=i;
				}
			}		
		}
		System.out.println(maxmum);
//# 문제4) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
//# 답 6 (54,63,72,81,90,99)
		for (int i = 50; i <= 100; i++) {
			if(i%9==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
//# 문제5) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
//# 답 980
		maxmum=0;
		for (int i = 28; i < 1000; i+=28) {
			if(maxmum<i) {
				maxmum=i;
			}
		}
		System.out.println(maxmum);
//# 문제6) 8의 배수를 작은수부터 5개 출력
//# 답 : 0,8,16,24,32
		for (int i = 0; i <40 ; i+=8) {
			System.out.print(i+" ");
		}

		
		
	}

}
