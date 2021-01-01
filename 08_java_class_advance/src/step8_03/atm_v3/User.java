package step8_03.atm_v3;

public class User {
	
	String id;
	String password;
	Account[] accList;
	int accCount;
	
	
	User() {}  //기본생성자는 다른생성자를 만들면 자동으로 생기지 않음. 다른 생성자를 만들때 기본생성자를 안쓰더라도 기본으로 만들어줘야 함.
	
	User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	User(String id, String password, Account[] accList, int accCount) {
		this.id = id;
		this.password = password;
		this.accList = accList;
		this.accCount = accCount;
	}
	
	void printOneUserAllAccounts() {
		if(accCount == 0) {
			System.out.println(id + "\t" + password + "\t계좌를 개설해주세요.");
		}
		else if(accCount > 0) {
			System.out.print(id + "\t" + password + "\t");
			for (int i=0; i<accCount; i++) {
				System.out.print(accList[i].number + "/" + accList[i].money + "원;");
			}
			System.out.println();
		}
	}
	
	
}
