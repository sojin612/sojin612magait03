package step1_06.loop;

import java.util.Scanner;

/*
 * 
 * 1. key값(기준값)을 입력받아서 저장한다.
 * 2. 반복문을 사용하여 -1을 입력받을때까지 일련의 수를 계속 받는다. -1을 입력받을 경우 종료한다.
 * 3. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
 * 4. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
 * 5. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
 * 
 * 예) 
 * key 값 입력 : 7
 * 
 * 입력 : 10
 * 입력 : 7
 * 입력 : 20
 * 입력 : 7
 * 입력 : 30
 * 입력 : 7
 * 입력 : 10
 * 입력 : -1
 * 
 * 결과 : key값 7가 첫번재 나타난 것은2번째 이다.
 * 
 */



public class LoopEx26_테스트정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		int maxSize=50;
		int j=0;
		int[] rnum=new int[maxSize];
		int count=-1;
			System.out.print("key값 입력 : ");
			int key = scan.nextInt();
			
			while(true) {
				System.out.println("숫자를 입력하세요");
				num =scan.nextInt();
				rnum[j]=num;
				j++;
				if(num!=-1) {
					continue;
				}
				
				else if(num==-1){
					for (int i = 0; i < maxSize; i++) {
						if(rnum[i]==key) {
							count=i;
						System.out.println(key+"값이 나타난 것은"+count+"번째 입니다");//왜 두번돌지
						break;	
						}
					}
					if(count==-1) {
						System.out.println("not found"); 
					}
				}
				
        	}
       
        
    
	}

}
