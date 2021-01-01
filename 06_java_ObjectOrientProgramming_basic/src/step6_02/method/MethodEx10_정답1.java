package step6_02.method;


class Ex10{
	
	int test1(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				cnt++;
			}
		}
		return cnt;
	}
	int[] test2(int[] arr) { 
		int[] temp=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				temp[i]=arr[i];
			}
		}
		return temp; 
		}
}



public class MethodEx10_정답1 {

	public static void main(String[] args) {
		
		
			Ex10 e = new Ex10();
			
			int[] arr = {87, 12, 21, 56, 100};
			
			// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
			int cnt=e.test1(arr);
			System.out.println(cnt);
			
			// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
			int[] temp = e.test2(arr);
			System.out.println(temp);


	}

}
