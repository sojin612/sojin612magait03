package step5_02.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//# 파일 컨트롤러[3단계] : 장바구니

public class FileEx08_정답1 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",   "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		String fileName = "jang.txt";
		
		int count = 0;
		int log = -1;
		
		
		while (true) {
			
			for (int i = 0; i < ids.length; i++) {
				System.out.print(ids[i]+":"+pws[i]+":"+"(");
				for (int j = 0; j < count; j++) {
					if(jang[j][0]==i) {
						if(jang[j][1]==1) System.out.print("사과");
						else if(jang[j][1]==2) System.out.print("바나나");
						else if(jang[j][1]==3) System.out.print("딸기");
						System.out.print("/");
					}
				}
				System.out.println(")");
			}
			if(log==-1) {
				System.out.println("로그아웃");
			}
			else {
				System.out.println("상태: "+ids[log]+"님 로그인");
			}
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				if(log!=-1) {
					System.out.println(ids[log]+"님 로그인 중입니다");
				}
				else {
					System.out.println("id를 입력하세요");
					String myId=scan.next();
					System.out.println("pw를 입력하세요");
					String myPw=scan.next();
					for (int i = 0; i < ids.length; i++) {
						if(ids[i].equals(myId)&& pws[i].equals(myPw)) {
							log=i;
						}
					}
					if(log==-1) {
						System.out.println("id와 pw를 확인해주세요");
					}
					else {
						System.out.println(ids[log]+"님 로그인되었습니다");
						
						
					}
				}
			}
			else if (sel == 2) {
				if(log==-1) {
					System.out.println("로그인 후 이용가능");
				}
				else {
					log=-1;
					System.out.println("로그아웃 되었습니다");
				}
			}
			else if (sel == 3) {
				for (int i = 0; i < items.length; i++) {
					System.out.println("("+(i+1)+")"+items[i]);	
				}
				System.out.println("상품번호를 입력하세요");
				int num=scan.nextInt();
				jang[count][0]=log;
				jang[count][1]=num;
				count++;
			}
			
			else if (sel == 4) {
				if(log!=-1) {
					System.out.println(ids[log]+"님의 장바구니");
					int j=0;
					for (int i = 0; i < count; i++) {
						if(log==jang[i][0]) {
							System.out.print((j+1)+"번");
							if(jang[i][1]==1) System.out.println("사과");
							else if(jang[i][1]==2) System.out.println("바나나");
							else if(jang[i][1]==3) System.out.println("딸기");
							j++;
						}
					}
				}
			}
			else if (sel == 5) {
				String data="";
				for (int i = 0; i < ids.length; i++) {
					data+=ids[i];
					data+="/";
					data+=pws[i];
					data+="/";
					data+=items[i];
					data+="\n";
				}
				data=data.substring(0,data.length()-1);
				FileWriter fw= null;
				
				try {
					fw=new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
			else if (sel == 6) {
				File file=new File(fileName);
				
				FileReader fr= null;
				BufferedReader br= null;
				
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
					
					br.close();
					fr.close();
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				
				
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
