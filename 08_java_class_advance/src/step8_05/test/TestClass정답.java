package step8_05.test;
import java.util.ArrayList;
import java.util.Arrays;

//class Member {
//	
//	private int    custno;			// 회원번호
//	
//	public int getCustno() {
//		return custno;
//	}
//
//	public void setCustno(int custno) {
//		this.custno = custno;
//	}
//
//	private String custname;		// 회원성명
//	public String getCustname() {
//		return custname;
//	}
//
//	public void setCustname(String custname) {
//		this.custname = custname;
//	}
//
//	private String phone;			// 회원전화
//	private String address;			// 통신사
//	private String joindate;		// 가입일자
//	private String grade;			// 고객등급
//	private String city;			// 거주도시
//	
//	public Member() {}
//	
//	public Member(int custno, String custname, String phone, String address, String joindate, String grade, String city) {
//		this.custno = custno;
//		this.custname = custname;
//		this.phone = phone;
//		this.address = address;
//		this.joindate = joindate;
//		this.grade = grade;
//		this.city = city;
//	}
//	
//}
//class Money {
//	
//	int custno;			// 회원번호
//	int saleno; 			// 판매번호
//	int pcost;				// 단가
//	int amount;			// 수량
//	int price;				// 가격(매출)
//	String pcode;			// 상품코드
//	String sdate;			// 판매일자
//	 
//	public Money() {}
//	 
//	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
//		this.custno = custno;
//		this.saleno = saleno;
//		this.pcost = pcost;
//		this.amount = amount;
//		this.price = price;
//		this.pcode = pcode;
//		this.sdate = sdate;
//	}
//}
//class Manager{
//	
//	ArrayList<Member> memberList = new ArrayList<Member>();
//	ArrayList<Money> moneyList = new ArrayList<Money>();
//	
//	void init() {
//		
//		memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));  //회원번호,이름,핸폰번호,통신사,가입일자,고객등급,거주도시
//		memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
//		memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
//		memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
//		memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
//		memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));
//		
//		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101")); //회원번호,판매번호,단가,수량,가격,상품코드,판매일자
//		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
//		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
//		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
//		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
//		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
//		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
//		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
//		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
//		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));	
//	}	
//}

public class TestClass정답 {

	public static void main(String[] args) {
		
//		Manager mg = new Manager();
//		mg.init();
		
		/*
		   [문제] 아 래와 같이 출력  매출(price) 의 합계 + 내림차순 
		  
			100001	김행복		8000
			--------------------------------
			100004	최사랑		4900
			--------------------------------
			100003	장믿음		3000
			--------------------------------
			100002	이축복		2500
			--------------------------------
		 */
//5:00~6:00  6:00~8:00		
		
//		String data="";
//		String[] price1=new String[mg.memberList.size()];
//		int[] total=new int[mg.memberList.size()];
//		for (int i = 0; i < mg.memberList.size(); i++) {
//			for (int j = 0; j < mg.moneyList.size(); j++) {
//				if(mg.memberList.get(i).getCustno()==(mg.moneyList.get(j).custno)) {
//					total[i]+=mg.moneyList.get(j).price;
//					
//				}
//			}
//			String[] total2=new String[mg.memberList.size()];
//			total2[i]=Integer.toString(total[i]);
//			data+=mg.memberList.get(i).getCustno();
//			data+="\t";
//			data+=mg.memberList.get(i).getCustname();
//			data+="\t";
//			data+=total[i];
//			data+="\n";		
//		}
//		
//		String[] temp = data.split("\n");
//		String[] temp2= new String[temp.length];
//		String[] tempnum=new String[temp.length];
//		String[] tempname=new String[temp.length];
//		String[] price11= new String[temp.length];
//		for (int i = 0; i < mg.memberList.size(); i++) {
//			tempnum[i]=temp[i].split("\t")[0];
//			tempname[i]=temp[i].split("\t")[1];
//			temp2[i]=temp[i].split("\t")[2];
//			price11[i]=temp2[i];
//		}
//		
//		for (int i = 0; i < temp.length; i++) {
//			String name1=price11[i];
//			int idx=i;
//			for (int j = i; j < mg.memberList.size(); j++) {
//				if(name1.compareTo(price11[j])<0) {
//					name1=price11[j];
//					idx=j;
//				}
//			}
//			String temp3=price11[i];
//			price11[i]=price11[idx];
//			price11[idx]=temp3;
//		}
//		
//		String userdata="";
//		
//		int idx=0;
//		int cnt=0;
//		for (int i = 0; i < price11.length; i++) {
//		
//			for (int j = 0; j < temp2.length; j++) {
//					if(price11[i].equals(temp2[j])) {
//						cnt++;
//						idx=j;
//					}
//					
//			}
//			if(cnt==6) {
//				userdata+=tempnum[idx--];
//				userdata+="\t";
//				userdata+=tempname[idx--];
//				userdata+="\t";
//				userdata+=price11[i];
//				userdata+="\n------------------\n";
//			}
//			else {
//			userdata+=tempnum[idx];
//			userdata+="\t";
//			userdata+=tempname[idx];
//			userdata+="\t";
//			userdata+=price11[i];
//			userdata+="\n------------------\n";
//			}
//		}
//		System.out.println(userdata);
	}
	
}
