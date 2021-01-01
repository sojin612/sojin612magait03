package step3_02.arrayAdvance2;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver2(플레이어 2명)

public class ArrayEx45_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		
		
		int size = 50;
		
		int[][] me  = new int[maxNum][maxNum];
		int[][] you = new int[maxNum][maxNum];
		
		int[][] meMark  = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];

		int[] temp = new int[maxNum*maxNum];
		
		int win = 0;
		int turn = 0;
		int p1X = 0;	int p1Y = 0;
		int p2X = 0;	int p2Y = 0;
		
		// me 셋팅(중복없이 숫자 넣기)
		for (int i = 0; i < temp.length; i++) {
			temp[i]=ran.nextInt(size)+1;
			for (int j = 0; j < i; j++) {
				if(temp[i]==temp[j]) {
					i--;
				}
			}
		}
		int k=0;
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				me[i][j]=temp[k];
				k++;
			}
		}
		
		// you 셋팅(중복없이 숫자 넣기)
		for (int i = 0; i < temp.length; i++) {
			temp[i]=ran.nextInt(size)+1;
			for (int j = 0; j < i; j++) {
				if(temp[i]==temp[j]) {
					i--;
				}
			}
		}
		k=0;
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				you[i][j]=temp[k];
				k++;
			}
		}
		while(true) { // 전체화면 출력
			System.out.println("========= BINGO GAME[Me] =========");
			System.out.print("\t");
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i+"\t");
				for (int j = 0; j < maxNum; j++) {
					if(meMark[i][j]==0) {
					System.out.print(me[i][j]+"\t");
					}
					else {
						System.out.print("o\t");
					}
				}
				System.out.println();
			}
			System.out.println("========= BINGO GAME[You] =========");
			System.out.print("\t");
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i+"\t");
				for (int j = 0; j < maxNum; j++) {
					if(youMark[i][j]==0) {
						System.out.print(you[i][j]+"\t");
					}
					else {
						System.out.print("x\t");
					}
				}
				System.out.println();
			}
			
			//승리하면 게임종료
			if(win==1) {
				System.out.println("p1승리");
				break;
			}
			if(win==2) {
				System.out.println("p2승리");
				break;
			}
			//p1 p1 번갈아가면서 플레이
			if(turn%2==0) {
				System.out.println("p1차례");
				System.out.println("x좌표입력");
				p1X=scan.nextInt();
				System.out.println("y좌표입력");
				p1Y=scan.nextInt();
				if(meMark[p1Y][p1X]==0) {
					meMark[p1Y][p1X]=1;
					turn++;
					for (int i = 0; i < maxNum; i++) {
						for (int j = 0; j < maxNum; j++) {
							if(meMark[p1Y][p1X]==you[i][j]) {
								if(youMark[i][j]==0) {
									youMark[i][j]=1;
								}
							}
						}
					}
				}
			}
			if(turn%2==1) {
				System.out.println("p2차례");
				System.out.println("x좌표입력");
				p2X=scan.nextInt();
				System.out.println("y좌표입력");
				p2Y=scan.nextInt();
				if(youMark[p2Y][p2X]==0) {
					youMark[p2Y][p2X]=1;
					turn++;
					for (int i = 0; i < maxNum; i++) {
						for (int j = 0; j < maxNum; j++) {
							if(youMark[p1Y][p1X]==me[i][j]) {
								if(meMark[i][j]==0) {
									meMark[i][j]=1;
								}
							}
						}
					}
				}
			}
			// 승패결정 가로 체크
			int count=0;
			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if(meMark[i][j]==1) {
						count++;
					}
				}
				if(count==5) {
					win=1;
				}
			}
			count=0;
			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if(youMark[i][j]==1) {
						count++;
					}
				}
				if(count==5) {
					win=2;
				}
			}
			
			// 승패결정 세로 체크
			count=0;
			for (int j = 0; j < maxNum; j++) {
				for (int i = 0; i < maxNum; i++) {
					if(meMark[i][j]==1) {
						count++;
					}
				}
				if(count==5) {
					win=1;
					break;
				}
			}
			count=0;
			for (int j = 0; j < maxNum; j++) {
				for (int i = 0; i < maxNum; i++) {
					if(youMark[i][j]==1) {
						count++;
					}
				}
				if(count==5) {
					win=2;
					break;
				}
			}
			
			// 승패결정 대각선 체크
			count=0;
			int j=0;
			for (int i = 0; i < maxNum; i++) {
				if(meMark[i][j]==1) {
					count++;
					j++;
				}
			}
			if(count==5) {
				win=1;
				break;
			}
			count=0;
			j=0;
			for (int i = 0; i < maxNum; i++) {
				if(youMark[i][j]==1) {
					count++;
					j++;
				}
			}
			if(count==5) {
				win=2;
				break;
			}
			// 승패결정 대각선 체크
			count=0;
			for (int i = 0; i < maxNum; i++) {
				if(meMark[i][4-i]==1) {
					count++;
				}
			}
			if(count==5) {
				win=1;
				break;
			}
			count=0;
			for (int i = 0; i < maxNum; i++) {
				if(youMark[i][4-i]==1) {
					count++;
				}
			}
			if(count==5) {
				win=2;
				break;
			}
		}

	}

}
