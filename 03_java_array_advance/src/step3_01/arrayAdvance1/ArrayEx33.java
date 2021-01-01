package step3_01.arrayAdvance1;

import java.util.Arrays;

public class ArrayEx33 {

	
/*
 * 배열의 주소
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		

		int[] arr = {87,100,24,11,79};
		int[]temp= null;
		
		System.out.println("arr : "+ arr);
		System.out.println("temp : "+ temp);
		System.out.println();
		
		temp=arr;  //arr의 주소를 대입
		System.out.println("arr : "+ arr);
		System.out.println("temp : "+ temp);
		System.out.println();
		
		temp[0]=999;
		System.out.println("arr : "+ Arrays.toString(arr));
		System.out.println("temp : "+ Arrays.toString(temp));
		System.out.println();
		
		temp[1]=777;
		System.out.println("arr : "+ Arrays.toString(arr));
		System.out.println("temp : "+ Arrays.toString(temp));
		System.out.println();
		
		
	}

}
