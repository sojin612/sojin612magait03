package step3_02.arrayAdvance2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx40_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		
		while(true) {
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(scores[i]+" ");
			}
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[5]초기화");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(elementCnt==0) {
					scores= new int[elementCnt+1];
				}
				else if(elementCnt>0) {
					int[] temp=scores;
					scores= new int[elementCnt+1];
					for (int i = 0; i < elementCnt; i++) {
						scores[i]=temp[i];
					}
					temp=null;
				}
				System.out.print("추가할 성적 입력: ");
				int getScore=scan.nextInt();
				scores[elementCnt]=getScore;
				elementCnt++;
			}
			else if(sel == 2) {
				System.out.print("삭제할 인텍스 입력: ");
				int getIdx=scan.nextInt();
				System.out.println();
				if(elementCnt-1<getIdx || getIdx<0) {
					System.out.println("해당 위치는 찾을 수가 없습니다");
					continue;
				}
				else if(elementCnt==1) {
					scores =null;
				}
				else if(elementCnt>1) {  //elementCnt==3
					int[] temp=scores;
					scores=new int[elementCnt-1];
					for (int i = 0; i < getIdx; i++) { 
						scores[i]=temp[i];    //옮겨담을때 날라감
					}
					for (int i = getIdx; i < elementCnt-1; i++) { //getidx=0,1
						scores[i]=temp[i+1];
					}
					temp=null;
				}
				elementCnt--;
			}
			else if(sel == 3) {
				System.out.print("삭제할 값을 입력: ");
				int delValue=scan.nextInt();
				int delIdx=-1;
				for (int i = 0; i < elementCnt; i++) {
					if(delValue==scores[i]) {
						delIdx=i;
					}
				}
				if(delIdx==-1) {
					System.out.println("삭제할 값이 없습니다");
					continue;
				}
				else {
					if(elementCnt==1) {
						scores=null;
					}
					else if(elementCnt>1) {
						int[] temp=scores;
						scores=new int[elementCnt-1];
						int j=0;
						for (int i = 0; i < elementCnt; i++) {
							if(i!=delIdx) {
								scores[j]=temp[i];
								j++;
							}
						}
						temp=null;
					}
				}
				elementCnt--;
			}
			else if(sel == 4) {
				System.out.print("삽입할 인덱스를 입력하세요: ");
				int insertIdx=scan.nextInt();
				if(elementCnt<insertIdx  || insertIdx<0) {
					System.out.println("해당위치에 삽입할 수 없습니다");
					continue;
				}
				System.out.println("삽입할 값을 입력하세요");
				int insertValue=scan.nextInt();
				if(elementCnt==0) {
					scores=new int[elementCnt+1];
				}
				else if(elementCnt>0) {
					int[] temp=scores;
					scores=new int[elementCnt+1];
					
					int j=0;
					for (int i = 0; i < elementCnt+1; i++) {
						if(i!=insertIdx) {
							scores[i]=temp[j];
							j++;
						}
					}
					temp=null;
				}
				scores[insertIdx]=insertValue;
				elementCnt++;
			}
			else if(sel==5) {
					scores=null;
			}
			else if(sel == 0) {
				break;
			}
		}
	}

}
