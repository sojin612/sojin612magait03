package step7_01.classArray;

//# ArrayList 클래스의 기능을 직접 구현해보자!

class MyList {

	int[] arr;
	int elementCnt;

	void print() {
		for (int i = 0; i < elementCnt; i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

	 
	void add(int value) { //값 추가
		if(elementCnt==0) {
			arr= new int[elementCnt+1];
		}
		else if(elementCnt>0) {
			int[] temp=arr;
			arr= new int[elementCnt+1];
			for (int i = 0; i < temp.length; i++) {
				arr[i]=temp[i];
			}
		}
		arr[elementCnt]=value;
		elementCnt++;

		
	}

	
	void add(int index, int value) { //삽입
		if(elementCnt==0) {
			arr=new int[elementCnt+1];
		}
		else if(elementCnt>0) {
			int[] temp=arr;
			arr=new int[elementCnt+1];
			int j=0;
			for (int i = 0; i < temp.length; i++) {
				if(i!=index) {
					arr[i]=temp[j];
					j++;
				}
			}
			temp=null;
			arr[index]=value;
		}
		elementCnt++;
	}

	
	void remove(int index) {
		if(elementCnt==1) {
			arr=null;
			elementCnt=0;
		}
		else if(elementCnt>1) {
			int[] temp=arr;
			arr=new int[elementCnt-1];
			int j=0;
			for (int i = 0; i < temp.length; i++) {
				if(i!=index) {
					arr[j]=temp[i];
					j++;
				}
			}
			temp=null;
			elementCnt--;
		}
		
	}

	
	int size() {
		return elementCnt;
		
	}

	
	int get(int index) { //getter란 역할을 하는 메서드 (정확히 getter는 아님)
		
		return arr[index];
		
	}

	
	void set(int index, int value) {
		arr[index]=value;
	}

	
	void clear() {
		arr=null;
		elementCnt=0;	
	}

}


public class ClassArrayEx20_정답1 {

	public static void main(String[] args) {

		// 직접 구현한 ArrayList
		MyList list = new MyList();

		// 추가하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// 삽입하기
		list.add(0, 9);
		// 출력하기
		list.print();

		// (index로)삭제하기
		list.remove(3);
		list.print();

		// 길이 구하기
		int elementCnt = list.size();
		System.out.println("elementCnt = " + elementCnt);

		// (index로)값 꺼내오기
		System.out.print("[");
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(list.get(i));
			if (i != elementCnt - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// 특정 위치의 값 수정하기
		list.set(3, 5);
		list.print();

		// 모든 데이터를 제거하기
		list.clear();
		System.out.println(list.size());

	}

}
