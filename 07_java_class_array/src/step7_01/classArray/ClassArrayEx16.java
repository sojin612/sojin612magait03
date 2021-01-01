package step7_01.classArray;
/*
 * 생성자 오버로딩
 * 
 * -생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 * -생성자 오버로딩을 구현하기 위해서는 일반 메서드와 마찬가지로 파라메타의 개수나 타입을 다르게 정의하면 된다.
 * 
 * 
 */
class Fruit2{
	
	String name;
	int price;
	
	Fruit2(){
		this.name ="과일"; //this를 안쓰면 다른 지역변수나 매개변수와 헤깔릴 수가 있기 때문에 꼭 써줘야 함.this name= f1.name
		this.price=0;	
		//this("과일",0);
	}
	//생성자 오버로딩
	Fruit2(String name){
		this(name,0); //다른 생성자(매개변수 2개)호출
	}
	
	Fruit2(String name, int price){
		this.name =name;
		this.price = price;
	}
	
	void printData() {
		System.out.println(this.name+"("+this.price+")");
	}
}


public class ClassArrayEx16 {

	public static void main(String[] args) {
		
		Fruit2 f1= new Fruit2();
		f1.printData();
		
		Fruit2 f2= new Fruit2("사과");
		f2.printData();
		
		Fruit2 f3= new Fruit2("사과",2000);
		f3.printData();
		
	}

}
