package step6_02.method;

import java.util.Scanner;


//# 틱택토

class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	// game 배열을 공백(" ")으로 초기화
	void start() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				game[i][j]="[ ]";
			}
		}
	}
	
	
	// 게임 화면 출력
	
	void showPlay() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				System.out.print(game[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	// 인덱스 선택
	void play() {
		if(turn%2==0) {
			System.out.println("p1차례");
			System.out.println("y좌표입력");
			int y1=scan.nextInt();
			System.out.println("x좌표입력");
			int x1=scan.nextInt();
			if(game[y1][x1]=="[ ]") {
				game[y1][x1]="[O]";
				turn++;
			}
		}
		else if(turn%2==1) {
			System.out.println("p2차례");
			System.out.println("y좌표입력");
			int y2=scan.nextInt();
			System.out.println("x좌표입력");
			int x2=scan.nextInt();
			if(game[y2][x2]=="[ ]") {
				game[y2][x2]="[X]";
				turn++;
			}
		}
	}
		
	
	// 종료 : 가로 검사
	// 00 01 02
	// 10 11 12
	// 20 21 22
	void wide() {
		for(int i=0; i<3; i++) {
			if(game[i][0].equals("[O]")&& game[i][1].equals("[O]")&& game[i][1].equals("[O]")) {win=1;}
			if(game[i][0].equals("[x]")&& game[i][1].equals("[x]")&& game[i][1].equals("[x]")) {win=2;}
			
		}
	}
	
	// 종료 : 세로 검사
	void high() {
		for(int i=0; i<3; i++) {
			if(game[0][i].equals("[O]")&& game[1][i].equals("[O]")&& game[2][i].equals("[O]")) {win=1;}
			if(game[0][i].equals("[x]")&& game[1][i].equals("[x]")&& game[2][i].equals("[x]")) {win=2;}
			
		}
	}
	// 00 10 20
	// 01 11 21
	// 02 12 22
	
	
	// 종료 : 대각선 검사
	// 00 11 22
	// 02 11 20
	void slash() {
		if(game[0][0].equals("[O]")&& game[1][1].equals("[O]")&& game[2][2].equals("[O]")) {win=1;}
		if(game[0][0].equals("[x]")&& game[1][1].equals("[x]")&& game[2][2].equals("[x]")) {win=2;}
		if(game[0][2].equals("[O]")&& game[1][1].equals("[O]")&& game[2][0].equals("[O]")) {win=1;}
		if(game[0][2].equals("[x]")&& game[1][1].equals("[x]")&& game[2][0].equals("[x]")) {win=2;}
	
	}
	
	void run() {
		
		// game배열을 공백 문자열(" ")로 초기화
		start();
		
		while(true) {
			showPlay();
			
			// 게임 종료
			if(win==1) {
				System.out.println("p1승리");
				break;
			}
			if(win==2) {
				System.out.println("p2승리");
				break;
			}
			if(win==0 && turn==9) {
				System.out.println("비겼다");
				break;
			}
			play();
			wide();
			high();
			slash();
			
			
		}		
	}
	
}


public class MethodEx16_테스트정답1 {

	public static void main(String[] args) {
		
		TicTacToe tic = new TicTacToe();
		tic.run();

	}

}
