package step9_01_oop_theory;
/*
 * 
 * 
 */
class Point{
	
	int x;
	int y;
	public void move() {}
	
}
//인터페이스는 정적(static)멤버 변수(상수)와 추상메서드로만 구성된 특별한 형태이다.
interface Draw {
	
	public static final double pi = 3.121592; //정적 멤버, 상수
	//인터페이스는 변수 선언시 앞의 내용을 생략하면 public static final을 컴파일러가 자동으로 붙여준다.
	int LIMIT = 100;
	public abstract void move1();  //추상메서드
	 //인터페이스는 변수 선언시 앞의 내용을 생략하면 public static final을 컴파일러가 자동으로 붙여준다.
	void erase();
	
}

interface Graphic{
	public abstract void resize();
	public abstract void rotate();
	
}
//클래스는 인터페이스를 상속받을 수 없다.
//class Test extends Graphic{} //에러발생

//인터페이스는 클래스를 상속받을 수 없다.
//interface Test extends Point{}//에러발생

//클래스는 클래스끼리, 인터페이스는 인터페이스끼리 상속시킬 수 있다.
//클래스는 다중 상속을 허용하지 않지만, 인터페이스틑 다중상속을 허용한다.
//interface Test extends Graphic,Draw{}

//클래스 상속과 인터페이스를 동시에 구현한 예시
class Line extends Point implements Graphic,Draw{ //상속받아서 기능을 구현하는거와는 다름. 기능은 쓸수없고 틀만 구현할 수 있음.

	@Override
	public void move1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
	
}


public class OOPEx08 {

	public static void main(String[] args) {
	
		
		
		
		

	}

}
