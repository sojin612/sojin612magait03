package step7_01.classArray;

class Member{
	
	String name;
	int num;
	
}


class MemberManager{

	Member[] memberList = new Member[3]; //다른 클래스안에서 객체배열생성??가능

}


public class ClassArrayEx06 {

	public static void main(String[] args) {

		MemberManager mg = new MemberManager();	
		Member m1 = new Member();
		mg.memberList[0] = m1;  //셋다 객체인가?? mg,m1는 객체, memberList는 객체배열
		m1.name = "김철수";
		m1.num = 1001;
		
		m1 = new Member(); //객체를 또 생성안하고 그냥 값을 덮어씌우면 그전의 값도 바뀌게 됨으로 다시 새로 생성해야됨 /잠깐생성하고 넣고 끝/다시 다른 객체생성할필요없음/m1값은 덮어씌워짐/
		mg.memberList[1] = m1;
		m1.name = "이만수";
		m1.num = 1002;
		
		m1 = new Member();
		mg.memberList[2] = m1;
		m1.name = "박영희";
		m1.num = 1003;
		
		for (int i = 0; i < mg.memberList.length; i++) {
			System.out.println("num : " + mg.memberList[i].num);
			System.out.println("name : " + mg.memberList[i].name);
			System.out.println();
		}
		
		Member temp = mg.memberList[1];
		System.out.println(temp.name);

	}

}
