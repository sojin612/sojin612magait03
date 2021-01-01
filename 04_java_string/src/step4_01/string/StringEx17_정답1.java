package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */

//9:55~10:10
public class StringEx17_정답1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		String rs = text.substring(0,17);
		String[] text2=rs.split(" ");
	
		for (int i = 0; i < text2.length; i++) {
			if(text2[i].equals(word)) {
				System.out.println("바꿀 단어를 입력하세요");
				String change=scan.next();
				text2[i]=change;
			}
		}
		String result= "";
		for (int i = 0; i < text2.length; i++) {
			result += text2[i];
			if(i!=3) {
				result+=" ";
			}
			else {
				result+=".";
			}
		}
		System.out.println(result);
		
		
	}

}
