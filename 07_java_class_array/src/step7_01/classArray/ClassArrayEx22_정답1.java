package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;


class StudentVO {
	String id;
	String pw;
	
	void set_data(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	void print_data() {
		System.out.println("id: "+id+"pw"+pw);
	}
}

class StudentManager {
	
	Vector<StudentVO> vec = new Vector<StudentVO>();
	
	int check_id(StudentVO temp) {
		
		int check=-1;
		
		for (int i = 0; i <vec.size(); i++) {
			//             manager.vec[i].id
			if(temp.id.equals(vec.get(i).id)) {
				check=i;
				break;
			}
		}
		
		return check;
	}
	void add_id(StudentVO temp) {
		vec.add(temp);
	}
	
	void sort_data(){
		for (int i = 0; i < vec.size(); i++) {  //length
			String name1=vec.get(i).id;
			int idx=i;
			for (int j = i; j < vec.size(); j++) {
				if(name1.compareTo(vec.get(j).id) >0){
					if(vec.size()>2) {
						name1=vec.get(j).id;
						idx=j;
					}
					else {
						idx=j;
					}
				}
				
			}
			String temp=vec.get(i).id;
			vec.get(i).id=vec.get(idx).id;
			vec.get(idx).id=temp;
		}
	}
	
	void print_data() {
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i).id+" ");
			
		}
		System.out.println();
	}
	String out_data() {
		String data="";
		data+=vec.size();
		data+="\n";
		for (int i = 0; i < vec.size(); i++) {
			data+=vec.get(i).id;
			data+="/";
			data+=vec.get(i).pw;
			data+="\n";
		}
		
		return data;
	}
	void load_data(Vector<StudentVO>temp) {
		
		vec=temp;
	}
}


public class ClassArrayEx22_정답1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StudentVO vo= new StudentVO();
		StudentManager manager = new StudentManager();
		
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			int identifier=-1;
			
			if 		(sel == 1) {
				StudentVO temp= new StudentVO();
				System.out.println("가입할 id를 입력");
				temp.id=scan.next();
				int check1 =manager.check_id(temp);
				if(check1==-1) {
					System.out.println("pw를 입력");
					temp.pw=scan.next();
					manager.add_id(temp);
					System.out.println("가입완료");
				}
				else {
					System.out.println("id가 중복됩니다");
				}
			} 
			else if (sel == 2) {
				System.out.println("탈퇴할 id 입력");
				StudentVO temp= new StudentVO();
				temp.id= scan.next();
				int check=manager.check_id(temp);
				//arraylist에서  remove해줘야 하나??해줘야 함
				if(check==-1) {
					System.out.println("없는 id입니다");
				}
				else {
					manager.vec.remove(check);
					System.out.println("탈퇴완료");
				}
			}
			else if (sel == 3) {
				manager.sort_data();
				manager.print_data();
				
			}
			else if (sel == 4) {
				manager.print_data();
			}
			else if (sel == 5) {
				String fileName="StudentVO_manager.txt";
				File file = new File(fileName);
				FileWriter fw =null;
				
				try {
					fw=new FileWriter(file);
					String data=manager.out_data();
					if(!data.equals(" ")) {
						fw.write(data);
					}
					fw.close();
				
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			else if (sel == 6) {
				String fileName="StudentVO_manager.txt";
				File file = new File(fileName);
				FileReader fr =null;
				BufferedReader br =null;
				
				try {
					fr= new FileReader(file);
					br= new BufferedReader(fr);
					String line="";
					line=br.readLine();
					int count=Integer.parseInt(line);
					//StudentVO[] temp= new StudentVO[count]; //널포인터에러.배열을 배열안에 넣는 구조는 안좋음
					
					manager.vec.clear();
					for (int i = 0; i < count; i++) {
						StudentVO temp = new StudentVO(); //객체생성이 모자라면 값이 덮어씌워지는데 앞의 값도 같이 바뀜
						//temp[i]=new StudentVO();
						line=br.readLine();
						String[] value=line.split("/");
						//temp[i].id=value[0];
						//temp[i].pw=value[1];
						temp.id=value[0];
						temp.pw=value[1];
						manager.vec.add(temp); //배열안에 배열을 넣는 것은 안좋음. 배열안에 객체를 넣어야 함(여기선)
					}
				
					
					br.close();
					fr.close();
					manager.load_data(manager.vec);
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				manager.print_data();
				
				
			}
			else if (sel == 7) {
				break;
			}
			
		}



	}

}
