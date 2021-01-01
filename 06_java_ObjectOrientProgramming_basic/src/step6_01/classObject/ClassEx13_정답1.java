package step6_01.classObject;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

import java.util.Random;
import java.util.Scanner;

class Ex13{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}



public class ClassEx13_정답1 {

	public static void main(String[] args) {
		
		Ex13 e1= new Ex13();
		Scanner scan = new Scanner(System.in);
		Random ran =new Random();
		int num=0;
		for (int i = 0; i < e1.SIZE; i++) {
			e1.front[i]=i+1;
			e1.back[i]=10+i;
		}
		for (int i = 0; i < 100; i++) {
			int r= ran.nextInt(9);
			int temp=e1.front[0];
			e1.front[0]=e1.front[r];
			e1.front[r]=temp;
		}
	
		while(true) {
			for (int i = 0; i < e1.front.length; i++) {
				System.out.print(e1.front[i]+" ");
				if(i%3==2) {
					System.out.println();
				}
			}
			System.out.println(num+1+"의 인덱스를 입력하세요");
			int idx=scan.nextInt();
			if(e1.front[idx]==num+1) {
				e1.front[idx]=e1.back[idx];
			}
			else {
				System.out.println("인덱스가 틀렸습니다");
				num--;
			}
			if(num+1>e1.SIZE && num+1<19) {
				e1.front[idx]=0;
			}
			num++;
			if(num+1>18) {
				break;
			}
		}
		
	}

}
