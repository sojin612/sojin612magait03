package step4_01.string;

public class StringEx19_테스트정답2 {

	public static void main(String[] args) {
		
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};

		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		//정답 aaa
		
		//score의 총합을 구하면서 maxmum을 구하고 1등학생의 이름 출력
		int[] total=new int[score.length];
		int maxmum=0;
		int idx=0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 1; j < score.length; j++) {
				int temp=Integer.parseInt(score[i][j]);
				total[i]+=temp;
			}
			if(maxmum<total[i]) {
				maxmum=total[i];
				idx=i;
			}
		}
		for (int i = 0; i < total.length; i++) {
			if(score[idx][0].equals(student[i][2])) {
				System.out.println(student[i][0]);
			}
			
		}
		
		
	}

}
