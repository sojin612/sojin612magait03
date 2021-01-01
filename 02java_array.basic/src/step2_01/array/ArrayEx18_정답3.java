package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 미니마블
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 */

public class ArrayEx18_정답3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;	int win2 = 0;					
		int move=0;
		boolean isRun= true;
		
		
		while(true) {
			System.out.println(Arrays.toString(game));
			System.out.print(Arrays.toString(p1));
			System.out.println("["+win1+"]바퀴");
			System.out.print(Arrays.toString(p2));
			System.out.println("["+win2+"]바퀴");
			
			while(isRun==true) {
				System.out.println("p1차례: (1-3)까지 숫자를 입력하세요");
				move=scan.nextInt();
				p1[idx1]=0;
				idx1=idx1+move;
				if(idx1>=8) {
					win1++;
					if(win1==3) {
						System.out.println("p1승리");
						break;
					}
				}
				idx1=idx1%8;
				p1[idx1]=1;
				isRun=false;
				
			}
			while(isRun==false) {
				int move1=ran.nextInt(3)+1;
				System.out.println("p2차례"+move1);
				p2[idx2]=0;
				idx2=idx2+move1;
				if(idx2>=8) {
					win2++;
					if(win2==3) {
						System.out.println("p2승리");
						break;
					}
				}
				idx2=idx2%8;
				p2[idx2]=2;
				isRun=true;
			}
			if(idx1==idx2&& idx1!=0 && turn%2==0) {
				System.out.println("p1이 p2를 잡았다");
				p2[idx2]=0;
				idx2=0;
				p2[idx2]=2;
				isRun=false;
			}
			else if(idx1==idx2&& idx2!=0 && turn%2==1) {
				System.out.println("p2이 p1를 잡았다");
				p1[idx1]=0;
				idx1=0;
				p1[idx1]=1;
				isRun=true;
			}
		
		}
		
	}
}
