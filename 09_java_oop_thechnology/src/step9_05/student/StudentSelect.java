package step9_05.student;
/*
 * service : 데이터 변경 로직(코드짜는 곳)
 */
public class StudentSelect {
	
	private StudentDAO studentDAO;
	
	public StudentSelect(StudentDAO stDAO) {
		studentDAO = stDAO;
	}
	
	
	public StudentVO select(String id) {
		
		if (checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("정보가 없습니다.");
			return null;
		}
	}
	
	
	public boolean checkId(String id) {
		
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null? true:false; 
		
	}
}
