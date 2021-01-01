package step6_02.method;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
	
	void shuffle() {
		
		for (int i = 0; i < 100; i++) {
			int r= ran.nextInt(10);
			int temp=front[0];
			front[0]=front[r];
			front[r]=temp;
			
		}
	}
	
	void showCard() {
		System.out.print("[");
		for (int i = 0; i < back.length; i++) {
			System.out.print(front[i]);
		}
		System.out.println("]");
		
		System.out.print("[");
		for (int i = 0; i < back.length; i++) {
			System.out.print(back[i]);
		}
		System.out.println("]");
	}
	
	
	void play() {
		System.out.println("같은 숫자의 위치를 입력하세요");
		System.out.println("idx1입력");
		int idx1=scan.nextInt();
		System.out.println("idx2입력");
		int idx2=scan.nextInt();
		
		if(front[idx1]==front[idx2]) {
			back[idx1]=front[idx1];
			back[idx2]=front[idx2];
			cnt++;
		}
	}
	
	void run() {
		
		// 셔플(카드 섞기)
		shuffle();
		
		while (true) {
			// 카드 출력
			showCard();
			
			// 종료하기
			if(cnt==5) {
				break;
			}
			// 카드 선택하기
			play();
		}
	}
	
}

public class MethodEx15_테스트정답1 {

	public static void main(String[] args) {

		MemoryGame g = new MemoryGame();
		g.run();
		
	}

}
