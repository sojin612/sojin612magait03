package step1_03.operator;

public class OpEx02_정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(1000 - 200);
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println(100*12-(100*0.1*12));
		System.out.println("연봉은="+(100*12-(100*0.1*12))+"원");
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		System.out.println((30+50+4)/3);
		System.out.println("연봉은="+(30+50+4)/3+"원");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println(3*6/2);
		System.out.println("넓이는="+(3*6/2)+"cm");
		
		//문제4) 100초를 1분 40초로 출력
		System.out.println("100초는="+(100/60)+"분"+(100%60)+"초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		//정답5) 500원(1개), 100원(3개)
		System.out.println("800원은"+"500원짜리가"+(800/500)+"개"+","+"100원짜리가"+((800-500)/100)+"개");
		System.out.println("800원은"+"500원짜리가"+(800/500)+"개"+","+"100원짜리가"+((800%500)/100)+"개");
	
	}

}
