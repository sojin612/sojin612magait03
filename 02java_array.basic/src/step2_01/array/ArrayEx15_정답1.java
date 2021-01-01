package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int temp = 0;
		int tempRan = 0;
		int cnt  = 0;
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			tempRan = ran.nextInt(9);
			temp = front[0]; 
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}
			
		for(int i=0; i<10; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println();
		int index1=0;
		int index2=0;
		int count=0;
		for (int i = 0; i < back.length; i++) {
			System.out.println();
			System.out.println("같은 숫자의 위치를 입력하세요");
			index1=scan.nextInt();
			System.out.println("같은 숫자의 위치를 입력하세요");
			index2=scan.nextInt();
			if(front[index1]==front[index2]) {
				back[index1]=1;
				back[index2]=1;
				count=count+2;
				if(count==10) {
					System.out.println("종료");
					break;
				}
			}
			else {
				System.out.println("정답이 아닙니다.");
			}
			for(int j=0; j<10; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println();
			for(int k=0; k<10; k++) {
				System.out.print(back[k] + " ");
			}	
			
		}
		
			
	}
	
}
