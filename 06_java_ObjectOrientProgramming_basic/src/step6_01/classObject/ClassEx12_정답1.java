package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

//09:25~10:20  ox가 출력이 안됨-for가 while안에 있어서 초기화됨
class Ex12{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}



public class ClassEx12_정답1 {
	
	public static void main(String[] args) {
		Ex12 e1=new Ex12();
		Scanner scan= new Scanner(System.in);
		Random ran = new Random();
		
		for (int i = 0; i < e1.game.length; i++) {
			for (int j = 0; j < e1.game[i].length; j++) {
				e1.game[i][j]="[ ]";
			}
		}
		while(true) {
			System.out.println("===틱택토===");
			for (int i = 0; i < e1.game.length; i++) {
				for (int j = 0; j < e1.game[i].length; j++) {
					System.out.print(e1.game[i][j]+" ");
				}
				System.out.println();
				
			}
			System.out.println();
			if(e1.win==1) {
				System.out.println("p1승리");
				break;
			}
			else if(e1.win==2) {
				System.out.println("p2승리");
				break;
			}
			else if(e1.win==0 && e1.turn==9) {
				System.out.println("비겼다");
				break;
			}
			
			if(e1.turn%2==0) {
				System.out.println("p1차례:x좌표입력");
				int x1=scan.nextInt();
				System.out.println("p1차례:y좌표입력");
				int y1=scan.nextInt();
				if(e1.game[y1][x1].equals("[ ]")) {
					e1.game[y1][x1]="[o]";
					e1.turn++;
				}
			}
			else if(e1.turn%2==1) {
				System.out.println("p2차례");
				int rx=ran.nextInt(3);
				int ry=ran.nextInt(3);
				if(e1.game[ry][rx].equals("[ ]")) {
					e1.game[ry][rx]="[x]";
					e1.turn++;
				}
			}
			for (int i = 0; i < e1.game.length; i++) {
				if(e1.game[i][0].equals("[o]")&&e1.game[i][1].equals("[o]")&&e1.game[i][2].equals("[o]")) {e1.win=1;}
				if(e1.game[i][0].equals("[x]")&&e1.game[i][1].equals("[x]")&&e1.game[i][2].equals("[x]")) {e1.win=2;}
			}
			for (int j = 0; j < e1.game.length; j++) {
				if(e1.game[0][j].equals("[o]")&&e1.game[1][j].equals("[o]")&&e1.game[2][j].equals("[o]")) {e1.win=1;}
				if(e1.game[0][j].equals("[x]")&&e1.game[1][j].equals("[x]")&&e1.game[2][j].equals("[x]")) {e1.win=2;}
			}
			if(e1.game[0][0].equals("[o]")&&e1.game[1][1].equals("[o]")&&e1.game[2][2].equals("[o]")) {e1.win=1;}
			if(e1.game[0][0].equals("[x]")&&e1.game[1][1].equals("[x]")&&e1.game[2][2].equals("[x]")) {e1.win=2;}
			
			if(e1.game[0][2].equals("[o]")&&e1.game[1][1].equals("[o]")&&e1.game[2][0].equals("[o]")) {e1.win=1;}
			if(e1.game[0][2].equals("[x]")&&e1.game[1][1].equals("[x]")&&e1.game[2][0].equals("[x]")) {e1.win=2;}
		}
		scan.close();
	}

}
