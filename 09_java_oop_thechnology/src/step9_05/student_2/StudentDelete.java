package step9_05.student_2;

public class StudentDelete {
	
	private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO stDAO) {
		this.studentDAO=stDAO;
	}
	
	public void delete(String id) {
		if(checkId(id)) {
			studentDAO.delete(id);
		}
		else {
			System.out.println("없는 아이디 입니다");
		}
	}
	
	public boolean checkId(String id) {
		StudentVO st=studentDAO.select(id);	
		return st==null? false:true;
	}
	
}
