package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
	문제) 영어단어 맞추기  
	영어단어가 전부 * 로 표시된다. 
	영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	 조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	전부 벗겨지거나 맞추면 종료 
*/
//03:00~4:30
public class StringEx18_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다. 어떻게??
		int scorecnt=0;
			
			while (true) {
				int cnt=0;
				for (int i = 0; i < check.length; i++) {
					if(check[i]==0) {
						cnt++;
					}
					
				}
				
				if(cnt==0) {
					break;
				}
				System.out.println("뜻 : " + meaning);
				System.out.print("문제 : ");
				for (int i = 0; i < size; i++) {
					if (check[i]==1) {
						System.out.print(word.charAt(i));//이건 늘어나고
						
					}
					else {
						
						System.out.print("*");	//이건 줄어들고			
					}
					
				}
				System.out.println();
			
			
			
				System.out.println();
				System.out.println("영어단어를 입력하세요 >>> ");
				String me = scan.next();
			while(true) {
				if(word.equals(me)) {
					System.out.println("정답");
					for (int i = 0; i < check.length; i++) {
						check[i]=1;
					}
					break;
				}
				else {
					int r=ran.nextInt(size);
					if(check[r]==0) {
						check[r]=1;
						scorecnt++;
						
						for (int i = 0; i < size; i++) {
							if(word.charAt(i)==word.charAt(r)&& i!=r) { //if가 실행되면 안됨
								check[i]=1; 
							}
						}
						break;
					}
				}
			}
			
		}
		

		score=score-(scorecnt*5);
		System.out.println("점수는:"+score); 
	}

}
