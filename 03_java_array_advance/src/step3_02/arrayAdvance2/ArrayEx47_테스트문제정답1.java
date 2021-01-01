package step3_02.arrayAdvance2;

import java.util.Scanner;

/*
문제1) 숫자 0이 플레이어이다. 
	    
	    1) left 2)right 3)up 4)down 5)되감기
		번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다. 
		 예) 1 ==> 
		
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,0,15}		
		 
		
문제2) 심화  ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가 
 	5번입력시 ==> 왔던길로 되돌아가기 한다.
 	
*/

public class ArrayEx47_테스트문제정답1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int game[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,0}
				};
		
		int yx [][] = new int[10000][2]; //xy좌표2개씩이 만번 들어있다
//		for (int i = 0; i < yx.length; i++) {
//			for (int j = 0; j < yx.length; j++) {
//				yx[i][0]= y좌표;
//				yx[i][1]= x좌표;
//				
//			}
//		}
		int player=0;
		int temp=0;
		int y=0;
		int x=0;
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if(game[i][j]==0) {
					player=game[i][j];
					y=i;
					x=j;
				}
			}
		}
		while(true) {
		for (int i = 0; i < game.length; i++) {
			System.out.print(i+" ");
			for (int j = 0; j < game[i].length; j++) {
				System.out.print(game[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("left(1),right(2),up(3),down(4),되감기(5):숫자를 입력하세요");
			int move=scan.nextInt();
			
			
			if(move==1) {
				if(x-1>=0) {
					temp=game[y][x];
					game[y][x]=game[y][x-1];
					game[y][x-1]=temp;
					x=x-1;
					//game[y][x]=game[y][x-1];
					//game[y][x-1]=0;
					//x=x-1; 이렇게 해도 돌아감
				}
			}
			else if(move==2) {
				if(x+1<=game.length) {
					temp=game[y][x];
					game[y][x]=game[y][x+1];
					game[y][x+1]=temp;
					x=x+1;
				}
			}
			else if(move==3) {
				if(y-1>=0) {
					temp=game[y][x];
					game[y][x]=game[y-1][x];
					game[y-1][x]=temp;
					y=y-1;
				}
			}
			else if(move==4) {
				if(y+1<=game.length) {
					temp=game[y][x];
					game[y][x]=game[y+1][x];
					game[y+1][x]=temp;
					y=y+1;
			
				}
			}
			
		}
		
		
	}	

}
