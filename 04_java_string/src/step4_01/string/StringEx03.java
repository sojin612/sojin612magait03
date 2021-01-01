package step4_01.string;
/*
 * 
 * 문자열 관련 메소드
 * 
 * 
 * 
 */
public class StringEx03 {

	public static void main(String[] args) {
		
		String str ="megait";
		System.out.println(str);
		
		//[1]문자열의 길이: length();
		int size = str.length(); //문자열 :length(), 배열 : length
		System.out.println(size);
		
		//[2]문자열 1개 추출(인덱싱) : charAt(index);
		char ch = str.charAt(0);
		System.out.println(ch);  //m
		
		ch=str.charAt(size-1);
		System.out.println(ch);  //t
		//[3] 문자열 여러개 추출(슬라이싱) : substring();
		
		//1)substring(index1, index2) : 마지막은 포함하지 않는다. (이상, 미만)
		String rs= str.substring(4,6);
		System.out.println(rs);  //it
		 
		//2) substring(index) : index부터 문자열 끝까지
		rs = str.substring(4);
		System.out.println(rs); //it
		
		//[4]구분자로 잘라내기 : split("구분자")
		str="hello, java, android";
		String[] ar= str.split(",");
		System.out.println(ar.length); //3
		System.out.println(ar[0]); 		//hello
		System.out.println(ar[1]);		//java
		System.out.println(ar[2]);		//android
		
		//(참고 이어붙이기)
		String result= "";  //형식적으로 ""빈것을 하나 만들어 놓고 더함
		result += ar[0];
		result +=",";
		result += ar[1];
		result +=",";
		result += ar[2];
		result +=",";
		System.out.println(result);
		
		//[5]문자열 비교 : compareTo()
		
		String str1="가";
		String str2="나";
		String str3="가";
		
		int rs1= str1.compareTo(str2);
		System.out.println(rs1); //음수(기준값이 작을 경우)
		
		int rs2= str2.compareTo(str1);
		System.out.println(rs2); //양수(기준값이 클 경우)
		
		int rs3= str1.compareTo(str3);
		System.out.println(rs3); //0 (같을 경우)
		

		
		
	}

}
