package step8_02.atm_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager2 {
	
	private FileManager2() {}
	private static FileManager2 instance = new FileManager2();
	public static FileManager2 getInstance() {
		return instance;
	}
	UserManager2 um= UserManager2.getInstance();
	String fileName="ATM2.txt";
	String data="";
	
	void setData() {
		String data="";
		int userCount= um.userCnt;
		data+=userCount;
		data+="\n";
		for (int i = 0; i < userCount; i++) {
			data+=um.userList[i].id;
			data+="\n";
			data+=um.userList[i].pw;
			data+="\n";
			data+=um.userList[i].accCnt;
			data+="\n";
			if(um.userList[i].accCnt==0) {
				data+="0\n";
			}
			else {
				for (int j = 0; j < um.userList[i].accCnt; j++) {
					data+=um.userList[i].acc[j].accNumber;
					data+="/";
					data+=um.userList[i].acc[j].money;
					if(j!=um.userList[i].accCnt-1) {
						data+=",";
					}
				}
				data+="\n";
			}
		}
		
	}
	void save() {
		setData();
		String fileName="ATM2.txt";
		File file= new File(fileName);
		FileWriter fw= null;
		
		try {
			fw=new FileWriter(file);
			fw.write(data);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void load() {
		String fileName="ATM2.txt";
		File file= new File(fileName);
		
		FileReader fr= null;
		BufferedReader br = null;
		
		try {
			fr= new FileReader(file);
			br= new BufferedReader(fr);
			
			String line="";
			while(true) {
				if(line==null) {
					break;
				}
				line= br.readLine();
				data+=line;
				data+="\n";
			}
			String[] tmp=data.split("\n");
			
			um.userCnt=Integer.parseInt(tmp[0]);
			int j=0;
			for (int i = 1; i < um.userCnt; i+=4) {
				String id= tmp[i];
				String pw= tmp[i+1];
				um.userList=new User[um.userCnt];
				um.userList[j]=new User();
				um.userList[j].id=id;
				um.userList[j].pw=pw;
				um.userList[j].accCnt=Integer.parseInt(tmp[i+2]);
				int accCnt=um.userList[j].accCnt;
				String accInfo=tmp[i+3];
				if(accCnt==1) {
					String[] temp=accInfo.split("/");
					String acc= temp[0];
					int money= Integer.parseInt(temp[1]);
					um.userList[j].acc[0]=new Account();
					um.userList[j].acc[0].accNumber=acc;
					um.userList[j].acc[0].money= money;
					j++;
				}
				else if(accCnt>1) {
					String[] temp=accInfo.split(",");
					for (int k = 0; k < temp.length; k++) {
						String[] parse=temp[k].split("/");
						String acc= parse[0];
						int money= Integer.parseInt(parse[1]);
						um.userList[j].acc[k]=new Account();
						um.userList[j].acc[k].accNumber=acc;
						um.userList[j].acc[k].money= money;
					}
					j++;
				}
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			if(br!=null) {try {br.close();} catch (IOException e) {}}
			if(fr!=null) {try {fr.close();} catch (IOException e) {}}
		}
		
	}
}





