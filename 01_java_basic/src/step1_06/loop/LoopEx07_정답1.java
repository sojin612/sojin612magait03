package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

public class LoopEx07_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score=100;
		int com = ran.nextInt(100);
		int me=0;
		while(com!=me) {
			System.out.println("숫자를 입력해");
			me=scan.nextInt();
			if (com>me) {
			System.out.println("up");
			score=score-5;
			}
			else if(com<me) {
			System.out.println("down");
			score=score-5;
			}
			else {
			System.out.println("정답");
			System.out.println("점수는="+score);
			}
			
		}
		
	}

}
