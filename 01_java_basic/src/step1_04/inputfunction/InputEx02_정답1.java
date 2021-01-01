package step1_04.inputfunction;

import java.util.Scanner;

public class InputEx02_정답1 {

	public static void main(String[] args) {
		
		
		//문제1) 숫자2개를 입력받아서 합을 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력: ");
		int number1 = scan.nextInt();
		System.out.println("두번째 숫자 입력: ");
		int number2 = scan.nextInt();
		System.out.println(number1+number2);
		
		//문제2) 숫자1개를 입력받아서 홀수이면 트루 출력
		System.out.println("숫자입력해: ");
		int number3 = scan.nextInt();
		System.out.println(number3%2==1);
		
		
		//문제3) 성적을 입력 받아서 60점 이상이고 100점이하이면 트루출력
		System.out.println("성적을 입력해: ");
		int score = scan.nextInt();
		System.out.println(score>=60 && score<=100);
		
		
		
	}

}
