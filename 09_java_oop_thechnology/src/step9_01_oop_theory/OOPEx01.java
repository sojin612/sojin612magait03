package step9_01_oop_theory;
/*
 * 
 * 싱글턴 패턴
 * 
 *-객체를 딱 1번만 생성하고 싶을 때 사용하는 기법
 * 
 * 
 */

class MySingleTon {
	
	//1) private 기본생성자를 만든다
	private MySingleTon() {}
	//2) 내부에서 자기자신을 static으로 인스턴스를 생성한다.
	private static MySingleTon instance = new MySingleTon();  //instance 가 뭐지?? 객체,object
	
	//3)자기자신을 반환할 getter를 만들어준다.
	public static MySingleTon getInstance() {
		return instance;
	}
	//테스트할 용도의 멤버 변수
	int nVar1; 
	int nVar2;
	int nVar3;
	//테스트할 용도의 메서드
	void method1() {}
	void method2() {}
	void method3() {}
	
	
}



public class OOPEx01 {

	public static void main(String[] args) {
	
		
		//MySingleTon test = new MySingleTon(); //에러가 난다.
		MySingleTon.getInstance(); //싱글턴 사용법
		System.out.println(MySingleTon.getInstance().nVar1);
		System.out.println(MySingleTon.getInstance().nVar2);
		System.out.println(MySingleTon.getInstance().nVar3);
		
		MySingleTon.getInstance().method1();
		MySingleTon.getInstance().method2();
		MySingleTon.getInstance().method3();
		
		///////////생각해볼 부분/////////////
		MySingleTon temp= MySingleTon.getInstance();
		System.out.println(temp);                  //참조 주소가 같다.
		System.out.println(MySingleTon.getInstance());  //참조 주소가 같다.
		
		System.out.println(temp.nVar1);
		System.out.println(temp.nVar2);
		System.out.println(temp.nVar3);
		
		temp.method1();
		temp.method2();
		temp.method3();
	}

}
