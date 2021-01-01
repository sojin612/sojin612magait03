package step8_01.atm_v1;

public class User {
	
	String name   = "";
	int accCount  = 0;
	Account[] acc = null;
	
	void set_acc() {  //check_acc 안에 있으면 check할때마다 기존값이 날라감
		acc =new Account[accCount];
		for (int i = 0; i < accCount; i++) {
			acc[i]=new Account();
		}
	}
	
	void printAccount() {
		
		for (int i = 0; i < accCount; i++) {
			acc[i].printOwnAccount();
		}	
	}
	
	int check_acc(String myAcc) {
		int check=-1;
		for (int i = 0; i < accCount; i++) {
			if(myAcc.equals(acc[i].number)) {
				check=i;
				break;
			}
		}
		System.out.println("check"+check);
		return check;
	}
	
	void add_acc(String myAcc) {
		if(accCount==0) {
			acc=new Account[accCount+1];
			acc[accCount]=new Account();
		}
		else {
			Account[] temp=acc;
			System.out.println("temp");
			for (Account account1 : temp) {
				System.out.println(account1.number);
			}
			System.out.println("acc");
			for (Account account2 : acc) {
				System.out.println(account2.number);
			}
			acc=new Account[accCount+1];
			acc[accCount]=new Account();
			for (int i = 0; i < accCount; i++) {
				acc[i]=temp[i];
			}
			temp=null;
		}
		acc[accCount].number=myAcc;
		accCount++;
	}
	
	int remove_acc(int idx) {
		if(accCount==1) {
			acc=null;
			System.out.println("acc=null");
		}
		else {
			int j=0;
			Account[] temp=acc;
			acc= new Account[accCount-1];
			for (int i = 0; i < accCount; i++) {
				if(i!=idx) {
					acc[j]=temp[i];
					j++;
				}
			}
			temp=null;
		}
		accCount--;
		return idx;
	}
}
