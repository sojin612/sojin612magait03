package step9_01_oop_theory;
/*
 * 인터페이스 (interface)
 * 
 * -인터페이스는 추상클래스보다 더 추상화된 클래스
 * -실제 구현된 것이 전혀 없는 기본 설계도(틀,뼈대)
 * -미리 정해진 규칙에 맞게 구현하도록 '표준'을 제시하는데 사용한다.
 * 
 * 
 */
abstract class AA { //추상클래스
	
	abstract void test1(); //추상메서드
	void test2() {}        //추상클래스는 일반메서드도 같이 사용가능하다.
}

interface BB {   //인터페이스
	
	abstract void test3(); 
	abstract void test4();
	//void test5(){} //인터페이스는 일반 메서드를 사용할 수 없다.
	
}

interface CC {   //인터페이스
	
	abstract void test5(); 
	abstract void test6();
	
	
}

class DD implements BB,CC {//인터페이스는 '구현한다'라고 표현한다. 인터페이스는 다중상속이 가능하다.(여러부모에게서 상속이 가능).인터페이스부모들은 한명의 자식에게 몰아서 상속을 줄 수 가 있다.

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	} 
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		

	}

}
