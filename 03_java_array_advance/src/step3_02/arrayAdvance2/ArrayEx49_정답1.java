package step3_02.arrayAdvance2;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * P □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */


public class ArrayEx49_정답1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int[][] map = {
				{0,   1,  2,  3, 4},	
				{15, 20, 20, 20, 5},
				{14, 20, 20, 20, 6},
				{13, 20, 20, 20, 7},
				{12, 11, 10,  9, 8}
			};
		
			int player = 0;
		
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j]==0) {
						player=map[i][j];
						
					}
				}
			}
			while(true) {
				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < map[i].length; j++) {
						if(map[i][j]==20) {
							System.out.print( "■ " );
						}
						else if(map[i][j]==player) {
							System.out.print("P ");
						}
						else if(map[i][j]>=0 || map[i][j]<=15) {
							System.out.print("□ ");
						}
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("1-3까지 숫자를 입력하세요");
				int move=scan.nextInt();
				if(move<0 || move>3) continue;
				else {
					player=player+move;
					player=player%16;
				}
				
				
				
			}
	}

}
