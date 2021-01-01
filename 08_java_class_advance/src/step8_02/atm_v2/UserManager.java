package step8_02.atm_v2;

import java.util.Random;
import java.util.Scanner;

public class UserManager {
	
	private UserManager() {}
	static private UserManager instance = new UserManager();
	static public UserManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	static final int ACC_MAX_CNT = 3;			// 최대 개설 가능한 계좌 수
	User[] userList = null;						// 전체 회원정보
	int userCnt = 0;							// 전체 회원 수


	// (테스트생성용 메서드)  : 테스트 데이타 > 더미
	void setDummy() {
		
		String[] ids  = {"user1", "user2",   "user3",   "user4", "user5"};
		String[] pws  = {"1111",   "2222",   "3333",     "4444",  "5555"};
		String[] accs = {"1234567",  "2345692",  "1078912",   "2489123",  "7391234"};
		int[] moneys  = { 87000,  12000,      49000,    34000,    128000};
		
		userCnt = 5;
		userList = new User[userCnt]; //왜 userList는 매번 새로만들게 했을까??Account처럼 미리만들어놓지않고??Account는 3개로 배열이 정해져있음. 
		
		for (int i=0; i<userCnt; i++) {
			userList[i] = new User();
			userList[i].id = ids[i];
			userList[i].pw = pws[i];
			userList[i].acc[0] = new Account();
			userList[i].acc[0].accNumber = accs[i];
			userList[i].acc[0].money = moneys[i];
			userList[i].accCnt += 1;
		}
		
	}
	
	
	void printAllUser() {
		
		for (int i=0; i<userCnt; i++) {
			System.out.print((i+1) + ".ID(" + userList[i].id + ")\tPW(" + userList[i].pw + ")\t");
			if (userList[i].accCnt != 0) {
				for (int j=0; j<userList[i].accCnt; j++) {
					System.out.print("(" + userList[i].acc[j].accNumber + ":" + userList[i].acc[j].money + ")");
				}
			}
			System.out.println();
		}
	}
	
	
	boolean getCheckAcc(String account) {
		
		boolean isDuple = false;
		for (int i=0; i<userCnt; i++) {
			for (int j=0; j<userList[i].accCnt; j++) {
				if (account.equals(userList[i].acc[j].accNumber)) {//에러
					isDuple = true;
				}
			}
		}
		return isDuple;
		
	}
	
	
	int logUser() {
		
		int identifier = -1;
		
		System.out.print("[로그인]아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[로그인]패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		for (int i=0; i<UserManager.instance.userCnt; i++) {
			if (userList[i].id.equals(id) && userList[i].pw.equals(pw)) {
				identifier = i;
			}
		}
		
		return identifier;

	}
	
	
	boolean checkId(String id) {
		
		boolean isDuple = false;
		for (int i=0; i<userCnt; i++) {
			if (userList[i].id.equals(id)) {
				isDuple = true;
			}
		}
		return isDuple;
		
	}
	
	
	void joinMember() {
		
		System.out.print("[회원가입]아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[회원가입]패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		boolean isResult = checkId(id);
		
		if (isResult) {
			System.out.println("[메세지]아이디가 중복됩니다.");
			return;
		}
		
		if (userCnt == 0) {
			userList = new User[userCnt + 1];
			userList[userCnt] = new User();
		}
		else {
			User[] tmp = userList;
			userList = new User[userCnt + 1];
			userList[userCnt] = new User();
			
			for(int i=0; i<userCnt; i++) {
				userList[i] = tmp[i];
			}
			tmp = null;
		}
		userList[userCnt].id = id;
		userList[userCnt].pw = pw;
		
		userCnt++;
		System.out.println("[메세지]회원가입을 축하합니다.");
		
		FileManager.getInstance().save();

	}
	
	int getDelCheckAcc(int idx) {
	
		for (int i = 0; i < userCnt; i++) {
			for (int j = 0; j < userList[i].accCnt; j++) {
				if(userList[i].acc[idx].accNumber.equals(userList[i].acc[j].accNumber)) {
					idx=j;
				}
			}
		}
	
		return idx;
	}
	
	int deleteMember(int identifier) {
		
		User[] tmp = userList;   //userCnt==1 이면 userList=null을 왜안하나??null안해도 프로그램은 돌아가나 해주는게 fm임.
		userList = new User[userCnt - 1];
		
		int j = 0;
		for (int i=0; i<userCnt; i++) {
			if (i != identifier) {
				userList[j] = tmp[i];
				j += 1;
			}
		}
		
		userCnt--;
		tmp = null;
		identifier = -1;
		
		System.out.println("[메세지]탈퇴되었습니다.");

		FileManager.getInstance().save();
		
		return identifier;
		
	}
	
}
