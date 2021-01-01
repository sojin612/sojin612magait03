package step9_05.student_2;
/*
 * service : 데이터 변경 로직(코드짜는 곳)
 */
public class StudentSelect {
	private StudentDAO studentDAO;
	
	public StudentSelect (StudentDAO stDAO) {
		this.studentDAO=stDAO;
	}
	public StudentVO select(String id) {
		if(checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("없는 아이디 입니다");
		}
	return null;
	}
	
	
	public boolean checkId(String id) {
		StudentVO st= studentDAO.select(id);
		return st!=null? true:false;
	}
	
}
