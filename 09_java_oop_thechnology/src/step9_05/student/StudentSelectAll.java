package step9_05.student;
/*
 * service : 데이터 변경 로직(코드짜는 곳)
 */
import java.util.Map;

public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	
	public StudentSelectAll(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Map<String , StudentVO> allSelect(){ 
		return studentDAO.getStudentDB();
	}
	
	
	public void printAll() {
//		int
//		Map<String , StudentVO> 
//		int abc
//		Map<String , StudentVO> obj; 선언
//		int abc = 100;
//		Map<String , StudentVO> obj = studentDAO.getStudentDB(); 선언과 값대입 /new를 하고 값을 대입해도 됨.
		
		Map<String , StudentVO> map = studentDAO.getStudentDB(); //hashmap을 상속받은것, hashmap과 똑같다고 생각하면됨.
		//getstDB를 map에 저장. Map과 hashmap은 같은것임.
		for (String key : map.keySet()) {
			map.get(key).printOneInfo();
		}
		
	}
	
}
