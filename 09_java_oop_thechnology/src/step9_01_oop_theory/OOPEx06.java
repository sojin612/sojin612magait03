package step9_01_oop_theory;
/*
 * 
 * 추상화(틀,뼈대)
 * 
 * 
 * 
 */
//일반 클래스

class Parent1{
	
	void test() {}
}

//일반 클래스를 상속받은 일반 클래스
class Child1 extends Parent1{
	
}

//추상 클래스
abstract class Parent2{ //1) abstract 키워드를 클래스 앞에 붙여준다.
	
	abstract void test1();  //2)추상메서드 : abstract를 메서드 앞에 붙여준다. 추상클래스는 선언만하고 실질적인 구현은 추상클래스를 상속받은 자녀클래스에서 진행한다.
	abstract void test2();  //3)메서드 뒤에 {}가 아닌 ;을 붙인다.
	abstract void test3();
	abstract void test4();
	abstract void test5();
	
	void test90() {} //일반 메서드(상속은 되나 구현해도되고 안해도 된다)
	void test91() {}
	int nVar;        //일반 변수
	
}

//추상클래스를 상속받은 일반 클래스
class Child2 extends Parent2{

	@Override
	void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test5() {
		// TODO Auto-generated method stub
		
	}
	
	
}




public class OOPEx06 {

	public static void main(String[] args) {
		
		new Parent1();
		new Child1();
		new Child2();
		//new Parent2(); //추상클래스는 객체를 생성할 수 없다.
		

	}

}
