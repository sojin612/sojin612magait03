package step6_02.method;


class Ex08 {
	
	void printSum(int[] arr) {
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total=total+arr[i];
		}
		System.out.println("합은"+total);
	}
	void printSumMultiple4(int[] arr) {
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				total=total+arr[i];
			}
		}
		System.out.println("4의배수의 합은"+total);
		
	}
	void printCountMultiple4(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				count++;
			}
		}
		System.out.println("4의배수의 개수는"+count);
	}
}


public class MethodEx08_정답1 {

	public static void main(String[] args) {
		
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		Ex08 e1=new Ex08();
		e1.printSum(arr);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		e1.printSumMultiple4(arr);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		e1.printCountMultiple4(arr);
	}

}
