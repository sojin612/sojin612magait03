package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * . equals() 메서드 사용없이 문자의 일치여부 비교
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */
//10:00~10:10
public class StringEx14_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		int result= name.compareTo(myName);
		if(result==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
