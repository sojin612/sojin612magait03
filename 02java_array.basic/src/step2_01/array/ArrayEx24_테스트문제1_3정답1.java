
package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_3정답1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74,82,0,0,0}
		int[] l = { 10, 20, 30, 40, 50 };
		int[] m = { 13, 54, 17, 42, 1 };
		int[] n = { 0,0,0,0,0};
		int k=0;
		for (int i = 0; i < n.length; i++) {
			if((l[i]+m[i])%2==0) {
				n[k]=l[i]+m[i];
				k++;
			}
		}		
		System.out.println(Arrays.toString(n));	
		
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		// 예) win[3]= {1002, 1003, 0};
		k=0;
		for (int i = 0; i < win.length; i++) {
			if(score[i]>=60) {
				win[k]=num[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(win));
		
		// 문제 15) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		// 예) win2[3] = {1001, 1003, 0};
		int idx=0;
		k=0;
		for (int i = 0; i < data.length; i++) {
			idx=i;
			data[idx]=data[i];
			if(idx%2==1) {
				if(data[idx]>=60) {
					win2[k]=data[idx-1];
					k++;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(win2));
		
		
		// 문제 16) 
		int arr[] = {10,20,30,40,50};
		int s[] = new int[5];
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 

		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
		int number=0;
		k=0;
		for (int i = 0; i < s.length; i++) {
			System.out.println("숫자를 입력하세요");
			number=scan.nextInt();
			for (int j = 0; j < s.length; j++) {
				if(arr[j]==number) {
					s[k]=j;
					break;
				}
				else if(arr[j]!=number) {
					s[k]=-1;
				}
			}
			k++;
		}
		System.out.println(Arrays.toString(s));
				
			
				
				
			
		
		
	}

}
