package step8_02.atm_v2;

import java.util.Random;
import java.util.Scanner;

public class AccountManager {

	private AccountManager() {}
	private static AccountManager instance = new AccountManager();
	public static AccountManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	UserManager um = UserManager.getInstance();

	void createAcc(int identifier) {
		
		int accCntByUser = um.userList[identifier].accCnt;
		
		if (accCntByUser == 3) {
			System.out.println("[메세지]계좌개설은 3개까지만 가능합니다.");
			return;
		}
		
		um.userList[identifier].acc[accCntByUser] = new Account(); //accCnt에 왜 넣지 않지? accCnt이름이 길어서 변수에 담은것임.
		
		String makeAccount = "";
		while (true) {
			makeAccount = ran.nextInt(9000000) + 1000001 + ""; //""는 뭐지??문자변환
			if (!um.getCheckAcc(makeAccount)){  //false가 아니면 무한루프(true이면 무한루프)
					break;
			}
		}
		um.userList[identifier].acc[accCntByUser].accNumber = makeAccount;
		um.userList[identifier].accCnt += 1;
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
		
		User temp = um.userList[identifier];
		System.out.println("====================");
		System.out.println("ID : " + temp.id);
		System.out.println("====================");
		for(int i=0; i<temp.accCnt; i++) {
			System.out.println("accNumber:" +temp.acc[i].accNumber + " / money: " + temp.acc[i].money);
		}
		System.out.println("=============================\n");
		
	}
	
}
