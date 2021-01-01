package step9_01_oop_theory;
/*
 * 
 * HashpMap
 * 
 * -HashpMap 은 K(Key)에 V(Value)를 할당하는 방식으로 데이터가 저장되는 자료구조.
 * 
 * 
 */

import java.util.HashMap;

public class OOPEx11 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		//HashMap<String, Integer> hmap = new HashMap<>();  //new 뒤쪽의 generic은 생략가능.
		
		//put(key, value) : HashpMap의 key에 value를 할당한다.put()메서드는 존재하지 않는 key를 넣어주면 데이터가 추가입력되고 존재하는 key에 넣어주면 수정된다.
		hmap.put("data1", 1000);
		hmap.put("data2", 2000);
		hmap.put("data3", 3000);
		System.out.println(hmap);
		//size()          : HashpMap의 데이터의 개수를 반환한다.
		System.out.println(hmap.size());
		
		hmap.put("data1",1111); //기존의 key값의 value를 수정
		System.out.println(hmap);
		System.out.println("/////////////////////////////////////////////");
		
		//get(key)        : HashpMap의 key에 할당된 value를 얻어온다.
		System.out.println(hmap.get("data1"));
		System.out.println(hmap.get("data2"));
		System.out.println(hmap.get("data3"));
		System.out.println("/////////////////////////////////////////////");
		
		//keySet()        : HashpMap의 key만 얻어온다.
		System.out.println(hmap.keySet());  //키값이 출력
		
		for (String key : hmap.keySet()) {  //향샹된 포문은 무조건 처음부터 끝까지 출력됨//출력하고자 하는 변수명 key : 불러올 키
			System.out.println(hmap.get(key));//키에 해당되는 값이 출력
		}
		System.out.println("/////////////////////////////////////////////");
		//remove(key)     : HashpMap의 key에 해당되는 값을 제거한다.
		hmap.remove("data2");//문자열을 그대로 넣었기 때문에 ""를 씀
		hmap.remove("data3");
		System.out.println(hmap);
		System.out.println("/////////////////////////////////////////////");
		//clear()         : HashpMap의 모든 값을 제거한다.
		
		hmap.clear();
		System.out.println(hmap);
		
	}

}
