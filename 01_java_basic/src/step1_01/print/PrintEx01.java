package step1_01.print; //패키지선언문은 '항상'첫줄에 작성한다.

// 2)주석 (comment) : 설명문을 작성하기 위한 방법으로 프로그램의 실행에 영향을 미치지 않는다.

// 2-1) 라인(line) 주석 :  한줄 주석

/*
 * 2-2)블록(block) 주석 : 여러줄 주석
 * 
 * 000책임이 000부장의 지시를 받아서 
 * ~~~~코드를 ~~~수정하였음
 */

/*
 * 3)에디터 화면 확대 및 축소 : ctrl + [+], ctrl +[-]
 * 4)뒤로 되돌리기(redo): ctrl + z
 *   앞으로 되돌리기 (undo) :ctrl + y
 *   
 * 5)저장 ctrl +s  저장하지 않았을 경우 파일명 왼쪽에 *표시가 나옴
 *                 (항상 저장하는 습관 권장)
 *  
 * 6) 출력문 자동완성
 *    6-1)sout + ctrl + space
 *    6-2)sysout + ctrl + space
 *    
 * 7)유용한 단축키
 *  삭제 : ctrl +d
 *  복사 : ctrl +alt +위아래방향키
 *  이동 : alt + 위아래방향키   
 * insert 누르면 뒤에거 잡아먹음
 *    
 *    
 *    
 *    
 */



public class PrintEx01 {
 
	public static void main(String[] args) { //메인함수{}안에서 프로그래밍 한다
		
		//탭으로 들여쓰기 이후 코드를 작성
		System.out.println("============");  //println  : 자동 줄바꿈 기능
		System.out.println("메뉴선택");
		System.out.println("===========");
		
		System.out.println("1)로그인(login)");		
		System.out.println("2)로그아웃(logout)");				
		System.out.println("3)종료(exit)");		
		
		System.out.println(); //아무내용이 없으면 줄바꿈 기능만 적용(한줄뛰기)
		System.out.println();
		System.out.println();
		
		
		System.out.print("출력문1"); //print : 줄바꿈기능이 없음
		System.out.print("출력문2");
		System.out.print("출력문3");
		System.out.println();		
		System.out.println("--end--");
		
	}
	
}






