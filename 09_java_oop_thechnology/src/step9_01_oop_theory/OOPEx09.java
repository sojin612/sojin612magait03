package step9_01_oop_theory;
/*
 * 클래스의 형변환
 * 
 */


//부모 클래스
class Base{
	
	
	
	
}

//자녀 클래스
class Sub extends Base{
	
	
}









public class OOPEx09 {

	public static void main(String[] args) {
	

		Base base = new Base();
		Sub sub = new Sub();
		/*
		 * 1)base변수는 new할때 base에 있는 내용만 생성된다.
		 * 2)반면 sub변수는 new할때 base와 sub의 내용이 둘다 생성된다.
		 * 3)결국 sub는 base형태로 형변환이 가능하고
		 * 4)base는 sub형태로 형변환이 불가능하다.
		 * 
		 */
		
		Base test1 = sub;
		//Sub test2= base; //에러
		
		//instanceof : 형변환이 가능한지 확인하는 메서드
		if(sub instanceof Base) {
			System.out.println("형변환 가능1");
		}
		else {
			System.out.println("형변환 불가능1");
		}
		
		
		if( base instanceof Sub) {
			System.out.println("형변환 가능1");
		}
		else {
			System.out.println("형변환 불가능1");
		}
		
		
	}

}
