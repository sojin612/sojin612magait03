package step3_01.arrayAdvance1;

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


public class ArrayEx26_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan= new Scanner(System.in);
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		int[] check=new int[SIZE];
		int[] check2=new int[SIZE];
		for (int i = 0; i < front.length; i++) {
			int rnum=ran.nextInt(SIZE);
			if(check[rnum]==0) {
				check[rnum]=1;
				front[i]=rnum+1;
			}
			else {
				i--;
			}
		}
		
		for (int i = 0; i < check2.length; i++) {
			int rnum=ran.nextInt(SIZE);
			if(check2[rnum]==0) {
				check2[rnum]=1;
				back[i]=rnum+10;
			}
			else {
				i--;
			}
		}
		
		int i=1;
		while(i<19) {
			for (int j = 0; j < check.length; j++) {
				if(front[j]!=0) {
					System.out.print(front[j]+" ");
				}
				else if(front[j]==0) {
					System.out.print("0 ");
				}
				if(j%3==2) {
					System.out.println();
				}
			}
			System.out.println(i+"숫자의 인덱스 입력");
			int idx=scan.nextInt();
			if(i==front[idx]) {
				front[idx]=back[idx];
			}
			else if(i!=front[idx]){
				System.out.println("정답이 아닙니다");
				i--;
			}
			if(i>9 && i==front[idx]) {
				front[idx]=0;
			}
			
			i++;
		}
		
		
		
	}
	
}
