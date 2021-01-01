package step8_01.atm_v1;

import java.util.Scanner;

public class UserManager2 {
	Scanner scan = new Scanner(System.in);
	
	User[] user = null;
	int userCount=0;
	int check=-1;
	
	void printUserAllUser() {
		for (int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}
	
	void addUser() {
		if(userCount==0) {
			user=new User[1];
		}
		else {
			User[] temp= user;
			user= new User[userCount+1];
			for (int i = 0; i < userCount; i++) {
				user[i]=temp[i];
			}
			temp=null;
			System.out.println("가입할 id를 입력하세요");
			String name= scan.next();
			for (int i = 0; i < temp.length; i++) {
				if(user[i].equals(name)) {
					check=i;
					
				}
			}
			if(check!=-1) {
				System.out.println("중복된 id입니다");
			}
			else {
				user[userCount]=new User();
				user[userCount].name=name;
				System.out.println("가입완료");
				userCount++;
			}
		}
	}
	User getUser(int idx) {
		return user[idx];
	}
	
	int logUser() {
		int identifier=-1;
		System.out.println("id입력");
		String name= scan.next();
		for (int i = 0; i < userCount; i++) {
			if(name.equals(user[i])) {
				identifier=i;
				System.out.println(user[identifier]+"님 로그인 완료");
			}
		}
		return identifier;
	}
	void leave() {
		System.out.println("탈퇴할 id를 입력하세요");
		String name = scan.next();
		int identifier=-1;
		for (int i = 0; i < user.length; i++) {
			if(name.equals(user[i].name)) {
				identifier=i;
			}
		}
		if(identifier==-1) {
			System.out.println("없는 id입니다");
		}
		else {
			User[] temp= user;
			user=new User[userCount-1];
			for (int i = 0; i < identifier; i++) {
				user[i]=temp[i];
			}
			for (int i = identifier; i < temp.length-1; i++) {
				user[i]=temp[i+1];
			}
			temp=null;
			userCount--;
			System.out.println("탈퇴완료");
		}
	}
	
}
