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



public class ArrayEx40_정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		
		while(true) {
			System.out.println(Arrays.toString(scores));
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("추가할 값을 입력하세요");
				int value=scan.nextInt();
				if(elementCnt==0) {
					scores=new int[elementCnt+1];
				}
				else if(elementCnt>0) {
					int[] temp=scores;
					scores=new int[elementCnt+1];
					for (int i = 0; i < temp.length; i++) {
						scores[i]=temp[i];
					}
					temp=null;
				}
				scores[elementCnt]=value;
				elementCnt++;
				System.out.println("추가완료");
			}
			else if(sel == 2) {
				System.out.println("삭제할 인덱스를 입력하세요");
				int delIdx=scan.nextInt();
				if(elementCnt==1) {
					scores=null;
				}
				else if(elementCnt>1) {
					int[] temp= scores;
					scores=new int[elementCnt-1];
					int j=0;
					for (int i = 0; i < temp.length; i++) {
						if(i!=delIdx) {
							scores[j]=temp[i];
							j++;
						}
					}
					temp=null;
				}
				elementCnt--;
				System.out.println("삭제완료");
			}
			else if(sel == 3) {
				System.out.println("삭제할 값을 입력하세요");
				int delValue=scan.nextInt();
				if(elementCnt==1) {
					scores=null;
				}
				else if(elementCnt>1) {
					int[] temp= scores;
					scores=new int[elementCnt-1];
					int idx=0;
					for (int i = 0; i < temp.length; i++) {
						if(delValue==temp[i]) {
							idx=i;
						}
					}
					int j=0;
					for (int i = 0; i < temp.length; i++) {
						if(i!=idx) {
							scores[j]=temp[i];
							j++;
						}
					}
					temp=null;
				}
				elementCnt--;
				System.out.println("삭제완료");
			}
			else if(sel == 4) {
				System.out.println("삽입할 인덱스를 입력하세요");
				int idx=scan.nextInt();
				System.out.println("삽입할 값을 입력하세요");
				int value= scan.nextInt();
				if(elementCnt==0) {
					scores=new int[elementCnt+1];
				}
				else if(elementCnt>0) {
					int[] temp= scores;
					scores=new int[elementCnt+1];
					int j=0;
					for (int i = 0; i < scores.length; i++) {
						if(i!=idx) {
							scores[i]=temp[j];
							j++;
						}
					}
					temp=null;
				}
				scores[idx]=value;
				elementCnt++;
				
			}
			else if(sel == 0) {
				break;
			}
		}



	}

}
