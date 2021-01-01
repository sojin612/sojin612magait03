package step1_02.variable;

/*
 * 
 * 변수의 생명주기(scope)
 * 
 * 
 */

public class VarEx05 {

	public static void main(String[] args) {
	

		int x =10;
		int z=0;
		if (true) {
			int y=20;
			System.out.println(x);
			System.out.println(y);
			z=30;
			System.out.println(z);
		}
		System.out.println(x);
		//System.out.println(y);//에러
		System.out.println(z);
	}

}
