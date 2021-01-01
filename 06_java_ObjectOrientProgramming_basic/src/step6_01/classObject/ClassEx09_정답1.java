package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */
//09:00~9:15

class Ex09{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_정답1 {

	public static void main(String[] args) {		
		
		Ex09 e1=new Ex09();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			int r=ran.nextInt(10);
			int temp=e1.front[0];
			e1.front[0]=e1.front[r];
			e1.front[r]=temp;
		}
		while(true) {
			System.out.println(Arrays.toString(e1.front));
			System.out.println(Arrays.toString(e1.back));
			System.out.println("같은 위치의 인덱스를 입력하세요");
			System.out.println("인덱스1입력");
			int idx1=scan.nextInt();
			System.out.println("인덱스2입력");
			int idx2=scan.nextInt();
			if(e1.front[idx1]==e1.front[idx2]) {
				if(e1.back[idx1]==0 &&e1.back[idx2]==0) {
					e1.back[idx1]=e1.front[idx1];
					e1.back[idx2]=e1.front[idx2];
					e1.answerCnt++;
				}
				if(e1.answerCnt==5) {
					break;
				}
			}
			else {
				System.out.println("틀렸습니다");
			}
		}
	}

}
