package step2_01.array;

public class ArrayEx13_정답 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int cnt = 0;
		int cntInLoop = 0;
		for(int i=0; i<5; i++) {
			if ( arr[i] % 4 == 0 ) {
				cnt++;
			}
		}		
		temp = new int[cnt];
		
		
		for(int i=0; i<5; i++) {
			if ( arr[i] % 4 == 0 ) {
				temp[cntInLoop] = arr[i];
				cntInLoop++;
			}
		}
		

		for(int i=0; i<cnt; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
	}
	
}
