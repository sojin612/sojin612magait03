package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */

public class StringEx10_정답1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String start = "자전거";
		while(true) {
		System.out.println("제시어 : " + start);
		int size = start.length();
			String answer=scan.next();
			char ch = start.charAt(size-1);
			char ch2= answer.charAt(0);
			if(ch==ch2) {
				start=answer;
				continue;
			}
		}
		
	}
}
