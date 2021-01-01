package step9_01_oop_theory;
/*
 * 
 *메서드 오버라이딩(method Overriding)
 *
 *-부모클래스로부터 상속받은 메서드를 재정의(overriding)하여 사용한다.
 *-부모클래스로부터 상속받은 메서드의 이름은 그대로 사용하지만, 명령어들을 바꾸어서 사용한다.
 *
 *-메서드 오버로딩(중복정의, overloading)과 혼용되기 쉽다.
 *-메서드 오버로딩은 인자를 한개, 두개, 여러개 만드는 것.
 *
 */

class Character2 {
	
	int level =1;
	int hp =1;
	int mana =1;
	int attack =1;
	
	void levelUp() {
		this.level++;
		this.hp +=5;
		this.mana +=5;
		this.attack +=5;
		showStatus();
	}
	
	void showStatus() {
		System.out.println("level: "+this.level);
		System.out.println("hp: "+this.hp);
		System.out.println("mana: "+this.mana);
		System.out.println("attack: "+this.attack);
		System.out.println();
		
	}
	
	
}

class Wizard2 extends Character{
	void levelUp() {  //메서드 오버라이딩
		this.level++;
		this.mana +=1000;
		this.attack +=100;
		this.hp +=30;
		showStatus();
	}
	void fireball() {  //wizard클래스만의 메서드 추가
		System.out.println("fireball");
	}
}
class Worrior2 extends Character{
	void levelUp() {  //메서드 오버라이딩
		this.level++;
		this.mana +=30;
		this.attack +=500;
		this.hp +=1000;
		showStatus();
	}
	void dash() {   //worrior클래스만의 메서드 추가(상속받은 메서드가 아니라 단독으로 쓸수있음)
		System.out.println("dash");
	}
	
}
public class OOPEx04 {

	public static void main(String[] args) {
	
		
		Character2 c1= new Character2();
		c1.showStatus();
		c1.levelUp();
		c1.levelUp();
		
		System.out.println("/////////////");
		Worrior2 war1 = new Worrior2();
		war1.showStatus();
		war1.levelUp();
		war1.levelUp();
		war1.dash();  //worrior만의 메서드
		
		System.out.println("/////////////");
		Wizard2 wiz1 = new Wizard2();
		wiz1.showStatus();
		wiz1.levelUp();
		wiz1.levelUp();
		wiz1.fireball();  //wizard만의 메서드
	}

}
