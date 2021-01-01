package step3_02.arrayAdvance2;

import java.util.Scanner;

/*
	문제1) 1 ~ 백만 사이의 숫자를 입력받고 가운데 숫자 출력 
	(단 ! 짝수자리의 수는 짝수자리라고 출력)
	예)  123 ==> 2
	예)  1234 ==> 짝수의 자리이다
	예)  1 ==> 1
	예)  1234567 ==> 4
	
	힌트) 자리수를 구하고 배열을 만든다음 하나씩 저장 
	예) ==> 123 ==> 3 ==> arr[] = new int[3]; //
*/

public class ArrayEx48_테스트문제정답1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("1~1000000사이의 숫자를 입력하세요: ");
			int num=scan.nextInt();
			System.out.println();
			
			if(num>=1 && num<10) {
				int[] arr=new int[1];
				arr[0]=num;
				System.out.println(arr[0]);
			}
			else if(num>=10 && num<100) {
				int[] arr= new int[2];
				System.out.println("짝수의 자리");	
				
			}
			else if(num>=100 && num<1000) {
				int[] arr= new int[3];
				arr[1]=num%100/10;
				System.out.println(arr[1]);
			}
			else if(num>=1000 && num<10000) {
				int[] arr= new int[4];
				System.out.println("짝수의 자리입");	
			}
			else if(num>=10000 && num<100000) {
				int[] arr= new int[5];
				arr[2]=num%10000%1000/100;
				System.out.println(arr[2]);
			}
			else if(num>=100000 && num<1000000){
				int[] arr= new int[6];
				System.out.println("짝수의 자리입니다");
			}
		}
	}

}
