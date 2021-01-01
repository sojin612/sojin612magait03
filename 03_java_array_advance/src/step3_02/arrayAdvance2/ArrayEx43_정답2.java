package step3_02.arrayAdvance2;

import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx43_정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int px=0;
		int py=0;
		int x=0;
		int y=0;
		int xx=0;
		int yy=0;
		int wallCount=0;
		int ballX=0;
		int ballY=0;
		int goalX=0;
		int goalY=0;
		
		// 벽 설치
		System.out.println("설치할 벽의 개수를 입력하세요");
		wallCount =scan.nextInt();
		while(wallCount>0) {
			int ry=ran.nextInt(SIZE);
			int rx=ran.nextInt(SIZE);
			if(map[ry][rx]==0) {
				map[ry][rx]=WALL;
				wallCount--;
			}
		}
		
		// 공 설치
		while(true) {
			ballY=ran.nextInt(SIZE-2)+1;
			ballX=ran.nextInt(SIZE-2)+1;
			if(map[ballY][ballX]==0) {
				map[ballY][ballX]=BALL;
				break;
			}
		}
		// 골대 설치
		while(true) {
			goalY=ran.nextInt(SIZE);
			goalX=ran.nextInt(SIZE);
			if(map[goalY][goalX]==0) {
				map[goalY][goalX]=GOAL;
				break;
			}
		}
		// 화면 출력
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		// 플레이어 배치
		while(true) {
			System.out.println("플레이어위치입력");
			System.out.println("y좌표입력");
			py=scan.nextInt();
			System.out.println("x좌표입력");
			px=scan.nextInt();
			if(map[py][px]==0) {
				map[py][px]=PLAYER;
				break;
			}
		}
		
		// 게임 시작
	while(true) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(map[i][j]==WALL) {
					System.out.print("벽 ");
				}
				else if(map[i][j]==BALL) {
					System.out.print("공 ");
				}
				else if(map[i][j]==GOAL) {
					System.out.print("골 ");
				}
				else if(map[i][j]==PLAYER) {
					System.out.print("옷 ");
				}
				else if(map[i][j]==0) {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
			
			// 골대에 공을 넣으면 게임 종료
			if(ballY==goalY && ballX==goalX) {
				System.out.println("게임종료");
				break;
			}
			
			// 현재위치 저장하기
			y=py;
			x=px;
			System.out.println("1)상 2)하 3)좌 4)우 숫자입력");
			int move= scan.nextInt();
			if(move==1) {
				y=y-1;
			}
			else if(move==2) {
				y=y+1;
			}
			else if(move==3) {
				x=x-1;
			}
			else if(move==4) {
				x=x+1;
			}
			// 예외처리
			if(y>=SIZE || y<0) continue;
			else if(x>=SIZE || x<0) continue;
			else if(map[y][x]!=0 && map[y][x]!=BALL) continue;
			// 공을 만나면
			if(map[y][x]==BALL) {
				yy=ballY;
				xx=ballX;
				if(move==1) yy=yy-1;
				else if(move==2) yy=yy+1;
				else if(move==3) xx=xx-1;
				else if(move==4) xx=xx+1;
					
				// 예외처리
				if(yy>=SIZE || yy<0) continue;
				else if(xx>=SIZE || xx<0) continue;
				else if(map[yy][xx]!=0 && map[yy][xx]!=GOAL) continue;
				// 공 이동시키기
				map[ballY][ballX]=0;
				ballY=yy;
				ballX=xx;
				map[ballY][ballX]=BALL;
			}
			// 캐릭터 이동시키기
		map[py][px]=0;
		py=y;
		px=x;
		map[py][px]=PLAYER;
		
	}
		
		scan.close();
		
	}

}
