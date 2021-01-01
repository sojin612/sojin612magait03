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

public class ArrayEx47_테스트문제정답3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int game[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,0}
				};
		
		int yx [][] = new int[10000][2];
		int y=3;
		int x=3;
		int py=y;
		int px=x;
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if(game[i][j]==0) {
					game[py][px]=game[i][j];
					py=i;
					px=j;
				}
			}
		}
		int count=0;
		yx[count][0]=px;
		yx[count][1]=py;
		while(true) {
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					System.out.print(game[i][j]+"	");
				}
				System.out.println();
			}
			System.out.println("1)왼쪽 2)오른쪽 3)위 4)아래 5)되감기 : 숫자입력");
			int num=scan.nextInt();
			if(num==1) {
				if(px-1>=0) {
					count++;
					int temp=game[py][px];
					game[py][px]=game[py][px-1];
					game[py][px-1]=temp;
					px=px-1;
					yx[count][0]=px;
					yx[count][1]=py;
				}
				
			}
			else if(num==2) {
				if(px+1<game.length) {
					count++;
					int temp=game[py][px];
					game[py][px]=game[py][px+1];
					game[py][px+1]=temp;
					px=px+1;
					yx[count][0]=px;
					yx[count][1]=py;
				}
				
			}
			else if(num==3) {
				if(py-1>=0) {
					count++;
					int temp=game[py][px];
					game[py][px]=game[py-1][px];
					game[py-1][px]=temp;
					py=py-1;
					yx[count][0]=px;
					yx[count][1]=py;
					}
			
			}
			else if(num==4) {
				if(py+1<game.length) {
					count++;
					int temp=game[py][px];
					game[py][px]=game[py+1][px];
					game[py+1][px]=temp;
					py=py+1;
					yx[count][0]=px;
					yx[count][1]=py;
				}
			
			}
			else if(num==5) {
				if(count-1>=0) {
					x=yx[count-1][0];
					y=yx[count-1][1];
					game[py][px]=game[y][x];
					game[y][x]=0;
					px=x;
					py=y;
					count--;
				}
			
			}
			
		}
	}

}
