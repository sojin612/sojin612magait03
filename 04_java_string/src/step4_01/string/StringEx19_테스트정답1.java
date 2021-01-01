package step4_01.string;

public class StringEx19_테스트정답1 {

	public static void main(String[] args) {
		
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"}, //150
				{"1002" ,"10" ,"60" , "60"}, //130
				{"1003" ,"23" ,"63" , "31"},  //117
				{"1004" ,"45" ,"30" , "35"},  //110
		};

		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		//정답 aaa
		
		//10:10~10:30
		int maxmum=0;
		int maxidx=0;
		for (int i = 0; i < score.length; i++) {
			int[] total= new int[4];
			for (int j = 1; j < score[i].length; j++) {
				int scores=Integer.parseInt(score[i][j]);
				total[i]=total[i]+scores;	
			}
			if(maxmum<total[i]) {
				maxmum=total[i];
				maxidx=i;
			}
		}
		for (int i = 0; i < score.length; i++) {
			if(score[maxidx][0].equals(student[i][2])) {
				System.out.println(student[i][0]);
			}
			
		}
	
		
		
	}

}
