package step8_02.atm_v2;

import java.util.Random;
import java.util.Scanner;

public class AccountManager2 {

	private AccountManager2() {}
	private static AccountManager2 instance=new AccountManager2();
	public static AccountManager2 getInstance() {
		return instance;
	}
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	UserManager2 um = UserManager2.getInstance();
	
	void creatAcc(int identifier) {
		int accCnt2=um.userList[identifier].accCnt;//에러
		int check=-1;
		if(accCnt2==3) {
			System.out.println("계좌개설은 3개까지만 가능합니다");
			return;
		}
		String makeAccount="";
		System.out.println("accCnt "+accCnt2);
		um.userList[identifier].acc[accCnt2]=new Account(); //에러
		
		while(true) {
			makeAccount=ran.nextInt(90000)+10001+"";
			for (int i = 0; i < accCnt2; i++) {
				if(!um.getCheckAcc(makeAccount)) {
					break;
				}
			}
			um.userList[identifier].acc[accCnt2].accNumber=makeAccount;
			um.userList[identifier].accCnt++;
			
		}
	}
	
void delAcc(int identifier){
	AccountManager.getInstance().printAcc(identifier);
	int accCntByUser=um.userList[identifier].accCnt;
	System.out.println("삭제할 계좌번호의 인덱스를 입력하세요");
	int idx=scan.nextInt();
	int idx2=um.getDelCheckAcc(idx);
	if(idx2==-1) {
		System.out.println("없는 계좌번호입니다");
	}
	else {
		if(accCntByUser==1) {
			um.userList[identifier].acc=null;
		}
		else {
			Account[] temp=um.userList[identifier].acc;
			um.userList[identifier].acc=new Account[accCntByUser-1]; 
			for (int i = 0; i < accCntByUser-1; i++) { 
				int j=0;
				if(i!=idx2) {
					um.userList[identifier].acc[j]=temp[i];
					j++;
				}
			}
			temp=null;
		}
		um.userList[identifier].accCnt--;
		System.out.println("삭제완료");
	}
}
		
	void printAcc(int identifier) {
		User temp=um.userList[identifier];
		System.out.println("id "+temp.id);
		for (int i = 0; i < temp.accCnt; i++) {
			System.out.println("accNumber "+temp.acc[i].accNumber+"money "+temp.acc[i].money);
		}
	}
	
}