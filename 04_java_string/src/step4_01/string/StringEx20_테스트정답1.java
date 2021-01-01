package step4_01.string;


public class StringEx20_테스트정답1 {

	public static void main(String[] args) {
		
		
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		//정답 ccc
		
		//10:30~11:00
		int maxmum=0;
		int maxidx=0;
		int k=0;
		for (int i = 1; i < score.length; i++) {
			int[] total= new int[score.length];
			
			for (int j = 2; j < score.length; j++) {
				if(score[i][0].equals(score[j][0])) {
					int temp=Integer.parseInt(score[j][2]);
					total[i] += temp;
					k++;
				}
			}
			int temp2=Integer.parseInt(score[i][2]);
			total[i] += temp2;
			if(maxmum<total[i]) {
				maxmum=total[i];
				maxidx=i;
			}
			
		}
		for (int i = 0; i < student.length; i++) {
			if(score[maxidx][0].equals(student[i][2])) {
				System.out.println(student[i][0]);
			}
			
		}
		
		
	}

}
