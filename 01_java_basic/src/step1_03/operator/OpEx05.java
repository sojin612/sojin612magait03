package step1_03.operator;

/*
 * 논리 연산자
 * 
 * 1.종류
 * 
 *   &&(and): 양쪽 모두다 참이어야 최종적으로 참
 *  예)무주택 세대주 이어야하고 연봉이 2000미만이어야 함
 *  
 *   ||(or) : 어느한쪽이라도 참이면 최종적으로 참
 *   예) 무주택 세대주 이거나 연봉이 2000미만 이어야 함
 *   
 *   [중요] 논리 연산자의 결과도 참 또는 거짓이다
 * 
 */



public class OpEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10==10&& 3==3);
		System.out.println(10 !=10 && 3==3);
		System.out.println(10==10 && 3!=3);
		System.out.println(10!=10 && 3!=3);
		System.out.println();
		System.out.println(10==10 ||3==3);
		System.out.println(10!=10 ||3==3);
		System.out.println(10==10 ||3!=3);
		System.out.println(10!=10 ||3!=3);
		
	}

}
