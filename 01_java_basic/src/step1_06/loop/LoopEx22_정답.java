package step1_06.loop;

//# 삼각형 그리기


public class LoopEx22_정답 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i=0; i<9; i++) {
			System.out.print("#");
			if (i%3 == 2) System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */

		for (int i=0; i<3; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		for (int i=0; i<3; i++) {//for가 여러개 있을때 for문을 다 돌고 다음 for문을 도나? 아님 
							     //for문 한번돌고 다음for문 돌고 이렇게 차례로 도나?? for문을 다 돌고 난 다음 for문을 돈다.
			
			for (int j=0; j<3-(i+1); j++) {
				System.out.print(" ");
			}
			
			for (int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
		System.out.println();
		
//		1.while{
//			2.while{
//				if() {
//					continue; continue는 2번while문으로 감.
//				}
//			}
//		}
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		
		for(int i=0; i<3; i++) {               
			for(int j=3; j>i; j--) {           
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		
		for(int i=0; i<3; i++) { 
			for(int j=3; j>3-i; j--)	System.out.print(" ");				
			for(int j=3; j>i; j--)		System.out.print("#");		
			System.out.println();
		}
		
		System.out.println();
		
		
		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		for(int i=0; i<3; i++) {               
			for(int j=0; j<=i ;j++) {           
				System.out.print("@");
			}
			for(int j=2; j>i; j--) {
				System.out.print("#");
			}
	
			System.out.println();
		}
		System.out.println();
		
		
		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		
		int k = 0;
		
		for (int i=0; i<3; i++) {
			
			for (int j=2; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k+=2;
		
		}
		System.out.println();
		
		
		
		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		
		k = 5;
		for (int i=0; i<3; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k -= 2;
		}
		
		
	}
}
