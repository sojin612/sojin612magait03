package step9_05.student_2;
/*
 * 
 * service : 데이터 변경 로직(코드짜는 곳)
 */
public class StudentInsert {
	
	private StudentDAO StudentDAO;
	
	public StudentInsert(StudentDAO stDAO) {
		this.StudentDAO=stDAO;
	}
	
	public void insert(StudentVO st) {
		String id=st.getId();
		if(checkId(id)) {
			StudentDAO.insert(st);
		}
		else {
			System.out.println("중복된 아이디입니다");
		}
	}


	public boolean checkId(String id) {
		StudentVO studentVO= StudentDAO.select(id);
		return studentVO == null? true:false;
	}
}
