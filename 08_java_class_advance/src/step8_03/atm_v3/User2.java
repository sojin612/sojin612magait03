package step8_03.atm_v3;

public class User2 {
	
	String id;
	String password;
	Account[] accList;
	int accCount;
	
	UserManager2 um = UserManager2.getInstance();
	
	User2() {}
	
	User2(String id, String password) {
		this.id=id;
		this.password = password;
	}
	
	User2(String id, String password, Account[] accList, int accCount) {
		this.id=id;
		this.password = password;
		this.accList= accList;
		this.accCount=accCount;
	}
	
	
	void printOneUserAllAccounts() {
		for (int i = 0; i < um.userCount; i++) {
			System.out.println("id: "+um.userList[i].id+"pw: "+um.userList[i].password);
		}
		if(accCount!=0) {
			for (int i = 0; i < accCount; i++) {
				System.out.println("number: "+accList[i].number+" money: "+accList[i].money);
			}
		}
	}
	
	
}
