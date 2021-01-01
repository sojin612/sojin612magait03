package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 *     
 */

public class IfEx21_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int number = ran.nextInt(101)+150;
		System.out.println("150~250숫자중 가운데 숫자를 맞춰보세요");
		int me= scan.nextInt();
		int middle= number%100/10;
		if(middle==me) {
			System.out.println("정답");
		}
		if(middle!=me) {
			System.out.println("땡");
		}
		
		
	}

}
