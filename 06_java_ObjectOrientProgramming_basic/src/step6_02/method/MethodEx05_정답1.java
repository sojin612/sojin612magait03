

package step6_02.method;

import java.util.Scanner;


class Ex05{

	void test1(int arg1,int arg2,int arg3,int arg4,int arg5) {
		System.out.println("총합"+(arg1+arg2+arg3+arg4+arg5));
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] num=new int[3];
		int maxmum=0;
		for(int i=0; i<3; i++) {
			System.out.println("숫자입력");
			num[i]=scan.nextInt();
			if(maxmum<num[i]) {
				maxmum=num[i];
			}
		}
		
		System.out.println("최대값은"+maxmum);
		scan.close();
	}
}



public class MethodEx05_정답1 {

	public static void main(String[] args) {

		
			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1(1,2,3,4,5);
			
			
			// 문제 2) 정수 3개를 입력받아 최대값을 출력하는 메서드
			e.test2();
			

			
			
		


	}

}
