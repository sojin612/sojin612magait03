package step5_02.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


//# 파일 컨트롤러[1단계] : 벡터
//9:45~10:30
public class FileEx06_정답1 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vector = null;
		int elementCnt = 0;
		
		String fileName = "vector.txt";
		
		while (true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기"); //로드하기가 안됨
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				if(elementCnt==0) {
					vector=new int[elementCnt+1];
				}
				else if(elementCnt>0) {
					int[] temp=vector;
					vector=new int[elementCnt+1];
					for (int i = 0; i < temp.length; i++) {
						vector[i]=temp[i];
					}
					temp=null;
				}
				System.out.println("추가할 데이터를 입력하세요");
				int data=scan.nextInt();
				vector[elementCnt]=data;
				elementCnt++;
			}
			else if (sel == 2) {
				System.out.println("삭제할 인덱스를 입력하세요");
				int idx=scan.nextInt();
				if(elementCnt-1<idx || idx<0) {
					System.out.println("해당위치는 삭제할 수 없습니다");
					continue;
				}
				else if(elementCnt==1) {
					vector=null;
				}
				else if(elementCnt>1) {
					int[] temp=vector;
					vector=new int[elementCnt-1];
					for (int i = 0; i < temp.length; i++) {
						if(i!=idx) {
							int j=0;
							vector[j]=temp[i];
							j++;
						}
					}
					temp=null;
				}
				elementCnt--;
				System.out.println("삭제완료되었습니다");
			}
			else if (sel == 3) {
				String data= "";
				if(elementCnt>0) {
					for (int i = 0; i < vector.length; i++) {
						data+=vector[i];
						data+="\n";
					}
					data=data.substring(0, data.length()-1);
					FileWriter fw=null;
					
					try {
						fw=new FileWriter(fileName);
						fw.write(data);
						fw.close();
						System.out.println(data);
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}
			else if (sel == 4) {
				String data="";
				String line="";
				File file=new File(fileName);
				FileReader fr=null;
				BufferedReader br=null;
		
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
					data=data.substring(0, data.length()-1);
					
					String[] temp=data.split("\n");
					elementCnt=temp.length;
					vector=new int[elementCnt];
					
					for (int i = 0; i < elementCnt; i++) {
						vector[i]=Integer.parseInt(temp[i]);//넘침
					}
					
					System.out.println(Arrays.toString(vector));
					br.close();
					fr.close();
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
