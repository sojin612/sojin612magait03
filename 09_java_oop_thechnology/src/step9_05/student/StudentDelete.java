package step9_05.student;

public class StudentDelete {
	
	private StudentDAO studentDAO;
	
	
	public StudentDelete(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	public void delete(String id) {
		
		if (checkId(id)) {
			studentDAO.delete(id);
		}
		else {
			System.out.println("없는아이디 입니다");
		}
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? false:true; 
	}


	
}
