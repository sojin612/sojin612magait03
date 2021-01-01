package step4_01.string;

import java.util.Scanner;

/*
 * 1)next() : 공백을 기준으로 한단어만 입력받는다.
 * 2)nextLine()  : enter입력 전까지 전체를 입력받는다.
 * 
 * nextLine()은 버퍼관련 이슈가 생길 수 있으니 버퍼를 정리해 주어야 한다.
 * 
 */

public class StringEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		//String name= scan.next();
		String name= scan.nextLine();
		System.out.println("name: " + name);
		
		System.out.print("나이를 입력하세요: ");
		//String name= scan.next();
		int age= scan.nextInt();
		System.out.println("age: " + age);
		
		scan.nextLine(); //버퍼에 남아있는 enter를 제거 (버퍼비우기) 숫자에서nextLine을 만날때만
		
		System.out.print("특이사항을 입력하세요: ");
		//String name= scan.next();
		String comment= scan.nextLine();
		System.out.println("comment: " + comment);
		
	}

}
