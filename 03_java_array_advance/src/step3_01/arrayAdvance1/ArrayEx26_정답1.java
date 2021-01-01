package step3_01.arrayAdvance1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


public class ArrayEx26_정답1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		int rannum=0;
		int rannum2=0;
		int temp=0;
		int idx=0;
		int num=1;
		int answer=0;
			for (int i = 0; i < back.length; i++) {
				front[i]=i+1;
				back[i]=SIZE+(i+1);
			}
			for (int i = 0; i < 1000; i++) {
				rannum=ran.nextInt(SIZE);
				temp=front[0];
				front[0]=front[rannum];
				front[rannum]=temp;
			
				rannum=ran.nextInt(SIZE);
				temp=back[0];
				back[0]=back[rannum];
				back[rannum]=temp;
			}
		while(true) {
			for (int i = 0; i < back.length; i++) {
				if(num==front[i]) {
					answer=i;
				}
			}
			for (int i = 0; i < back.length; i++) {
				if(front[i]==0) {
					System.out.print("\t");
				}
				else {
					System.out.print(front[i]+"\t");
				}
				if(i%3==2) {
					System.out.print("\n");
				}
			}
			
			System.out.print("["+num+"]의 인덱스를 입력하세요");
			idx=scan.nextInt();
			
			for (int i = 0; i < back.length; i++) {
				if(front[idx]==num) {
					if(idx>0 && idx<SIZE) {
					front[answer]=back[idx];
					}
					else {
						front[idx]=0;
					}
				}
			}	 
			num++;
		
		}
	}
	
}
