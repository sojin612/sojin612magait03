package step7_01.classArray;

// 문자열(1단계)[문제]


class StudentList{

	String name;
	int score;
	
	void print() {
		System.out.println(this.name + " : " + this.score);
	}
	
}



public class ClassArrayEx11_정답1 {

	public static void main(String[] args) {
		
		String data = "3\n"; 				// studentList의 크기
		data +="김영희/30\n";				// 이름/성적
		data += "이만수/40\n";
		data += "이철민/60";
		
		//문제) data에 있는 내용을 잘라서 StudentList에 저장후 출력 하시오.
		StudentList[] sl=new StudentList[3];
		
		for (int i = 0; i < sl.length; i++) {
			sl[i]=new StudentList();
		}
		String[] temp=data.split("\n");
		sl[0].name=temp[1].split("/")[0];
		sl[0].score=Integer.parseInt(temp[1].split("/")[1]); //넘침
		
		sl[1].name=temp[2].split("/")[0];
		sl[1].score=Integer.parseInt(temp[2].split("/")[1]);
		
		sl[2].name=temp[3].split("/")[0];
		sl[2].score=Integer.parseInt(temp[3].split("/")[1]);
		
		for (int i = 0; i < 3; i++) {
			sl[i].print();
		}
	}

}
