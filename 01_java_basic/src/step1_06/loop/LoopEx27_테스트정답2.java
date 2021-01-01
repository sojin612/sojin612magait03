package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/

public class LoopEx27_테스트정답2 {

	public static void main(String[] args) {
		int k=1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 8-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(k+" ");
			}
			k++;
			System.out.println();
		}
		
	}

}
