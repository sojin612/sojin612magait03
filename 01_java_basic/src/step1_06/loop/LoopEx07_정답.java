package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

public class LoopEx07_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(100) + 1;
		System.out.println("치트키 = " + com);
		
		int score = 100;
		int cnt = 0;
		
		boolean isRun = true;
		while(isRun == true) {
			
			System.out.println("숫자 입력[1~100] : ");
			int me = scan.nextInt();
			
			if(com > me) {
				System.out.println("Up!");
				cnt = cnt + 1;
			}else if(com < me) {
				System.out.println("Down!");
				cnt = cnt + 1;
			}else if(com == me) {
				System.out.println("Bingo!");
				isRun = false;
			}
		}

		score = score - 5*cnt;
		System.out.println("성적 = " + score + "점");

	}

}
