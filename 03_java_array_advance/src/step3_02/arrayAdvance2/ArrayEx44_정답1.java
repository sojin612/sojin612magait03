package step3_02.arrayAdvance2;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)

public class ArrayEx44_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];	
		int[] temp = new int[maxNum*maxNum];
		int size = 50;	
		int win = 0;
		
		// 중복을 제거한 랜덤숫자를 임시 저장
		for (int i = 0; i < temp.length; i++) {
			temp[i]=ran.nextInt(size)+1;
			for (int j = 0; j < i; j++) {
				if(temp[i]==temp[j])
					i--;
			}
		}
		
		// 중복을 제거한 랜덤숫자를 빙고판에 대입
		int k=0;
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				bingo[i][j]=temp[k];
				k++;
			}
		}
		while (true) {
			System.out.println("=============== BINGO GAME ===============");
			System.out.print("\t");
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i+"\t");
			
				for (int j = 0; j < maxNum; j++) {
					if(mark[i][j]==0) {
						System.out.print(bingo[i][j]+"\t");
					}
					else {
						System.out.print("o\t");
					}
				
				}
				System.out.println();
			
			}
			//게임종료    
			if(win==1) {
				System.out.println("승리");
				break;
			}
			//좌표입력
			System.out.println("x좌표입력");
			int x=scan.nextInt();
			System.out.println("y좌표입력");
			int y=scan.nextInt();
			if(mark[y][x]==0) {
				mark[y][x]=1;
			}
			// 가로검사
			int count=0;
			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if(mark[i][j]==1) {
						count++;
					}
				}
				if(count==5) {
					win=1;
					break;
				}
			}
			
			// 세로검사
			count=0;
			for (int j = 0; j < maxNum; j++) {
				for (int i = 0; i < maxNum; i++) {
					if(mark[i][j]==1) {
						count++;
					}
				}
				if(count==5) {
					win=1;
					break;
				}
			}
			
			// 대각선 검사
			count=0;
			for (int i = 0; i < maxNum; i++) {
				int j=0;
				if(mark[i][j]==1)
					count++;
					j++;
			}
			if(count==5) {
				win=1;
				break;
			}
			count=0;
			for (int i = 0; i < maxNum; i++) {
					if(mark[i][4-i]==1) {
						count++;
					}
			}
			if(count==5) {
				win=1;
				break;
			}
			
			
		}
		scan.close();
	}

}
