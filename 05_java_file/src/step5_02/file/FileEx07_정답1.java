package step5_02.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM
//10:30~
public class FileEx07_정답1 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int accsCnt = 0;
		int identifier = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "atm.txt";
		
		while(true) {
			if(accsCnt!=0) {
				for (int i = 0; i < accsCnt; i++) {
					System.out.println(accs[i]+","+pws[i]+","+moneys[i]);
				}
			}
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드"); //로드하기가 안됨
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				if(accsCnt==5) {
					System.out.println("더이상 가입할 수 없습니다");
					continue;
				}
				else {
					int check=-1;
					System.out.println("가입할 계좌번호를 입력하세요");
					String myId=scan.next();
					for (int i = 0; i < accsCnt; i++) {
						if(accs[i].equals(myId)) {
							check=1;
						}
					}
					if(check==1) {
						System.out.println("계좌번호가 중복됩니다");
					}
					else {
					System.out.println("pw를 입력하세요");
					String myPw=scan.next();
					accs[accsCnt]=myId;
					pws[accsCnt]=myPw;
					moneys[accsCnt]=1000;
					accsCnt++;
					System.out.println("회원가입완료");
					}
				}
			}
			else if (sel == 2) {
				if(identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					for (int i = identifier; i < accsCnt-1; i++) {
						accs[i]=accs[i+1];
						pws[i]=pws[i+1];
						moneys[i]=moneys[i+1];
					}
					accsCnt--;
					identifier=-1;
					System.out.println("회원탈퇴완료");
				}
			}
			else if (sel == 3) {
				int check=-1;
				if(identifier!=-1) {
					System.out.println(accs[identifier]+"님 로그인중입니다");
				}
				else {
					System.out.println("계좌번호를 입력하세요");
					String meId=scan.next();
					System.out.println("pw를 입력하세요");
					String mePw=scan.next();
					for (int i = 0; i < accsCnt; i++) {
						if(accs[i].equals(meId)&& pws[i].equals(mePw)) {
							identifier=i;
							check=1;
						}
					}
					if(check==1) {
						System.out.println(accs[identifier]+"님 로그인 되었습니다");
					}
					else {
						System.out.println("계좌번호와 Pw를 확인해주세요");
					}
				}
			}
			else if (sel == 4) {
				if(identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					identifier=-1;
					System.out.println("로그아웃 되었습니다");
				}
			}
			else if (sel == 5) {
				if(identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					System.out.println("입금할 금액을 입력하세요");
					int deposit=scan.nextInt();
					moneys[identifier]+=deposit;
					System.out.println("입급완료");
				}
			}
			else if (sel == 6) {
				if(identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					System.out.println("출금할 금액을 입력하세요");
					int withdraw=scan.nextInt();
					if(moneys[identifier]>=withdraw) {
						moneys[identifier]-=withdraw;
					}
					else {
						System.out.println("잔액이 모자랍니다");
					}
				}
			}
			else if (sel == 7) {
				int check=-1;
				System.out.println("이체할 계좌번호를 입력하세요");
				String youId=scan.next();
				for (int i = 0; i < accsCnt; i++) {
					if(youId.equals(accs[i])) {
						check=i;
					}
				}
					if(check==-1) {
						System.out.println("계좌번호를 확인해주세요"); 
					}
					else {
						System.out.println("이체할 금액을 입력하세요");
						int youMoney=scan.nextInt();
						if(moneys[identifier]>=youMoney) {
							moneys[identifier]-=youMoney;
							moneys[check]+=youMoney;
							System.out.println("이체완료");
						}
						else {
							System.out.println("잔액이 모자랍니다");
						}
					}
				
			}
			else if (sel == 8) {
				
				if(identifier==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					System.out.println(accs[identifier]+"님의 잔액은"+moneys[identifier]+"원입니다");
				}
			}
			else if (sel == 9) {
				if(accsCnt==0) {
					System.out.println("저장할 데이터가 없습니다");
				}
				else {
					String data="";
					for (int i = 0; i < accsCnt; i++) {
						data+=accs[i];
						data+="/";
						data+=pws[i];
						data+="/";
						data+=moneys[i];
						data+="\n";
					}
					data=data.substring(0, data.length()-1);
					
					FileWriter fw= null;
					
					try {
						fw=new FileWriter(fileName);
						fw.write(data);
						fw.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}
			else if (sel == 10) {
				File file =new File(fileName);
				
				FileReader fr= null;
				BufferedReader br = null;
				
				String data="";
				String line="";
				
				try {
					fr=new FileReader(file);
					br=new BufferedReader(fr);
					
					while(true) {
						line=br.readLine();
						if(line==null) {
							break;
						}
						data+=line;
						data+="\n";
					}
					data=data.substring(0,data.length()-1);
					System.out.println(data);
					
					br.close();
					fr.close();
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				
			}
			else if (sel == 0) {
				break;
			}
			
		}
		
	}
}
