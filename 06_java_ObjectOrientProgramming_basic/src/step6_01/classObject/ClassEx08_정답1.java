package step6_01.classObject;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

//11;10~
class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}



public class ClassEx08_정답1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex08 e1= new Ex08();
		
		int player=0;
		int temp=0;
		for (int i = 0; i < e1.game.length; i++) {
			if(e1.game[i]==2) {
				player=i;
			}
		}
		while(true) {
			System.out.println(Arrays.toString(e1.game));
			System.out.println("숫자1왼쪽,숫자2오른쪽:숫자를 입력하세요");
			int move = scan.nextInt();
			if(move==1) {
				if(player-1>=0) {
					if(e1.game[player-1]==1) {
						System.out.println("숫자입력");
						int num=scan.nextInt();
						if(num==3) {
							e1.game[player]=0;	
							e1.game[player-1]=2;
							player=player-1;
						}
						else {
							System.out.println("이동할 수 없습니다");
							continue;
						}
					}
					else {
						e1.game[player]=0;
						e1.game[player-1]=2;
						player=player-1;
						
					}
				
				}
				else {
					e1.game[player]=0; //player=0
					player=e1.game.length-1;
					e1.game[player]=2; 
				}
			}
			if(move==2) {
				if(player+1<=e1.game.length-1) {
					if(e1.game[player+1]==1) { //넘침
						System.out.println("숫자입력");
						int num=scan.nextInt();
						if(num==3) {
							e1.game[player]=0;	
							e1.game[player+1]=2;
							player=player+1;
						}
						else {
							System.out.println("이동할 수 없습니다");
							continue;
						}
					}
					else {
						e1.game[player]=0;
						e1.game[player+1]=2;
						player=player+1;
					}
					
				}
				else {
					e1.game[player]=0;
					player=player%(e1.game.length-1);
					e1.game[player]=2;
				}
			}
		}
		
	}

}
