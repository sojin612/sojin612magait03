package step4_01.string;


public class StringEx05_정답1 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 32세
		String age= jumin.substring(0,2);
		int age2= Integer.parseInt(age);
		int result= 2020-1900-age2+1;
		System.out.println(result);
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char ch = jumin.charAt(7);
		if(ch=='2'|| ch=='4') {
			System.out.println("여성입니다");
		}
		else if(ch=='1'|| ch=='3') {
			System.out.println("남성입니다");
		}
		
	}

}
