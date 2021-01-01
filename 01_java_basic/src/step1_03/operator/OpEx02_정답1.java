package step1_03.operator;

public class OpEx02_정답1 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println(100*12*0.9);
		
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int total= (30+50+4)/3;
		System.out.println(total);		
		
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int width = 3*6/2;
		System.out.println(width);
		
		
		//문제4) 100초를 1분 40초로 출력
		System.out.println(100/60+"분"+100%60+"초");
		
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		//정답5) 500원(1개), 100원(3개)
		System.out.println("500원의 갯수는="+800/500+" "+"100원의 갯수는="+800%500/100);
		System.out.println("800원은"+"500원짜리가"+(800/500)+"개"+","+"100원짜리가"+((800-500)/100)+"개");
		
	
	}

}
