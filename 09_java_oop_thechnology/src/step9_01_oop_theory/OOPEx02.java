package step9_01_oop_theory;
/*
 * 
 * toString
 * 
 * -객체를 문자열 형태로 반환한다.
 * -해당클래스에 해당하는 객체에 대한 설명과 정보
 * 
 */

class Test1{
	
}

class Test2{
	public String toString() { //객체에 대한 설명
		return "객체에 대한 정보";
	}
}

class Test3{
	String name;
	int age;
	
	Test3(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override    //자동완성기능. tost정도 입력후 ctrl+space
	public String toString() {
		
		return "이름: "+this.name+"/나이: "+Integer.toString(age);
	}
}


public class OOPEx02 {

	public static void main(String[] args) {
		
		Test1 t1= new Test1();
		System.out.println(t1);    //객체의 주소가 화면에 출력된다.
		
		Test2 t2= new Test2();
		System.out.println(t2);
		
		Test3 t3= new Test3("데니스 리치",70);
		System.out.println(t3);
		
		Test3 t4= new Test3("제임스 고슬링",70);
		System.out.println(t4);
	}

}
