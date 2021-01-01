package step9_02.score;

import java.util.ArrayList;

//public class ScoreList2 {
//
//	private ArrayList<ScoreVO2> scoreList =new ArrayList<>();
//	
//	
//	public ArrayList<ScoreVO2> getScoreList() {
//		return scoreList;
//	}
//
//
//	public void setScoreList(ArrayList<ScoreVO2> scoreList) {
//		this.scoreList = scoreList;
//	}
//
//
//	@Override
//	public String toString() {
//		String str="";
//		str+="=========================================\n";
//		str+=" 번호   이름   java jsp spring  총점        평균     석차\n";
//		str+="=========================================\n";
//		for (int i = 0; i < scoreList.size()-1; i++) {
//			for (int j = i+1; j < scoreList.size(); j++) {
//				if(scoreList.get(i).getTotal()> scoreList.get(j).getTotal()) {
//					scoreList.get(j).setRank(scoreList.get(j).getRank()+1);
//				}
//				else if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
//					scoreList.get(i).setRank(scoreList.get(i).getRank()+1);
//				}
//			}
//		}
//		for (ScoreVO2 vo : scoreList) {
//			str+=vo+"\n";
//		}
//		return str;
//	}
//	
////	ArrayList에 인수로 넘겨받은 성적을 추가하는 메소드
//	public void addScore(ScoreVO2 vo){
//	scoreList.add(vo);
//	}
//}










