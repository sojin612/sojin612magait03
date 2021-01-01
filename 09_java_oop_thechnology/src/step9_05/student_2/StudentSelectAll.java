package step9_05.student_2;
/*
 * service : 데이터 변경 로직(코드짜는 곳)
 */
import java.util.Map;

public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	
	public StudentSelectAll(StudentDAO stDAO) {
		this.studentDAO=stDAO;
	}
	
	public void printAll(){
		Map<String, StudentVO> map = studentDAO.getStudentDB();
		for (String key : map.keySet()) {
			map.get(key).printOneInfo();
		}
			
		
	}
}
