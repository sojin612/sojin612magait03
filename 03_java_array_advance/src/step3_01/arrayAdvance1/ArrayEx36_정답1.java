package step3_01.arrayAdvance1;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx36_정답1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		Scanner scan= new Scanner(System.in);
		System.out.println("인덱스를 입력하세요");
		int idx1=scan.nextInt();
		System.out.println("인덱스를 입력하세요");
		int idx2=scan.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.println("값을 입력하세요");
		int value=scan.nextInt();
		idx1=0;
		idx2=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==value) {
					idx1=i;
					idx2=j;
				}
			}
		}
		System.out.println(idx1+","+idx2);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		idx1=0;
		idx2=0;
		int maxmum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(maxmum<arr[i][j]) {
					maxmum=arr[i][j];
					idx1=i;
					idx2=j;
				}
			}
		}
		System.out.println(idx1+","+idx2);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.println("값을 입력하세요");
		int value1=scan.nextInt();
		System.out.println("값을 입력하세요");
		int value2=scan.nextInt();
		int temp=0;
		idx1=0;
		idx2=0;
		int idx3=0;
		int idx4=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==value1) {
					idx1=i;
					idx2=j;
					
				}
				if(arr[i][j]==value2) {
					idx3=i;
					idx4=j;
				}
			}	
		}
		temp=arr[idx1][idx2];
		arr[idx1][idx2]=arr[idx3][idx4];
		arr[idx3][idx4]=temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		



	}

}
