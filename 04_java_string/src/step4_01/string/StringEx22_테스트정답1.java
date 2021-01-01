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


public class StringEx22_테스트정답1 {

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
//9:00~9:40, 3:00~6:00, 
//data를 split하고 id를 검사해서 같은 것의 점수를 합해서 이어붙이기
		String[] temp=data.split("\n");
		String[] tempId=new String[temp.length];
		String[] tempName=new String[temp.length];
		String[] tempScore = new String[temp.length];
		
		int k=0;
		int l=0;
		int m=0;
		int n=0;
		int[] total= new int[temp.length];
		int[] score= new int[temp.length];
		String[] finalScore= new String[total.length];
		String[] finalId= new String[4];
		String[] finalName=new String[4];
		String[] final2Score=new String[4];
		
		String userData="";
		for (int i = 0; i < temp.length; i++) {
			
//			String[] temp2 = temp[i].split("/");
//			tempId[k++] = temp2[0];
//			tempName[p++] = temp2[1];
//			tempScore[q++] = temp2[3];
			
			tempId[k++]=temp[i].split("/")[0];
			tempName[l++]=temp[i].split("/")[1];
			tempScore[m]=temp[i].split("/")[2];
			score[i]=Integer.parseInt(tempScore[m]); //왜 에러가? m++이 되서 m이 null임으로
			m++;
		}
		
		for (int i = 0; i < tempId.length; i++) {
			for (int j = 0; j < tempId.length; j++) {
				if(tempId[i].equals(tempId[j])) {
					total[i]=total[i]+score[j];
				
					
				}
			}
		
		}
			
		for (int i = 0; i < total.length; i++) {
			finalScore[i]= Integer.toString(total[i]);	
		}
		int q=0;
		int r=0;
		for (int i = 0; i < tempId.length; i++) {
			int cnt=0;
			int idx=0;
			for (int j = 0; j < i; j++) {
				if(!tempId[i].equals(tempId[j])){ //같은게 한번이라도 전에 나왔으면 i는 안넣음
					cnt++;
				}
				idx=j;
			}
			if(cnt==0) {
				finalId[r]=tempId[0];
				finalName[r]=tempName[0];
				final2Score[r]=finalScore[0];
			}
			if(cnt==idx+1) {
				r++;
				finalId[r]=tempId[i];
				finalName[r]=tempName[i];
				final2Score[r]=finalScore[i];
				
			}
		
		}
		
		
		for (int i = 0; i < finalId.length; i++) {
			userData+=finalId[i];
			userData+="/";
			userData+=finalName[i];
			userData+="/";
			userData+=final2Score[i];
			userData+="\n";
		}
		
		
		// [10001,10002,10003,10004]
		System.out.println(userData);
		
		
	}

}
