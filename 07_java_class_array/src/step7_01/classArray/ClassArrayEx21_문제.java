package step7_01.classArray;

import java.util.ArrayList;

//class Tv {
//	
//	String name;
//	String brand;
//	int price;
//
//	Tv (String name, String brand, int price) { //Tv는 생성자(메서드)
//		this.name = name;
//		this.brand = brand;
//		this.price = price;
//	}
//	
//}
//
//class TvList {
//	
//	Tv[] arr; //Tv란 클래스의 객체배열
//	int elementCount;
//
//	
//	void add(Tv e) {
//		if (elementCount == 0) {
//			arr = new Tv[elementCount + 1];
//		} 
//		else if (elementCount > 0) {
//			Tv[] temp = arr; //왜 Tv[] temp에 담아야 하나?? 그냥 String타입의 그냥temp란 변수에 담으면 안되나?? arr는 Tv의 배열타입임으로 temp또한 Tv의 배열타입이어야 함.
//
//			arr = new Tv[elementCount + 1];
//			for (int i = 0; i < elementCount; i++) {
//				arr[i] = temp[i];
//			}
//		}
//		arr[elementCount] = e;
//		elementCount += 1;
//	}
//
//	int size() {
//		return elementCount;
//	}
//
//	void remove(int index) {
//		if (elementCount == 1) {
//			arr = null;
//			elementCount = 0;
//		} 
//		else if (elementCount > 1) {
//			Tv[] temp = arr;
//
//			arr = new Tv[elementCount - 1];
//			int j = 0;
//			for (int i = 0; i < elementCount; i++) {
//				if (i != index) {
//					arr[j] = temp[i];
//					j += 1;
//				}
//			}
//		}
//		elementCount--;
//	}
//
//	Tv get(int index) { //getter란 역할을 하는 메서드/index의 값을 메인에서 받아서 꺼내서 메인으로 보낸다.
//		return arr[index];
//	}
//
//}


public class ClassArrayEx21_문제 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv> list = new ArrayList<>();

		Tv temp = new Tv("TV", "삼성", 1000);
		list.add(temp);

		temp = new Tv("시그니처TV", "엘지", 2000);
		list.add(temp);

		temp = new Tv("스마트TV", "애플", 3000);
		list.add(temp);

		temp = list.get(1);
		System.out.println(temp.name);

		// --------------------------------------------

		// 직접 구현한 ArrayList 사용
		TvList myList = new TvList();
		temp = new Tv("TV", "삼성", 1000);
		myList.add(temp);

		temp = new Tv("시그니처TV", "엘지", 2000);
		myList.add(temp);

		temp = new Tv("스마트TV", "애플", 3000);
		myList.add(temp);

		temp = myList.get(1);
		System.out.println(temp.name);

	}

}
