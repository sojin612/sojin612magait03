package step1_05.controlStatement;

import java.util.Random;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 */


public class IfEx15_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		if(rNum < 3) {
			System.out.println("당첨");
		}
		if(rNum >= 3) {
			System.out.println("꽝");
		}


	}

}
