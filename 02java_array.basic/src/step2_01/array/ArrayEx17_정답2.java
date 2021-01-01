package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_정답2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = new int[9];
		int p1=0;
		int p2=0;
		
		int win1=0;
		int win2=0;
		int turn=0;
	while(true) {
		for (int i = 0; i < game.length; i++) {
				
			if(game[i]==0) {
				System.out.print("[ ]");
			}
			else if(game[i]==1) {
				System.out.print("[o]");
			}
			else if(game[i]==2) {
				System.out.print("[x]");
			}
			if(i%3==2) {
				System.out.println();
			}
		}
		if(win1==1) {
			System.out.println("p1승리");
			break;
		}
		else if(win2==1) {
			System.out.println("p2승리");
			break;
		}
		if(turn%2==0) {
			System.out.println("p1차례:숫자를 입력하세요(0~8)");
			p1=scan.nextInt();
			if(p1<=0 || p1>=9) {
				System.out.println("숫자를 다시 입력하세요");
				continue;
			}
			if(game[p1]==0) {
				game[p1]=1;
				turn++;
			}
		}
		else if(turn%2==1) {
			System.out.println("p2차례:숫자를 입력하세요(0~8)");
			p2=scan.nextInt();
			if(p1<=0 || p1>=9) {
				System.out.println("숫자를 다시 입력하세요");
				continue;
			}
			if(game[p2]==0) {
				game[p2]=2;
				turn++;
			}
		}
		
		for (int i = 0; i < 9; i+=3) {
			if(game[i]==1 && game[i+1]==1 && game[i+2]==1)
				win1=1;
			if(game[i]==2 && game[i+1]==2 && game[i+2]==2)
				win2=1;
		}
		for (int i = 0; i < 3; i++) {
			if(game[i]==1 && game[i+3]==1 && game[i+6]==1)
				win1=1;
			if(game[i]==2 && game[i+3]==2 && game[i+6]==2)
				win2=1;
		}
		if(game[0]==1 && game[4]==1 && game[8]==1)
			win1=1;
		if(game[0]==2 && game[4]==2 && game[8]==2)
			win2=1;
		if(game[2]==1 && game[4]==1 && game[6]==1)
			win1=1;
		if(game[2]==2 && game[4]==2 && game[6]==2)
			win2=1;
		
	}
		
		
	}
		
}
