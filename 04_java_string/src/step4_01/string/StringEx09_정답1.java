package step4_01.string;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */
//3:00~3:50
public class StringEx09_정답1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"java", "mysql", "jsp", "spring"};
		String temp="";
		int r=0;
		for (int j = 0; j < 12; j++) {
			for (int i = r; i < words.length; i++) {
				r=ran.nextInt(4);
				temp=words[0];
				words[0]=words[r];
				words[r]=temp;
			}
			System.out.println(Arrays.toString(words));
		}

		System.out.println();
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			String answer= scan.next();
			if(!words[i].equals(answer)) {
				i--;
			}
			
		}
		
		
	}

}
