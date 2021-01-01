package step3_01.arrayAdvance1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class ArrayEx27_정답1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0};
		int player=0;
		int temp=0;
		for (int i = 0; i < game.length; i++) {
			if(game[i]==2) {
			player=i;
			}
		}
		int i=0;
		while(true) {
			System.out.println(Arrays.toString(game));
			System.out.println("숫자1은 왼쪽 숫자2는 오른쪽: 숫자를 입력하세요");
			int num=scan.nextInt();
			if(num==1) {
				if(game[player-1]>1||game[player-1]<1) {
					temp=game[player];
					game[player]=game[player-1];
					game[player-1]=temp;
					player=player-1;
				}
				else {
					System.out.println("숫자입력");
					int num2=scan.nextInt();
					if(num2==3) {
						temp=game[player];
						game[player]=game[player-2];
						game[player-2]=temp;
						player=player-2;
					}
					else {
					System.out.println("움직일 수 없다");
					break;
					}
				}
				i++;
			}
			if(num==2) {
				if(game[player+1]>1||game[player+1]<1) {
					temp=game[player];
					game[player]=game[player+1];
					game[player+1]=temp;	
					player=player+1;
				}
				else {
					System.out.println("숫자입력");
					int num2=scan.nextInt();
					if(num2==3) {
						temp=game[player];
						game[player]=game[player+2];
						game[player+2]=temp;
						player=player+2;
					}
					else {
					System.out.println("움직일 수 없습니다");
					break;
					}
				}
				i++;
			}
		}
		
	}
	
}
