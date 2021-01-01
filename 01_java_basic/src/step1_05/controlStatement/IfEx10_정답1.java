package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */



public class IfEx10_정답1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.println("id를 입력해");
		int myId = scan.nextInt();
		if (dbId == myId) {
			System.out.println("pw를 입력해");
			int myPw = scan.nextInt();
			 if(dbPw==myPw) {
				 System.out.println("로그인 성공");
			 }
			 
			 else {
				 System.out.println("pw를 다시 확인해");
			 }
		}
		if (dbId!=myId) {
			System.out.println("id를 다시 확인해");
		}
		
		
		
	}

}
