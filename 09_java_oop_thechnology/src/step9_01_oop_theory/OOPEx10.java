package step9_01_oop_theory;

import java.util.Scanner;

/*
 * 
 * 다형성 (polymorphism)
 * 
 * 
 */


abstract class PolyShape{
	
	public abstract void draw();
	
	
}

class PolyPoint extends PolyShape{

	@Override
	public void draw() {
		System.out.println("점을 그린다");
		
	}
	
}

class PolyLine extends PolyShape{

	@Override
	public void draw() {
		System.out.println("선을 그린다");
		
	}
	
}

class PolyCircle extends PolyShape{

	@Override
	public void draw() {
		System.out.println("원을 그린다");
		
	}
	
}

class PolyRect extends PolyShape{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
		
	}
	
}

class PolyTriangle extends PolyShape{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
		
	}
	
}




public class OOPEx10 {

	public static void main(String[] args) {

		
		PolyShape[] shapes = {new PolyPoint(), new PolyLine(), new PolyCircle(), new PolyRect(), new PolyTriangle() };
		//자식클래스를 부모클래스에 담는것은 형변환과 같다. 다만 배열을 담은 것일뿐.
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 작업을 선택하세요");
		int selectMenu= scan.nextInt();
		
		shapes[selectMenu].draw();
		
		scan.close();

	}

}
