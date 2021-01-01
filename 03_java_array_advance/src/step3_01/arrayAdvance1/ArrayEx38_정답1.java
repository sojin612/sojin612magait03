package step3_01.arrayAdvance1;

import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx38_정답1 {

	public static void main(String[] args) {
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력 (가로합)
		// 정답 1) 4400, 7100, 5400
		int[] total=new int[3];
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				total[i]=total[i]+pay[i][j];
			}
		}
		System.out.println(Arrays.toString(total));
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		Scanner scan=new Scanner(System.in);
		System.out.println("아파트 호를 입력하세요");
		int ho=scan.nextInt();
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(apt[i][j]==ho) {
					System.out.println(pay[i][j]);
				}
			}
		}
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int maxmum=0;
		int idx1=0;
		int idx2=0;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(maxmum<pay[i][j]) {
					maxmum=pay[i][j];
					idx1=i;
					idx2=j;
					
				}
			}
		}
		System.out.println("가장 많이 나온 집은"+apt[idx1][idx2]);
		idx1=0;
		idx2=0;
		int minimum=pay[0][0];
		for (int k = 0; k < apt.length; k++) {
			for (int k2 = 0; k2 < pay[k].length; k2++) {
				if(minimum>pay[k][k2]) {
					minimum=pay[k][k2];
					idx1=k;
					idx2=k2;
				}
			}
		}
		System.out.println("가장적게 나온집은"+apt[idx1][idx2]);
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		idx1=0;
		idx2=0;
		int idx3=0;
		int idx4=0;
		System.out.println("아파트 호를 입력하세요");
		int ho1=scan.nextInt();
		System.out.println("아파트 호를 입력하세요");
		int ho2=scan.nextInt();
		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total.length; j++) {
				if(ho1==apt[i][j]) {
					idx1=i;
					idx2=j;
				}
				if(ho2==apt[i][j]) {
					idx3=i;
					idx4=j;
				}
			}
		}
		int temp=pay[idx1][idx2];
		pay[idx1][idx2]=pay[idx3][idx4];
		pay[idx3][idx4]=temp;
		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total.length; j++) {
				System.out.print(pay[i][j]+" ");
			}
		}
	}

}
