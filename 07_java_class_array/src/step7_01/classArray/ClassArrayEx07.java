package step7_01.classArray;

//# 클래스 배열 응용

class Subject{
	
	String name;
	int score;
	
}


class Student{
	
	Subject[] subjects;	// Subject 객체를 담을 클래스 배열
	String name;
	
}


public class ClassArrayEx07 {

	public static void main(String[] args) {

		Student[] st = new Student[3];
		
		st[0] = new Student(); //객체배열에 객체생성후 넣기
		st[0].subjects = new Subject[3]; //배열3개 생성
		
		for (int i = 0; i < 3; i++) {
			st[0].subjects[i] = new Subject(); //생성한 배열3개에 객체넣기
		}
		
		st[1] = new Student();
		st[1].subjects =new Subject[2]; //배열2개 생성
		st[1].subjects[0] = new Subject();//생성한 배열2개중 하나에 객체넣기
		st[1].subjects[1] = new Subject();
		
		st[2] = new Student();
		st[2].subjects = new Subject[1];
		st[2].subjects[0] = new Subject();

	}

}
