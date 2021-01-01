package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meleft 에 가위바위보 입력
	meright 에 가위바위보 입력
	
	comleft 에 가위바위보 입력 (랜덤)
	comright 에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	me 에 meleft 또는 meright 저장(집접)
	com 에 comleft 또는 comright 저장(랜덤)
	
	3) 최종판정
*/
public class ifEx25_테스트문제정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int comleft=ran.nextInt(3);
		int comright=ran.nextInt(3);
		
		System.out.println("가위0,바위1,보2");
		System.out.println("왼손가위바위보를 하세요");
		int meleft= scan.nextInt();
		System.out.println("오른손가위바위보를 하세요");
		int meright=scan.nextInt();
		
		System.out.println("왼손1 오른손2중 하나를 고르세요");
		int me= scan.nextInt();
		int com=ran.nextInt(2);
		System.out.println("나는"+me);
		System.out.println("컴은"+com);
		
		if(com==1&&me==0)
		{
			System.out.println("졌다");
		}
		if(com==2&&me==1) {
			System.out.println("졌다");
		}
		if(com==0&&me==2) {
			System.out.println("졌다");
		}
		if(com==me) {
			System.out.println("비겼다");
		}
		else {
			System.out.println("이겼다");
		}
	}

}
