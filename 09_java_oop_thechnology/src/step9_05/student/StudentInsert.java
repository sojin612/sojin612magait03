package step9_05.student;
/*
 * 
 * service : 데이터 변경 로직(코드짜는 곳)
 */
public class StudentInsert {
	
	private StudentDAO studentDAO;//private는 외부에서만 getter setter가 필요함.내부에서 쓸때는 게터세터안써도 괜찮음.
	
	
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	
	public void insert(StudentVO studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) {
			studentDAO.insert(studentVO);
		}
		else {
			System.out.println("중복아이디 입니다");
		}
	}
	
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? true:false; //삼항연산자 ?가 참이면 true, true와 false를 반대로 쓸수있음.
	}
	
}
