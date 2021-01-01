package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */
//9:30~9:55
public class StringEx16_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		String rs = text.substring(0,17);
		String[] text2=rs.split(" ");
		
		int cnt=0;
		for (int i = 0; i < text2.length; i++) {
			if(text2[i].equals(word)) {
				cnt=1;
			}
		}
		if(cnt==1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
