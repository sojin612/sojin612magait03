package step7_01.classArray;
/*
 * [ 래퍼 클래스(wrapper class) ]
 * - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
 * [기본형]          [래퍼 클래스]
 * byte             Byte
 * short            Short
 * int              Integer
 * long             Long
 * float            Float
 * double           Double
 * char             Character
 * boolean          Boolean
 *
 *
 *
 *  [ java.util.ArrayList ]
 * - 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
 * - ArrayList 클래스는 데이터가 입력되면, 자동으로 크기가 커지고
 * - 데이터가 제거되면, 자동으로 크기가 작아진다.
 * - 중간에 데이터가 삽입되면, 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동되고
 * - 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 * - ArrayList 생성 방법
 * 
 *   ArrayList list = new ArrayList();                      // JDK 1.4 이전
 *   ArrayList<Integer> list = new ArrayList<Integer>();    // JDK 1.5 이후
 *   ArrayList<Integer> list = new ArrayList<>();           // JDK 1.7 이후 
 * 
 *  [ 제네릭 ]
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을
 *   반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는
 *   래퍼 클래스를 사용한다.
 * 
 * 
 */

import java.util.ArrayList;

public class ClassArrayEx19 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add(value) ArrayList의 맨뒤에 value를 추가한다.
		list.add(10);
		list.add(20);
		list.add(30);
		
		//add(index,value) : ArrayList의 index위치에 value를 추가한다.삽입기능
		list.add(0,7);
		list.add(2,12);
		
		//set(index,value) : ArrayList의 index위치에 value를 수정한다.
		list.set(3, 25);
		list.set(4, 35);
		
		//remove(index) : ArrayList의 index위치에 value를 삭제한다.
		list.remove(2);
		
		//size() : ArrayList에 저장된 데이터의 개수를 가져온다.
		//get() : ArrayList의 index번째의 value를 가져온다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/*
		 * 향상된 for문, for each 문
		 * (구조)
		 * for (자료형 변수명 : Array or ArrayList){
		 * 명령어;
		 * }
		 * -ArrayList의 element가 직접 변수에 저장된다.
		 * 
		 * 
		 */
	
		for(int element : list) {
			System.out.println(element);
		}
		
		//clear() : ArrayList의 모든 데이터를 제거한다.
		list.clear();
		
		//System.out.println(list.get(0)); //error
		
		
	}

}
