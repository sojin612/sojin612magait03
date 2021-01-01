package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//# 파일 로드하기 : 연습문제

//9:00~9:40
public class FileEx05_정답1 {

	public static void main(String[] args) {
		
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		
		String fileName = "fileTest02.txt";

		File file= new File(fileName);
		
		FileReader fr= null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = "";
			String line = "";
			while (true) {
				
				line= br.readLine();
				
				if ( line == null ) {
					break;
				}
				data += line;
				data += "\n";
			}
				data= data.substring(0,data.length()-1);
				
				String[] temp=data.split("\n");
				int size=temp.length;
				
				ids=new String[size];
				pws=new String[size];
				moneys=new int[size];
				
				for (int i = 0; i < temp.length; i++) {
					String[] info=temp[i].split("/");
					ids[i]=info[0];
					pws[i]=info[1];
					moneys[i]=Integer.parseInt(info[2]);
					
				}
				
			br.close();
			fr.close();
			for (int i = 0; i < moneys.length; i++) {
				System.out.println(ids[i]+" "+pws[i]+" "+moneys[i]);
				
			}
			
		} catch (Exception e) {


			e.printStackTrace();
		}
		
		
	}

}
