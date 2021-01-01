package step3_01.arrayAdvance1;
/*
 
 	중복 안된 숫자 제거
 	
	int[] test1= {1,2,3,2,1};		
	int[] test2= {1,3,4,4,2};
	int[] test3= {1,1,1,2,1};
	// 위 배열에서 중복안된숫자를 제거하시요 
	// 1) {1,2,1,2}
	// 2) {4,4}
	// 3) {1,1,1,1}
	 
 */

import java.util.Arrays;

public class ArrayEx39_정답2 {

	public static void main(String[] args) {
		
		int[] test1 =  {1,2,3,2,1};
		int[] test2= {1,3,4,4,2};
		int[] test3= {1,1,1,2,1};
		int[] result = new int[5];
		
		int count=0;
		for (int i = 0; i < result.length; i++) {
			int check=-1;
			for (int j = 0; j < result.length; j++) {
				if(test3[i]==test3[j] && i!=j) {
					check=1;
				}
			}
			if(check==1) {
				result[count]=test3[i];
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(result[i]+" ");
			
		}
	}

}
