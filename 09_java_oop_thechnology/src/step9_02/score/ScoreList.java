package step9_02.score;

import java.util.ArrayList;

public class ScoreList {

	private ArrayList<ScoreVO> scoreList = new ArrayList<>(); //왜 scoreVO타입이어야 하나?? scoreVO를 저장시키기위해서

	public ArrayList<ScoreVO> getScoreList() { 
		return scoreList;
	}
	
	public void setScoreList(ArrayList<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}
	
	@Override
	public String toString() {  //객체를 문자열형태로 반환한다.
		String str = "";
		str += "===============================================================\n";
		str += "  번호  이름  java  jsp  spring  총점  평균  석차  \n";
		str += "===============================================================\n";
		
		for (int i=0 ; i<scoreList.size()-1 ; i++) {
			for (int j=i+1 ; j<scoreList.size() ; j++) {
				if (scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
					scoreList.get(j).setRank(scoreList.get(j).getRank() + 1);
				}
				else if (scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
					scoreList.get(i).setRank(scoreList.get(i).getRank() + 1);
				}
			}
		}
		
		for (ScoreVO vo : scoreList) { //vo에 있는 tostring의 리턴값을 추가.
			str += vo + "\n";
		}
		
		str += "===============================================================\n";
		return str;  
	}
	
//		ArrayList에 인수로 넘겨받은 성적을 추가하는 메소드
	public void addScore(ScoreVO vo) { //이해안감 vo를 왜 또 add하지?? 앞에 vo는 보여주는 것 .처음에 메인에서 new값을 arrayList인 scoreList에 add함.
		scoreList.add(vo);				//public을 왜 써야하나?? public을 쓰면 다른 패키지에서도 쓸수가 있음.퍼블릭을 안쓰면 같은 패키지에서만 쓸 수 있음.
	}
	
}










