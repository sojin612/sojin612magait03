package step7_01.classArray;

import java.util.ArrayList;

class Tv {
	
	String name;
	String brand;
	int price;

	Tv (String name, String brand, int price) { //Tv는 생성자(메서드)
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
}

class TvList {
	
	Tv[] arr; //Tv란 클래스의 객체배열
	int elementCount;

	
	void add(Tv e) {
		if(elementCount==0) {
			arr=new Tv[elementCount+1];
		}
		else if(elementCount>0) {
			Tv[] temp=arr;
			arr=new Tv[elementCount+1];
			for (int i = 0; i < temp.length; i++) {
				arr[i]=temp[i];
			}
			temp=null;
			arr[elementCount]=e;
		}
		elementCount++;
	}
	int size() {
	 return elementCount;
	}

	void remove(int index) {
		if(elementCount==1) {
			arr=null;
			elementCount=0;
		}
		else if(elementCount>1) {
			Tv[] temp=arr;
			arr=new Tv[elementCount-1];
			int j=0;
			for (int i = 0; i < temp.length; i++) {
				if(i!=index) {
					arr[j]=temp[i];
					j++;
				}
			}
			
			temp=null;
		}
		elementCount--;
	}

	Tv get(int index) { //getter란 역할을 하는 메서드/index의 값을 메인에서 받아서 꺼내서 메인으로 보낸다.
		return arr[index];
	}

}


public class ClassArrayEx21_정답1 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv> list = new ArrayList<>(); //tv란 클래스타입의 arraylist

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
		temp = new Tv("TV", "삼성", 1000); //temp에 안넣고 바로 myList에 넣을 수 있나??넣을 수 있음.근데 왜 temp에 넣은이유는?tv.name은 클래스tv것이 아니라 tv의 객체의 것임으로 temp란 tv.객체에 넣는 것임
		myList.add(temp);

		temp = new Tv("시그니처TV", "엘지", 2000);
		myList.add(temp);

		temp = new Tv("스마트TV", "애플", 3000);
		myList.add(temp);

		temp = myList.get(1);
		System.out.println(temp.name);

	}

}
