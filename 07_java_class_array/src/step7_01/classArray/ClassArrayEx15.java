package step7_01.classArray;

import java.util.Scanner;

// # 생성자를 이용한 멤버 변수 초기화

class Fruit {
	
	String name;
	int price;
	
	Fruit (String name , int price) {
		this.name = name;
		this.price = price;
	}
	
	void printData() {
		System.out.println(this.name + "(" + this.price + ")");
	}
	
}

public class ClassArrayEx15 {

	public static void main(String[] args) {
		
		// Fruit f = new Fruit(); // 생성자에 매개변수가 2개가 있으므로 error
		Fruit f = new Fruit("사과",2000);
		f.printData();
		
		// Scanner scan = new Scanner(System.in);
		
	}

}
