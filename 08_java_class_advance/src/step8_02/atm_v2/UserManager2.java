package step8_02.atm_v2;

import java.util.Random;
import java.util.Scanner;

public class UserManager2 {
	
	private UserManager2() {}
	private static UserManager2 instance= new UserManager2();
	public static UserManager2 getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	static final int ACC_MAX_CNT=3;
	
	User[] userList=null;
	int userCnt=0;
	int identifier=-1;
	
	
	
	int check_id(String id, String pw) {
		
		for (int i = 0; i < userList.length; i++) {
			if(id.equals(userList[i])&pw.equals(userList[i].pw)) {
				identifier=i;
			}
		}
		return identifier;
	}
	void logUser() {
		System.out.println("id입력");
		String id= scan.next();
		System.out.println("pw입력");
		String pw= scan.next();
		int identifier=check_id(id,pw);
		if(identifier==-1) {
			System.out.println("id와 pw를 확인해주세요");
		}
		else {
			System.out.println(userList[identifier]+"님 환영합니다");
		}
	}
	
	
	void joinMember() {
		
		System.out.println("가입할 id를 입력");
		String id= scan.next();
		System.out.println("pw를 입력");
		String pw=scan.next();
		int identifier=check_id(id,pw);
		if(identifier==-1) {
			if(userCnt==0) {
				userList=new User[userCnt+1];
			}
			else {
				User[] temp=userList;
				userList=new User[userCnt+1];
				for (int i = 0; i < temp.length; i++) {
					userList[i]=temp[i];
				}
				temp=null;
			}
			userList[userCnt].id=id;
			userList[userCnt].pw=pw;
			userCnt++;
			System.out.println("회원가입완료");
			FileManager.getInstance().save();
		}
		else {
			System.out.println("id가 중복됩니다");
		}
	}
	
	Boolean getCheckAcc(String makeAccount) {
		boolean isrun=false;
		for (int i = 0; i < userCnt; i++) {
			for (int j = 0; j < userList[i].accCnt; j++) {
				if(makeAccount.equals(userList[i].acc[j].accNumber)) {
					isrun=true;
				}
			}
		}
		return isrun;
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
		if(userCnt==1) {
			userList=null;
		}
		else {
			User[] temp=userList;
			userList=new User[userCnt-1];
			int j=0;
			for (int i = 0; i < temp.length; i++) {
				if(i!=identifier) {
				userList[j]=temp[i];
				j++;
				}
			}
			temp=null;
			userCnt--;
			identifier=-1;
			System.out.println("회원탈퇴완료");
			FileManager2.getInstance().save();
		}
		return identifier;
	}
}
