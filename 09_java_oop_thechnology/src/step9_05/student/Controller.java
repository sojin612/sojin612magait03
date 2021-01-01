package step9_05.student;
/*
 * controller : 페이지 이동 기능
 * 
 */
public class Controller { //여기엔 왜getter setter를 만들었지?? 원래fm대로는 private한건 다 게터세터를 만들어야함.
	
	private StudentDAO stDAO;
	private StudentInsert insert;
	private StudentDelete delete;
	private StudentUpdate update;
	private StudentSelect select;	
	private StudentSelectAll selectAll;
	
	public Controller() {
		this.stDAO = new StudentDAO();	
		this.insert = new StudentInsert(stDAO);//stDAO에 있는 기능을 쓸수있게 생성한다음 저장 
		this.delete = new StudentDelete(stDAO);//왜 stDAO를 생성을 여기서 하지??delete에서 뉴해도됨. 코드만드시는분이 이렇게 함. delete에서 stDAO를 쓰기위해 생성필요함. //delete에서 dao.delete로 연결해주기 위해 dao에서 delete란 기능을 생성해줌.
		this.update = new StudentUpdate(stDAO);//new하면서  studentupdate의 똑같은 이름을 가진 생성자실행.
		this.select = new StudentSelect(stDAO);
		this.selectAll = new StudentSelectAll(stDAO);
	}
	
	public StudentUpdate getUpdate() {
		return update;
	}

	public void setUpdate(StudentUpdate update) {
		this.update = update;
	}

	public StudentDelete getDelete() {
		return delete;
	}

	public void setDelete(StudentDelete delete) {
		this.delete = delete;
	}

	public StudentDAO getStDAO() {
		return stDAO;
	}
	
	public void setStDAO(StudentDAO stDAO) {
		this.stDAO = stDAO;
	}
	
	public StudentInsert getInsert() {
		return insert;
	}
	
	public void setInsert(StudentInsert insert) {
		this.insert = insert;
	}
	
	public StudentSelect getSelect() {
		return select;
	}
	
	public void setSelect(StudentSelect select) {
		this.select = select;
	}
	
	public StudentSelectAll getSelectAll() {
		return selectAll;
	}
	
	public void setSelectAll(StudentSelectAll selectAll) {
		this.selectAll = selectAll;
	}

	
	
}
