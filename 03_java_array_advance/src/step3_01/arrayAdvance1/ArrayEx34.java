package step3_01.arrayAdvance1;
/*
 *
 * 2차원 배열
 * 
 */
public class ArrayEx34 {

	public static void main(String[] args) {
		
		
		int[][] arr= new int[3][3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("---------------------");
		int[] temp = arr[1];    //배열의 주소가 대입
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}

}
