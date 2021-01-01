package step9_02.score;

//public class ScoreVO2 {
//
//	public static int count;	// 객체가 생성될 때 마다 자동으로 1씩 증가시킬 변수
//	private int no;				// 번호, 자동증가
//	private String name;		// 이름
//	private int java;			// java 점수
//	private int jsp;			// jsp 점수
//	private int spring;			// spring 점수
//	private int total;			// 총점
//	private double average;		// 평균
//	private int rank = 1;		// 석차, 석차를 계산할 기억 장소의 초기치는 무조건 1로 한다.
//	
//	public ScoreVO2() {}
//	public ScoreVO2(String name, int java, int jsp, int spring) {
//		this.no=count++;
//		this.name=name;
//		this.java= java;
//		this.jsp= jsp;
//		this.spring= spring;
//		this.total=java+jsp+spring;
//		this.average=(double)total/3;
//	}
//	
//	public int getNo() {
//		return no;
//	}
//	public void setNo(int no) {
//		this.no = no;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getJava() {
//		return java;
//	}
//	public void setJava(int java) {
//		this.java = java;
//	}
//	public int getJsp() {
//		return jsp;
//	}
//	public void setJsp(int jsp) {
//		this.jsp = jsp;
//	}
//	public int getSpring() {
//		return spring;
//	}
//	public void setSpring(int spring) {
//		this.spring = spring;
//	}
//	public int getTotal() {
//		return total;
//	}
//	public void setTotal(int total) {
//		this.total = total;
//	}
//	public double getAverage() {
//		return average;
//	}
//	public void setAverage(double average) {
//		this.average = average;
//	}
//	public int getRank() {
//		return rank;
//	}
//	public void setRank(int rank) {
//		this.rank = rank;
//	}
//	@Override
//	public String toString() { // 어디로 리턴??
//		return String.format("  %d, %s,%3d, %3d, %3d, %3d, %6.2f, %d",no,name,java,jsp,spring,total,average,rank );
//	}
//}
//출력 서식의 지시자를 제외한 나머지는 생략 가능하다. 예) %d 식으로 사용 가능.
//n : 출력할 전체 자리수 지정(오른쪽 정렬).  예) %3d, 전체자리수가 3인 정수
//0 : 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 출력.  예) %03d
//- : 전체 자리수가 지정된 경우 왼쪽 정렬하고 빈칸에 공백 출력.
//.m : 소수점 아래 자리수 지정. 잘리는 소수점 자리수는 반올림 시켜서 표시.  예)3.2f
//%6.2f에서 %는 "%뒤에 나오는 부분이 어떻게 숫자를 format할것인지 말해주는것이오"라고 말해주는 일종의 표시이다.






