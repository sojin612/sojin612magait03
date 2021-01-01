package step6_02.method;
/*
 * 
 * 클래스의 구성요소
 * 
 * 1) 변수
 * 2)메서드 (method)
 * 
 * 2-1) void   : return 타입(int, double, char, int[], string)
 * 2-2) say    : 메서드명 (주로 소문자로 시작하고 동사형태로 작성한다.)
 * 2-3) ()     : 입력값을 받는 부분
 * 2-4) {}     : 메서드의 영역
 * 2-5) return : 반환값
 * 
 * 
 * 
 */

class Student1{
	
//	울타입 세탁기(섬유유연제,세제,냄새나는빨래) {
//		물높이조절,헹굼,탈수
//		return깨끗해진 빨래;
//	}
	
	
	void say() {
		System.out.println("안녕하세요");
		//return;   //return값이 void일때는 생략가능
	}
}
public class MethodEx01 {

	public static void main(String[] args) {
		
		
		Student1 std = new Student1();
		
		std.say();
		

	}

}
