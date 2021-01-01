package step4_01.string;

//문제1) 위 데이터 는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
/*
  =====================
	10001 김철수 2670
	10002 이영희 1950
	10003 유재석 4080
	10004 박명수 7130
   =====================		  
 */


public class StringEx22_테스트정답2 {

	public static void main(String[] args) {
		
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";

		String[] temp=data.split("\n");
		String[] tempId= new String[temp.length];
		String[] finalId= new String[4];
		String[] tempName= new String[temp.length];
		String[] finalName= new String[4];
		String[] tempScore= new String[temp.length];
		String[] finalScore= new String[4];
		int[] tempScore2= new int[temp.length];
		int[] total = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			tempId[i]= temp[i].split("/")[0];
			tempName[i]= temp[i].split("/")[1];
			tempScore[i]= temp[i].split("/")[2];
			tempScore2[i]=Integer.parseInt(tempScore[i]);
		}
		int k=0;
		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total.length; j++) {
				if(tempId[i].equals(tempId[j])) {
					total[k]+=tempScore2[j];
				
				}
			}
			k++;
		}
		String[] score=new String[temp.length];
		for (int i = 0; i < score.length; i++) {
			
			score[i]=Integer.toString(total[i]);
		}
		int r=0;
		for (int i = 0; i < total.length; i++) {
			int idx=0;
			int cnt=0;
			for (int j = 0; j < i; j++) {
				if(!tempId[i].equals(tempId[j])) {
					cnt++;
				}
				idx=j;
			}
			if(cnt==idx+1) {
				finalId[r]=tempId[i];
				finalName[r]=tempName[i];
				finalScore[r]=score[i];
				r++;
			}
		}
		finalId[r]=tempId[0];
		finalName[r]=tempName[0];
		finalScore[r]=score[0];
		
		
		String userData="";
		for (int i = 0; i < finalId.length; i++) {
			userData+=finalId[i];
			userData+="/";
			userData+=finalName[i];
			userData+="/";
			userData+=finalScore[i];
			userData+="\n";
			
		}
		
		System.out.println(userData);
		
		
	}

}
