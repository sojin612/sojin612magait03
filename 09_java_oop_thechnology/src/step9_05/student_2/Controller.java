package step9_05.student_2;
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
		stDAO = new StudentDAO();	
		insert = new StudentInsert(stDAO);
		delete = new StudentDelete(stDAO);
		update = new StudentUpdate(stDAO);
		select = new StudentSelect(stDAO);
		selectAll= new StudentSelectAll(stDAO);
		
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

	public StudentDelete getDelete() {
		return delete;
	}

	public void setDelete(StudentDelete delete) {
		this.delete = delete;
	}

	public StudentUpdate getUpdate() {
		return update;
	}

	public void setUpdate(StudentUpdate update) {
		this.update = update;
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
