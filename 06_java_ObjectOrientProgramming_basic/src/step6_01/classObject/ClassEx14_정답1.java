package step6_01.classObject;
/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

// int i 를 같은 것을 쓰면 값이 초기화가 안되고 값이 올라가서 for가 안돔
import java.util.Scanner;

class Ex14{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{1,1,0,0,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
}


public class ClassEx14_정답1 {

	public static void main(String[] args) {
		Ex14 e1=new Ex14();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("사다리게임");
		
		for (int i = 0; i < e1.ladder[0].length; i++) {
			System.out.print(" "+i+" ");
		}
		System.out.println();
		for (int i = 0; i < e1.ladder.length; i++) {
			for (int j = 0; j <e1.ladder[i].length; j++) {
				
				if(e1.ladder[i][j]==0) {
					System.out.print(" │ ");
				}
				else if(j!=0&&e1.ladder[i][j]==1&&e1.ladder[i][j-1]==1) {
					System.out.print("─┤ ");
				}
				else if(j!=4&&e1.ladder[i][j]==1&&e1.ladder[i][j+1]==1) {
					System.out.print(" ├─");
				}
			}
			System.out.println();
		}
		System.out.println("x좌표입력(0~4)");
		e1.x=scan.nextInt();
		for (int i = 0; i < e1.ladder.length; i++) {
				
			if (e1.x != e1.ladder[0].length-1 && e1.ladder[e1.y][e1.x] == 1 && e1.ladder[e1.y][e1.x + 1] == 1) {
				e1.x++;
				for( int k=0; k<e1.ladder.length; k++) {
					for(int j=0; j<e1.ladder[k].length; j++) {
						if 		(k == e1.y && j == e1.x)														System.out.print(" * ");
						else if (e1.ladder[k][j] == 0) 														  	System.out.print(" │ ");
						else if (j != 0 && e1.ladder[k][j] == 1 && e1.ladder[k][j - 1] == 1) 					System.out.print("─┤ ");
						else if (j != e1.ladder[k].length-1 && e1.ladder[k][j] == 1 && e1.ladder[k][j + 1] == 1)System.out.print(" ├─");
					}
					System.out.println();
				}
				System.out.println();
				
			}
			else if (e1.x != 0 && e1.ladder[e1.y][e1.x] == 1 && e1.ladder[e1.y][e1.x - 1] == 1) {
				e1.x--;
				for (int l=0;l<e1.ladder.length; l++) {
					for (int j=0; j<e1.ladder[l].length; j++) {
						if 		(l == e1.y && j == e1.x)														System.out.print(" * ");
						else if (e1.ladder[l][j] == 0) 															System.out.print(" │ ");
						else if (j != 0 && e1.ladder[l][j] == 1 && e1.ladder[l][j - 1] == 1) 					System.out.print("─┤ ");
						else if( j != e1.ladder[l].length-1 && e1.ladder[l][j] == 1 && e1.ladder[l][j + 1] == 1)System.out.print(" ├─");
					}
					System.out.println();
				}
				System.out.println();
			}
			e1.y++;
	
		}
		System.out.println("오늘의 메뉴는"+e1.menu[e1.x]);
		
		scan.close();
		
		
		
		
	}

}
