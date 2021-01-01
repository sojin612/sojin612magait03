package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayEx24_테스트문제1_2정답1 {

	public static void main(String[] args) {

		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		Scanner scan= new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int value=scan.nextInt();
		
		int idx=0;
		int temp=0;
		int k3=0;
		for (int i1 = 0; i1 < e.length; i1++) {
			if(value==d[i1]) {
				idx=i1;
			}
		}
		for (int i1 = 0; i1 < e.length; i1++) {
			if(d[i1]!=d[idx]) {
				e[k3]=d[i1];
				k3++;
			}
		}
		System.out.println(Arrays.toString(e));
		
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		value=0;
		idx=0;
		int idx2=0;
		int k1=0;
		System.out.println("제외할 번호와 값을 입력하세요");
		int num=scan.nextInt();
		value= scan.nextInt();
		for (int i = 0; i < g.length; i++) {
			if(num==f[i]) {
				idx=i;
			}
			if(value==f[i]) {
				idx2=i;
			}
		}
		for (int i = 0; i < g.length; i++) {
			if(f[i]!=f[idx] && f[i]!=f[idx2]) {
				g[k1]=f[i];
				k1++;
			}	
		}
		
		System.out.println(Arrays.toString(g));
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		num=0;
		idx=0;
		System.out.println("숫자를 입력하세요");
		num=scan.nextInt();
		for (int i = 0; i < h.length-1; i++) {
			h[i]=h[i+1];
		}
		h[h.length-1]=num;
			
		System.out.println(Arrays.toString(h));
	
		
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		num=0;
		System.out.println("숫자를 입력하세요");
		num=scan.nextInt();
		for (int j = 3; j >= 0 ; j--) {
			i[j+1]=i[j];
		}
		i[0]=num;
		System.out.println(Arrays.toString(i));
		
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		int p=5;
		for (int k2 = 0; k2 < k.length; k2++) {
			k[k2]=j[p-1];
			p--;
		}
		
		System.out.println(Arrays.toString(k));
		
	}

}
