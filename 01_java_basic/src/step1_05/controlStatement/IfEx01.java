package step1_05.controlStatement;

/*
 * 조건문 if
 * 
 * 조건문이 true 이면 실행되는 구문 (false면 실행안됨)
 * 
 * <형식>
 * if(조건식) {
 * 
 * 조건식이 true일때 실행할 명령어; 
 * }
 * 
 * 
 * 
 */



public class IfEx01 {

	public static void main(String[] args) {

		if (true) {
			System.out.println("실행 0"); // if안 명령어는 tab으로 들여쓰기 한다
		}
		
		if (false) {
			System.out.println("실행 x");
		}
		
		int number = 8;
		if (number %2==0) {   //if 문 안에 명령어가 1줄이면 {}생략가능
			System.out.println("짝수");
		}
		if (number %2==1) {
			System.out.println("홀수");
					
		}
		
		
	}

}
