package step4_01.string;


public class StringEx20_테스트정답2 {

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
		
		int[][] temp=new int[score.length][student.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				temp[i][j]=Integer.parseInt(score[i][j]);//안됨
			}
		}
		int[] total=new int[score.length];
		int maxmum=0;
		int maxidx=0;
		for (int i = 0;  i< temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if(temp[i][0]==temp[j][0]) {
					total[i]=total[i]+temp[j][2];
				}
			}
			total[i]+=temp[i][2];
			if(maxmum<total[i]) {
				maxmum=total[i];
				maxidx=i;
			}
		}
		for (int i = 0; i < total.length; i++) {
			if(score[maxidx][0].equals(student[i][0])) {
				System.out.println(student[i][0]);
			}
		}
		
		
		
	}

}
