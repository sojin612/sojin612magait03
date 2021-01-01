package step9_05.student;

public class StudentUpdate {

	private StudentDAO studentDAO;
	
	public StudentUpdate(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	public void update(StudentVO studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) {
			studentDAO.update(studentVO);
		}
		else {
			System.out.println("없는 아이디 입니다");
		}
	}
	
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? false:true; //삼항연산자 ?가 참이면 true, true와 false를 반대로 쓸수있음.
	}
	
	
}
