package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */
//4:30~6:00
public class StringEx15_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		
		int size = text.length();
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		char ch= 0;
		char[] text1=new char[size];
		for (int i = 0; i < size; i++) {
			ch = text.charAt(i);
			text1[i]=ch;	
		}
	
		
		int cnt=0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < num.length; j++) {
				if(text1[i]==num[j]) { //문자는 ==이 됨
					cnt++;
				}
			}
		}
		if(cnt==size) {
			System.out.println("숫자만 있다");
		}
		else if(cnt==0) {
			System.out.println("문자만 있다");
		}
		else {
			System.out.println("문자와 숫자가 섞여있다");
		}
	}

}
