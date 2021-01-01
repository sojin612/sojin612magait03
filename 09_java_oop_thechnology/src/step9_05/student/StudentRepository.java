package step9_05.student;
/*
 * 웹에서 DB부분을 담당 (데이터가 저장되는 장소)
 */
import java.util.HashMap;

public class StudentRepository { //HashMap<key값(ID),value값(id,num,name)
						
	private static HashMap<String, StudentVO> stDB = new HashMap<String , StudentVO>();

	public static HashMap<String, StudentVO> getStDB() {
		return stDB;
	}

	public static void setStDB(HashMap<String, StudentVO> stDB) {
		StudentRepository.stDB = stDB;
	}	
	
}
