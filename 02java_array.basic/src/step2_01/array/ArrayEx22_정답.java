package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */

public class ArrayEx22_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			if(selectMenu==1) {
				if(elementCnt==5) {
					System.out.println("더이상 추가할 수 없습니다");
				}
				else {
					System.out.println("추가할 값을 입력하세요");
					int value=scan.nextInt();
					arr[elementCnt]=value;
					elementCnt++;
					
				}
			}
			else if(selectMenu==2) {
				int delIdx=0;
				System.out.println("삭제할 값을 입력하세요");
				int delValue=scan.nextInt();
				for (int i = 0; i < arr.length; i++) {
					if(delValue==arr[i]) {
						delIdx=i;
					}
				}
				if(delIdx==0) {
					System.out.println("삭제할 값이 없습니다");
				}
				
				else {
					for (int i = delIdx; i < elementCnt-1; i++) {
						arr[i]=arr[i+1];
					}
					elementCnt--;
					
				}
			}
			else if(selectMenu==3) {
				if(elementCnt==5) {
					System.out.println("더이상 삽입할 수 없습니다");
					break;
				}
				System.out.println("삽입할 인덱스를 입력하세요");
				int insertIdx=scan.nextInt();
				if(insertIdx<0 || insertIdx>elementCnt-1) {
					System.out.println("해당 위치를 찾을 수 없습니다");
					continue;
				}
				else {
					System.out.println("삽입할 값을 입력하세요");
					int insertValue=scan.nextInt();
					for (int i = elementCnt; i> insertIdx; i--) {
						arr[i]=arr[i-1];
					}
					arr[insertIdx]=insertValue;
					elementCnt++;
					
				}
			}
		}
		
	}
	
}
