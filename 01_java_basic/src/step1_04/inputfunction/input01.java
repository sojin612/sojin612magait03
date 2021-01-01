package step1_04.inputfunction;
import java.util.Scanner;

/*
 * 콘솔에 키보드로 입력받기
 * 
 * 순서 중요
 * 1) import java.util.Scanner;           // Scanner 클래스를 불러온다
 * 2) Scanner scan = new Scanner(System.in); // Scan 변수를 설정한다
 * 3) System.out.print ("나이 입력:"); 		//안내문을 작성한다
 * 4)int getAge = scan.nextInt();			//키보드로 입력을 받는다
 * 5)scan.close();							//종료
 * 
 */

public class input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); //시작에서 한번만 생성하면 된다
		
		System.out.println("나이를 입력하세요: ");
		int getAge = scan.nextInt(); // 숫자만 입력가능 (글자는 후에)
		
		System.out.println("입력하신 나이는  :"+ getAge + "살 입니다");
		System.out.println("내년 나이는 "+ (getAge+1) +"살 입니다");
		System.out.println("5년뒤 나이는 " + (getAge+5) +" 살 입니다");
		
		System.out.print("나이를 입력하세요 : ");
		scan.nextInt();
	
		System.out.println("입력하신 나이는  :"+ getAge + "살 입니다");
		System.out.println("내년 나이는 "+ (getAge+1) +"살 입니다");
		System.out.println("5년뒤 나이는 " + (getAge+5) +" 살 입니다");
		
		
		
		scan.close(); //코드의 맨마지막에 작성한다
		
		
	}

}
