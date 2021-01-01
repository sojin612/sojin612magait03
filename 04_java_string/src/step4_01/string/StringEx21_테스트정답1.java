package step4_01.string;


//문제) moneyData 와 nameData 를 조합해서 userData를 아래와같이 만들어보세요

/*
* 100001/이만수/600
* 100003/유재석/7000
* 100001/이만수/100
* 100002/이영희/400
* 100001/이만수/600
* 100004/박명수/900
* 100001/이만수/130
* 100003/유재석/200
* 100002/이영희/700
* 100002/이영희/900
* 100004/박명수/800
*/

//11:30~ 

public class StringEx21_테스트정답1 {

	public static void main(String[] args) {
		
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
//12:10~12:40 4:30~5:00
//nameData moneyData를 먼저 split 하고 id와 같은지 검사해서 같으면 id 이름 돈 이어붙이기
	
		
		String userData = "";
		
		String[] temp=nameData.split("\n");
		String[] temp2=new String[temp.length*2];
		String[] temp3=moneyData.split("\n");
		String[] temp4=new String[temp3.length*2];
		
		int k = 0;
		for (int i = 0; i < temp.length; i++) {
			temp2[k++] = temp[i].split("/")[0];
			temp2[k++] = temp[i].split("/")[1];
		}
		int p=0;
		for (int j = 0; j < temp3.length; j++) {
			temp4[p++]=temp3[j].split("/")[0];
			temp4[p++]=temp3[j].split("/")[1];
			
		}
				
		for (int i = 0; i < temp4.length ; i++) {
			for (int j = 0; j < temp2.length; j++) {
				if(temp4[i].compareTo(temp2[j])==0) {
					userData+=temp4[i];
					userData+="/";
					userData+=temp2[j+1];
					userData+="/";
					userData+=temp4[i+1];
					userData+="\n";
				}
			}
		}
	
		
		System.out.println(userData);
		

	}

}
