package step3_02.arrayAdvance2;

import java.util.Scanner;

// #오목

public class ArrayEx42_정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		int win=0;
		int px1=0;
		int py1=0;
		int px2=0;
		int py2=0;
		int turn=0;
		
		while (true) {
			System.out.print("  ");
			for (int i = 0; i < omok.length; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			// 전체화면 출력
			for (int i = 0; i < omok.length; i++) {
				System.out.print(i+" ");
				
				for (int j = 0; j < omok.length; j++) {
					if(omok[i][j]==0) {
						System.out.print("0 ");
					}
					else if(omok[i][j]==1) {
						System.out.print("o ");
					}
					else if(omok[i][j]==2) {
						System.out.print("x ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			if(win==1) {
				System.out.println("p1승리");
				break;
			}
			else if(win==2) {
				System.out.println("p2승리");
				break;
			}
			
			// 바둑알 두기
			if(turn%2==0) {
				System.out.println("p1차례");
				System.out.println("x좌표입력");
				px1=scan.nextInt();
				System.out.println("y좌표입력");
				py1=scan.nextInt();
				omok[py1][px1]=1;
				turn++;
			}
			else if(turn%2==1) {
				System.out.println("p2차례");
				System.out.println("x좌표입력");
				px2=scan.nextInt();
				System.out.println("y좌표입력");
				py2=scan.nextInt();
				omok[py2][px2]=2;
				turn++;
			}
			
			// 가로검사 //오목은 5번 연속으로 둬야 승리함으로 cnt로 하면 안됨. 빙고는 5x5여서 무조건연속5번이 됨으로 가능한것임
			for (int i = 0; i < omok.length; i++) {
				for (int j = 0; j < omok[i].length-4; j++) {
					if(omok[i][j]==1 && omok[i][j+1]==1 && omok[i][j+2]==1 && omok[i][j+3]==1 && omok[i][j+4]==1) win=1;
					else if(omok[i][j]==2 && omok[i][j+1]==2 && omok[i][j+2]==2 && omok[i][j+3]==2 && omok[i][j+4]==2) win=2;
				}
			}
			// 세로검사
			for (int i = 0; i < omok.length-4; i++) {
				for (int j = 0; j < omok[i].length; j++) {
					if(omok[i][j]==1 && omok[i+1][j]==1 && omok[i+2][j]==1 && omok[i+3][j]==1 && omok[i+4][j]==1) win=1;
					else if(omok[i][j]==2 && omok[i+1][j]==2 && omok[i+2][j]==2 && omok[i+3][j]==2 && omok[i+4][j]==2) win=2;
				}
			}

			// 대각선 검사
			for (int i = 0; i < omok.length-4; i++) {
				for (int j = 0; j < omok.length-4; j++) {
					if(omok[i][j]==1 && omok[i+1][j+1]==1 && omok[i+2][j+2]==1 && omok[i+3][j+3]==1 && omok[i+4][j+4]==1) win=1;
					if(omok[i][j]==2 && omok[i+1][j+1]==2 && omok[i+2][j+2]==2 && omok[i+3][j+3]==2 && omok[i+4][j+4]==2) win=1;
				}
			}
			for (int i = 9; i >3; i--) {
				for (int j = 0; j < omok.length-4; j++) {
					if(omok[i][j]==1 && omok[i-1][j+1]==1 && omok[i-2][j+2]==1 && omok[i-3][j+3]==1 && omok[i-4][j+4]==1) win=1;
					if(omok[i][j]==2 && omok[i-1][j+1]==2 && omok[i-2][j+2]==2 && omok[i-3][j+3]==2 && omok[i-4][j+4]==2) win=1;
					
				}
			}
		}
		
		scan.close();

	}

}
