package step8_03.atm_v3;

public class UserManager2 {
	
	private UserManager2() {}
	private static UserManager2 instance=new UserManager2();
	public static UserManager2 getInstance() {
		return instance;
	}

	
	User[] userList;
	int userCount;
	int identifier = -1;
	
	
	void printAllUserInfo() {
		for (int i = 0; i < userCount; i++) {
			userList[i].printOneUserAllAccounts();
		}
	}
	
	void setDummy() {
		
		userCount = 5;
		userList = new User[userCount];
		for (int i=0; i<userCount; i++) {
			userList[i] = new User();
		}
				
		String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
		String[] b = {"l", "b", "c", "m", "e", "f", "g", "n", "i", "p", "k"};
		String[] c = {"s", "t", "u", "w", "v", "o", "x", "n", "q", "p", "r"};
		
		for (int i=0; i<userCount; i++) {
			String id = "";
			int rNum = ATM.ran.nextInt(a.length);
			id += a[rNum];
			rNum = ATM.ran.nextInt(b.length);
			id += b[rNum];
			rNum = ATM.ran.nextInt(c.length);
			id += c[rNum];
			
			userList[i].id = id;
		}
		
		String[] d = {"1", "8", "9", "4"};
		String[] e = {"2", "7", "0", "6"};
		String[] f = {"5", "3", "2", "7"};
		
		for (int i=0; i<userCount; i++) {
			String pw = "";
			int rNum = ATM.ran.nextInt(d.length);
			pw += d[rNum];
			rNum = ATM.ran.nextInt(e.length);
			pw += d[rNum];
			rNum = ATM.ran.nextInt(f.length);
			pw += d[rNum];
			
			userList[i].password = pw;
		}
		
		System.out.println("[메세지]더미 파일이 추가되었습니다.\n");
		
	}

	
	int checkId(String id) {
		int check=-1;
		for (int i = 0; i < userCount; i++) {
			if(id.equals(userList[i].id)) {
				check=i;
			}
		}
		return check;
	}
	
	
	void joinUser() {
		System.out.println("가입할 id를 입력");
		String id= ATM2.scan.next();
		int check= checkId(id);
		if(check==-1) {
			System.out.println("pw를 입력");
			String password=ATM2.scan.next();
			if(userCount==0) {
				userList=new User[userCount+1];
				userList[userCount]=new User();
			}
			else {
				User[] temp=userList;
				userList= new User[userCount+1];
				userList[userCount]=new User();
				for (int i = 0; i < userCount; i++) {
					userList[i]=temp[i];
				}
				temp=null;
			}
			//User user=new User();
			User user=new User(id, password);
			userList[userCount]=user;
			userCount++;
			FileManager2.getInstance().saveData();
			printAllUserInfo();
		}
		else {
			System.out.println("id가 중복됩니다");
			return;
		}
	}
	
	
	void leaveUser() {
		if(userCount==1) {
			userList[identifier]=null;
		}
		else if(userCount>1) {
			User[] temp=userList;
			userList=new User[userCount-1];
			int j=0;
			for (int i = 0; i < userCount; i++) {
				if(i!=identifier) {
					userList[j]=temp[i];
					j++;
				}
			}
			temp=null;
		}
		userCount--;
		identifier=-1;
		System.out.println("탈퇴완료");
		FileManager2.getInstance().saveData();
	}
	
	
	void loginUser() {
		System.out.println("id입력");
		String id= ATM2.scan.next();
		System.out.println("pw입력");
		String password= ATM2.scan.next();
		for (int i = 0; i < userCount; i++) {
			if(id.equals(userList[i].id) && password.equals(userList[i].password)){
				identifier=i;
			}
		}
		if(identifier==-1) {
			System.out.println("id와 pw를 다시 확인해주세요");
		}
		else {
			System.out.println(userList[identifier].id+"님 환영합니다");
			afterloginMenu();
		}
		
	}
	
	
	void logoutUser() {
		identifier=-1;
		System.out.println("로그아웃 완료");
	}
	
	
	void afterloginMenu() {
		
		while(true) {
			System.out.println("1)계좌생성\n 2)입금\n 3)출금\n 4)계좌이체\n 5)계좌조회\n 6)계좌삭제\n 7)회원탈퇴\n 0)뒤로가기");
			System.out.println("메뉴선택");
			int sel=ATM2.scan.nextInt();
			if(sel==1) {
				AccountManager2.getInstance().createAccount();
			}
			else if(sel==2) {
				AccountManager2.getInstance().income();
			}
			else if(sel==3) {
				AccountManager2.getInstance().outcome();
			}
			else if(sel==4) {
				AccountManager2.getInstance().transfer();
			}
			else if(sel==5) {
				AccountManager2.getInstance().lookupAcc();
			}
			else if(sel==6) {
				AccountManager2.getInstance().deleteAcc();
			}
			else if(sel==7) {
				leaveUser();
				break;
			}
			else if(sel==0) {
				logoutUser();
				break;
			}
		}
	}
}









