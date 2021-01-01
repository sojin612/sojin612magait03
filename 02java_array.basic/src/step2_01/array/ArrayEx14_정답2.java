package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */

public class ArrayEx14_정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}
		int temp;
		int i=0;
		
		while(true){
			System.out.println(Arrays.toString(game));	
			System.out.println("1왼쪽,2오른쪽 숫자를 입력하세요");	
			int num=scan.nextInt();
			
			if(num==2) {
				if(player+1<7) {
					temp=game[player];
					game[player]=game[player+1];
					game[player+1]=temp;
					player=player+1;
				}
			}
			else if(num==1) {
				if(player-1>=0) {
					temp=game[player];
					game[player]=game[player-1];
					game[player-1]=temp;
					player=player-1;
				}
			}
		
		}
	}
	
}
