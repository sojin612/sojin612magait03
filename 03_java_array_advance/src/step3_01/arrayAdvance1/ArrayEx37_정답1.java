package step3_01.arrayAdvance1;


/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx37_정답1 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		};   //arr[3][4]
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int total=0;
		for (int i = 0; i < garo.length; i++) {
			for (int j = 0; j < sero.length; j++) {
				garo[i]=garo[i]+arr[i][j];
			}
		}
		for (int i = 0; i < garo.length; i++) {
			System.out.print(garo[i]+" ");
		}
		System.out.println();
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		
		for (int j = 0; j < sero.length; j++) {
			for (int i = 0; i < garo.length; i++) {
				sero[j]=sero[j]+arr[i][j];
			}
		}
		for (int i = 0; i < sero.length; i++) {
			System.out.print(sero[i]+" ");
		}

	}

}
