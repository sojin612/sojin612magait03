package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 */


public class IfEx15_정답1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(10);
		if(com<3) {
			System.out.println("당첨");
		}
		else {
			System.out.println("다음기회에");
		}
		
		
	}

}
