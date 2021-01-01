package step2_01.array;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_정답1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.println("인덱스를 입력하세요");
		getIndex1=scan.nextInt();
		System.out.println("인덱스를 입력하세요");
		getIndex2=scan.nextInt();
		temp=arr[getIndex1];
		arr[getIndex1]=arr[getIndex2];
		arr[getIndex2]=temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		System.out.println("\n값을 입력하세요");
		getValue1=scan.nextInt();
		System.out.println("값을 입력하세요");
		getValue2=scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==getValue1) {
				arr[i]=getValue2;
			}
			else if(arr[i]==getValue2) { 
				arr[i]=getValue1;	
			}
			System.out.print(arr[i]);
		}	
			
		System.out.println();
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int tmp=0;
		System.out.println("학번을 입력하세요");
		int number1=scan.nextInt();
		System.out.println("학번을 입력하세요");
		int number2=scan.nextInt();
		int index1=0;
		int index2=0;
		for (int i = 0; i < scores.length; i++) {
			if(number1==hakbuns[i]) {
				index1=i;
			}
			if(number2==hakbuns[i]) {
				index2=i;
			}
			
		}
		tmp=scores[index1];
		scores[index1]=scores[index2];
		scores[index2]=tmp;
		for (int j = 0; j < scores.length; j++) {
			System.out.print(scores[j]+" ");
		}
	}
	
}
