package step2_01.array;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */

public class ArrayEx14_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int playerIdx = 0;
		int num=0;
		int temp=0;
		int i=0;
	
		boolean isRun=true;
		for(i=0; i<7; i++) {
			if(game[i] == 2) {
				playerIdx = i;
			}	
		}
		while (isRun==true) {
			
			System.out.println();
			System.out.println("1왼쪽과 2오른쪽중 숫자를 입력하세요");
			num=scan.nextInt();
			
			if (num==2) {
				
				if(playerIdx+1<=6) {
					temp=game[playerIdx];
					game[playerIdx]=game[playerIdx+1];
					game[playerIdx+1]=temp;
					playerIdx=playerIdx+1;
				}
				
			}
			if (num==1) {
			
				if (playerIdx-1 >= 0) {
					temp=game[playerIdx];
					game[playerIdx]=game[playerIdx-1];
					game[playerIdx-1]=temp;
					playerIdx=playerIdx-1;
				}
				
			}
			for (int j = 0; j < game.length; j++) {
				System.out.print(game[j]);
			}
		}
			
		System.out.println();
	
				
	}
	
}
