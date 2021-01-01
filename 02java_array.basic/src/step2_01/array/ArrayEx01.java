package step2_01.array;

import java.util.Arrays;

/*
 * 배열(array) 
 * 
 * <형식>
 * 1)자료형[] 배열명 = new 자료형 [방의개수];
 * 2)자료형 배열명[] = new 자료형[방의개수];
 * 
 * -'같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 * -인덱스(index) : 0부터 시작하는 방번호가 부여된다.
 * -배열은 주소변수이다.
 * 
 * 
 */
public class ArrayEx01 {

	public static void main(String[] args) {
	//1.일반변수 (값저장)
		int nVar= 0;
		nVar = 10;
		System.out.println(nVar);
		
		//2.주소변수(주소저장)
		int[] arr = null;  // int arr[]= null;
		arr = new int[5];
		//int[]arr=new int[5];  한번에 가능
		System.out.println(arr);
		
		System.out.println(arr[0]); //초기값이 셋팅이 되어있다.
		System.out.println(arr[1]); //정수의 초기값은 0, 나머지는 직접 확인해보자.
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
	
		//System.out.println(arr[5]);
		//java.lang.ArrayIndexOutOfBoundsException: 5> 해당 에러메세지 암기(이시간부로 반드시 혼자서 해결)
		
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		
		for (int i = 0; i <5; i++) {
			System.out.println(arr[i]);
			System.out.println();
		}
		
		System.out.println(Arrays.toString(arr));
		
		arr= null; //배열 전체 삭제
		
		
	}

}
