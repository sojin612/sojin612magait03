package step9_05.student;
/*
 * 
 * DAO (Data Access Object) : DB로부터 데이터를 input output하는 객체
 */
import java.util.Map;

public class StudentDAO { 
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st); //st.getId()??id  st는 vo전체(id,num,name)
	}
	public void delete(String id) {
		StudentRepository.getStDB().remove(id);//String으로 문자열을 받고 변수에 저장했기 때문에 ""를 쓰지 않음.
	}
	public void update(StudentVO studentVO) {
		StudentRepository.getStDB().put(studentVO.getId(), studentVO);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id); //getStDB().get(id)??id에 해당되는 value
	}
	
	public Map<String , StudentVO> getStudentDB(){ //Map<String , StudentVO>은 선언이아니라 타입임.
		return StudentRepository.getStDB();
	}

}
