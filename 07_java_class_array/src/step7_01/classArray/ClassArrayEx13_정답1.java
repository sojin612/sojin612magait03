package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class StudentEx{
	
	String id = "";
	String pw = "";
	
	void set_data(String id , String  pw) {
		this.id = id; 
		this.pw = pw;
	}
	
	
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
	
}

class Manager{
	
	StudentEx [] list = null;
	int stdCnt = 0;
	
	void add_StudentEx(StudentEx st) {
		if(stdCnt==0) {
			list=new StudentEx[1];
		}
		else if(stdCnt>0) {
			StudentEx[] temp=list;
			list=new StudentEx[stdCnt+1];
			for (int i = 0; i < temp.length; i++) {
				list[i]=temp[i];
			}
			temp=null;
		}
		list[stdCnt]=st;
		stdCnt++;
		
	}
	
	StudentEx remove_StudentEx (int index) {
		StudentEx del_st =list[index];
		if(stdCnt==1) {
			list=null;
		}
		else if(stdCnt>1) {
			StudentEx[] temp=list;
			list=new StudentEx[stdCnt-1];
			for (int i = 0; i < index; i++) {
				int j=0;
				list[j]=temp[i];
				j++;
			}
			for (int i = index; i < temp.length-1; i++) {
				int j=0;
				list[j]=temp[i+1];
				j++;
			}
			temp=null;
			stdCnt--;
		}
		return del_st;
		
	}
	
	int check_id(StudentEx st) {
		int check=-1;
		for (int i = 0; i < stdCnt; i++) {
			if(list[i].id.equals(st.id)) {
				check=i;
				break;
			}
		}
		
		return check;
		
	}
	
	void print_StudentEx() {
		for (int i = 0; i < stdCnt; i++) {
			list[i].print_data();  //왜 list[i].이지? list가 studentEx의 객체이기 때문
		}
		
	}	
	
	String out_data() {
		String data="";
		for (int i = 0; i < stdCnt; i++) {
			data+=list[i].id;
			data+="/";
			data+=list[i].pw;
			data+="\n";
		}
		return data;
	}
	
	void sort_data() {
		for (int i = 0; i < stdCnt; i++) {
			String name1=list[i].id;
			int idx=i;
			for (int j = i; j < stdCnt; j++) {
				if(list[i].id.compareTo(list[j].id)>0) { 
					if(stdCnt>2) {
						name1=list[j].id;
						idx=j;
					}
					else {
						idx=j;
					}
				}	
			}
			String temp=list[i].id;
			list[i].id=list[idx].id;
			list[idx].id=temp;  
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].id);
		}
		//배열은 리턴을 안하고 출력해도 됨
	}
	
	void load_StudentEx (StudentEx [] temp , int count) {
		this.stdCnt=count;
		this.list=temp;
	}
	
}


public class ClassArrayEx13_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Manager manager = new Manager();
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			/*
			 * [1] 가입하기 : ID 중복검사 구현
			 * [2] 탈퇴하기 : ID를 입력받아 탈퇴
			 * [3] 정렬하기 : 이름을 국어사전 순으로 정렬
			 * [4] 출력하기 : 데이터들을 화면에 출력
			 * [5] 저장하기 : 아래와 같은 형식으로 저장
			 * [6] 불러오기 : 파일에 저장된 내용을 불러오기
			 * [7] 종료하기 : 반복문을 종료
			 * 
			 * 			예) 
			 * 			2				// 회원 수
			 *			qwer,1234		// id,pw	
			 *			abcd,1111		// id, pw
			 */
			
			if		(sel == 1) {
				System.out.println("가입할 id를 입력하세요");
				StudentEx temp= new StudentEx();
				temp.id=scan.next();
				int check=manager.check_id(temp);//temp.id를 넣어도 상관없음//널포인터에러
				if(check==-1) {
					System.out.println("pw를 입력하세요");
					temp.pw=scan.next();
					manager.add_StudentEx(temp);
					System.out.println("가입완료");
					
				}
				else {
					System.out.println("id가 중복됩니다");
				}
			}
			else if (sel == 2) {
				System.out.println("탈퇴할 id를 입력하세요");
				StudentEx temp=new StudentEx();
				temp.id=scan.next();
				int check=manager.check_id(temp);
				if(check==-1) {
					System.out.println("잘못된  id입니다");
				}
				else {
					manager.remove_StudentEx(check); 
					System.out.println("탈퇴완료");
				}
			}
			else if (sel == 3) {
				manager.sort_data();
				manager.print_StudentEx();
			}
			else if (sel == 4) {
				manager.print_StudentEx();
			}
			else if (sel == 5) {
				if(manager.stdCnt==0) {
					continue;//처음의 반복문으로 돌아감(만약 while안에 for가 있으면 for로 감. for가 없고 while이 첫반복문임으로 while로 돌아감.
				}
				else {
					String fileName = "StudentEx_manager.txt";
					File file = new File(fileName);
					FileWriter fw;
					try {
						fw = new FileWriter(file);
						String data=manager.out_data();
						if(!data.equals(" ")) {
							fw.write(data);
						}
						fw.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
				
			}
			else if (sel == 6) {
			
			
				FileReader fr =null;
				BufferedReader br=null;
				try {
					String fileName = "StudentEx_manager.txt";//생성된 {}안에서만 유효??
					File file = new File(fileName);
					if(file!=null) {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						String line="";
						line= br.readLine();
						int count=Integer.parseInt(line);
						StudentEx[] temp=new StudentEx[count];
						for (int i = 0; i < temp.length; i++) {
							temp[i]=new StudentEx();
							line=br.readLine();
							String[] value=line.split("/");
							temp[i].id=value[0];
							temp[i].pw=value[1];
							
						}
						br.close();
						fr.close();
						manager.load_StudentEx(temp,count);
					}
				}catch(Exception e) {e.printStackTrace();}
					
				
			}
			else if (sel == 7) { 
				break; 
			}
			
		}

	}

}
