package step9_05.student_2;

public class StudentUpdate {

	private StudentDAO studentDAO;
	
	public StudentUpdate(StudentDAO stDAO) {
		this.studentDAO=stDAO;
	}
	public void update(StudentVO st) {
		String id=st.getId();
		if(checkId(id)) {
			studentDAO.update(st);
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
