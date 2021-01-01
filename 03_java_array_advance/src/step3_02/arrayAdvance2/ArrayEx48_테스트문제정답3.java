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
	예) ==> 123 ==> 3 ==> arr[] = new int[3];
*/

public class ArrayEx48_테스트문제정답3 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n=0;
			int k=8;
			int[] arr= new int[k];
			System.out.println("숫자입력(1-1000000)");
			int num=scan.nextInt();
			for (int i = 1000000; i >0 ; i/=10) {
				if(num/i!=0) {
					k--;
					break;
				}
				else {
					k--;
				}
			}
			arr=new int[k];
			if(k%2!=0) {
				if(k==1) {
					System.out.println(num);
				}
				else {
					if(k==7) {
						n=1000;
					}
					else if(k==5) {
						n=100;
					}
					else if(k==3) {
						n=10;
					}
					arr[k/2]=num%(10*n)/n;
					System.out.println("중간값은"+arr[k/2]);
				}
			}
			else {
				System.out.println("짝수의 자리입니다");
			}
		}
		
	}

}
