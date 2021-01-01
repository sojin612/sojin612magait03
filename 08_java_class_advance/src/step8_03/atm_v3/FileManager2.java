package step8_03.atm_v3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager2 {

	private FileManager2() {}
	private static FileManager2 instance= new FileManager2();
	public static FileManager2 getInstance() {
		return instance;
	}
	
	String fileName = "atmData2.txt";
	UserManager2 um = UserManager2.getInstance();
	
	
	boolean loadData() {
		boolean isfinish= false;
		File file = new File(fileName);
		FileReader fr= null;
		BufferedReader br=null;
		if(file.exists()) {
			um.userList = null;
			try {
				fr=new FileReader(file);
				br=new BufferedReader(fr);
				
				String line="";
				line=br.readLine();
				int count= Integer.parseInt(line);
				um.userList=new User[count];
				um.userCount=0;
				while(true) {
					line=br.readLine();
					if(line==null) break;
					
					String[] info=line.split("/");
					int size= info.length;
					
					User user=null;
					if(size==3) {
						user= new User(info[0], info[1], null, 0);
					}
					else {
						String id= info[0];
						String password = info[1];
						int accCount=Integer.parseInt(info[2]);
						Account[] accList=new Account[accCount];
						int j=3;
						for (int i = 0; i < accCount; i++) {
							accList[i]=new Account();
							accList[i].number=info[j];
							accList[i].money=Integer.parseInt(info[j+1]);
							j+=2;
						}
						user=new User(id, password, accList, accCount);
					}
					um.userList[um.userCount]=user;
					um.userCount++;
				}
				isfinish= true;
				System.out.println("파일로드완료");
			
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if(br!=null) {try {br.close();} catch(Exception e) {} }
				if(fr!=null) {try {br.close();} catch(Exception e) {} }
			}
		}
			return isfinish;
	}
	
	
	void saveData() {
		if(um.userCount==0) return;
		
		String data="";
		data+=um.userCount;
		data+="\n";
		for (int i = 0; i < um.userCount; i++) {
			data+=um.userList[i].id;
			data+="/";
			data+=um.userList[i].password;
			data+="/";
			data+=um.userList[i].accCount;
			
			if(um.userList[i].accCount>0) {
				data+="/";
				for (int j = 0; j < um.userList[i].accCount; j++) {
					data+=um.userList[i].accList[j].number;
					data+="/";
					data+=um.userList[i].accList[j].money;
					if (j != um.userList[i].accCount - 1) {
						data += "/";
					}
				}
				
			}
			if(i!=um.userCount-1) {
				data+="\n";
			}
		}
		File file= new File(fileName);
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(file);
			fw.write(data);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			if(fw!=null) {try {fw.close();} catch(IOException e) {}}
		}
	}

	
}
