package step4_01.string;

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)
//2:24~4:25
public class StringEx13_정답1 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		//				  "김유신" , "홍길동"
		
		int[] rs= new int[names.length*names.length];
		String temp="";
		int k=0;
		int idx=0;
		
			for (int i = 0; i < names.length; i++) {
				String names1=names[i];
				idx=i;
				for (int j =i; j < names.length; j++) {
					rs[i]= names1.compareTo(names[j]); //compareTo는 문자열만 됨
					if(rs[i]>0) {
						names1=names[j];
						idx=j;
					}
				}
				
				temp=names[i];
				names[i]=names[idx];
				names[idx]=temp;
			
		
			
			}
			System.out.println(Arrays.toString(names));
	}

}
