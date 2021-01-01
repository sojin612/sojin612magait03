package step8_01.atm_v1;

import java.util.Scanner;

public class UserManager {
	
	Scanner scan = new Scanner(System.in);
	User[] user = null;
	int userCount = 0;
	
	void printAllUser() {
		for(int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}
	
	
	
	void addUser() {
		
		if(userCount == 0) {
			user = new User[1];
		}
		else {
			User[] temp = user;
			user = new User[userCount + 1];
			for(int i = 0; i < userCount; i++) {
				user[i] = temp[i];  //왜 temp를 null을 안하는지?? null해줘야 함  //왜 객체를 안넣는지?? userCount가 0일때 else는 실행안되고 밑에서 넣어줌
			}
		}
		
		
		System.out.print("[가입] 아이디를 입력하세요 : ");
		String name = scan.next();
		
		boolean isDuple = false;
		for (int i = 0; i < userCount; i++) {
			if (user[i].name.equals(name)) {
				isDuple = true;
			}
		}
		if (!isDuple) {//isDuple!=true 과 같은 것임
			user[userCount] = new User(); //user란 클래스의 객체임
			user[userCount].name = name;
			System.out.println("[메시지] ID : '" + name+ "' 가입 되었습니다.\n");
			
			userCount++;
		}
		else {
			System.out.println("[메시지] '"+ name + "'은 이미 가입된 아이디 입니다.\n");
		}
		
	}
	
	
	
	User getUser(int idx) { //idx를 받아서 꺼내서 idx를 리턴한다.
		
		return user[idx];
	}
	
	
	
	
	int logUser() {
		
		int identifier = -1;
		System.out.print("[입력] 아이디를 입력하세요 : ");
		String name = scan.next();
		
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].name)) {
				identifier = i;
				System.out.println("[" + user[identifier].name + "] 님 로그인.\n");
			}
		}
		
		return identifier;
		
	}
	
	
	
	void leave() {
		
		System.out.print("[입력] 탈퇴할 아이디를 입력하세요 : ");
		String name = scan.next();
		int identifier = -1;
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].name)) {
				identifier = i;			
			}
		}
		
		if(identifier == -1) {
			System.out.println("[메시지] 아이디를 다시 확인하세요.");
			return; //break과 같은 역할. 함수를 끝내고 함수를 호출했던 곳으로 다시 돌아감.
		}
		
		System.out.println("ID : '" +user[identifier].name + "' 가 탈퇴되었습니다.");
		
		User[] temp = user;
		user = new User[userCount - 1];
		
		for(int i = 0; i < identifier; i++) {
			user[i] = temp[i];
		}
		for(int i =identifier; i < userCount-1; i++) {
			user[i] =temp[i + 1];
		}
		
		userCount--;
		
	}
	
}
