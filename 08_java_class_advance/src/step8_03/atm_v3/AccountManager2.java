package step8_03.atm_v3;


public class AccountManager2 {

	private AccountManager2() {}
	private static AccountManager2 instance = new AccountManager2();
	public static AccountManager2 getInstance() {
		return instance;
	}
	UserManager2 um = UserManager2.getInstance();
	User user=um.userList[um.identifier];
	
	void createAccount() {
		
		if(user.accCount==3) {
			System.out.println("계좌는 3개까지만 개설할 수 있습니다");
			return;
		}
	
		while(true) {
			if(user.accCount==0) {
				user.accList=new Account[user.accCount+1];
				user.accList[user.accCount]=new Account();
			}
			else if(user.accCount>0){
				Account[] temp= user.accList;
				user.accList=new Account[user.accCount+1];
				user.accList[user.accCount]=new Account();
				for (int i = 0; i < user.accCount; i++) {
					user.accList[i]=temp[i];
				}
				temp=null;
			}
			String makeAccount = ATM2.ran.nextInt(90000)+10001+"";
			int check=checkAcc(makeAccount);
			if(check==-1) {
				user.accList[user.accCount].number=makeAccount;
				user.accList[user.accCount].money=0;
				user.accCount++;
				System.out.println("계좌생성완료");
				break;
			}
			else {
				continue;
			}
		}	
		FileManager2.getInstance().saveData();	
	}
	
	
	int showAccList(int identifier) {
		if(um.userList[um.identifier].accCount!=0) {
			for (int i = 0; i < um.userList[um.identifier].accCount; i++) {
				System.out.println("number: "+um.userList[um.identifier].accList[i].number+" money: "+um.userList[um.identifier].accList[i].money);
			}
		}
		return identifier;
	}
	
	
	void income() {
		int identifier=showAccList(um.identifier);
		System.out.println("입금할 계좌의 인덱스를 선택하세요");
		int idx= ATM2.scan.nextInt();
		int idx2=getAccIndex(idx);
		if(idx2!=-1) {
			System.out.println("입금할 금액을 입력");
			int money=ATM2.scan.nextInt();
			um.userList[um.identifier].accList[idx2].money+=money;
			System.out.println("입금완료");
			FileManager2.getInstance().saveData();
		}
		else {
			System.out.println("계좌를 먼저 생성해주세요");
			return;
		}
	}
	
	
	void outcome() {
		int identifier= showAccList(um.identifier);
		System.out.println("출금할 계좌의 인덱스를 선택하세요");
		int idx=ATM2.scan.nextInt();
		int idx2=getAccIndex(idx);
		if(idx!=-1) {
			System.out.println("출금할 금액을 입력");
			int money=ATM2.scan.nextInt();
			if(money> um.userList[um.identifier].accList[idx2].money) {
				System.out.println("잔액이 모자랍니다");
			}
			else {
				um.userList[um.identifier].accList[idx2].money-=money;
				System.out.println("출급완료");
			}
			FileManager2.getInstance().saveData();
		}
		else {
			System.out.println("계좌를 먼저 생성해주세요");
			return;
		}
	}
	

	int checkAcc(String makeAccount) {
		int check=-1;
		for (int i = 0; i < um.userList[um.identifier].accCount; i++) {
			if(makeAccount.equals(um.userList[um.identifier].accList[i].number))
			check=i;
		}
		
		return check;
	}
	
	
	int getAccIndex(int idx) {
		int idx2=-1;
		for (int i = 0; i < um.userList[um.identifier].accCount; i++) {
			if(um.userList[um.identifier].accList[idx].equals(um.userList[um.identifier].accList[i]))
				idx2=i;
		}
		return idx2;
	}
	
	
	void transfer() {
		int identifier= showAccList(um.identifier);
		System.out.println("계좌의 인덱스를 선택하세요");
		int idx=ATM2.scan.nextInt();
		int idx2=getAccIndex(idx);
		if(idx2!=-1) {
			System.out.println("이체할 계좌번호의 인덱스를 선택하세요");
			int index=ATM2.scan.nextInt();
			int index2=getAccIndex(index);
			if(index2!=-1) {
				System.out.println("이체할 금액을 입력");
				int money= ATM2.scan.nextInt();
				if(um.userList[um.identifier].accList[idx2].money>=money) {
					um.userList[um.identifier].accList[idx2].money-=money;
					um.userList[um.identifier].accList[index2].money+=money;
					System.out.println("이체완료");
					FileManager2.getInstance().saveData();
				}
				else {
					System.out.println("잔액이 모자랍니다");
				}
			}
			else {
				System.out.println("없는 계좌입니다");
				return;
			}
		}
		else {
			System.out.println("계좌를 먼저 생성해주세요");
			return;
		}
	}
	
	
	void lookupAcc() {
		um.userList[um.identifier].printOneUserAllAccounts();
	}

	
	void deleteAcc() {
		int identifier= showAccList(um.identifier);
		System.out.println("삭제할 계좌의 인덱스를 선택하세요");
		int idx=ATM2.scan.nextInt();
		int idx2=getAccIndex(idx);
		if(idx2!=-1) {
			if(user.accCount==1) {
				user.accList[0]=null;
			}
			else if(user.accCount>1){
				int j=0;
				Account[] temp=user.accList;
				user.accList=new Account[user.accCount-1];
				for (int i = 0; i < user.accCount; i++) {
					if(i!=idx2) {
						user.accList[j]=temp[i];
						j++;
					}
				}
				temp=null;
			}
			um.userList[identifier].accCount--;
			System.out.println("삭제완료");
		}
	}
	
}
