package step6_02.method;

/*
 * 
 * 메서드 오버로딩(method overoading)
 *  
 */

class MethodOveroadintEx {
	
	int add(int x, int y) {
		return x+ y;
	}
	
	int add(int x, int y, int z) {
		return x+ y + z;
	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	int add(int[] arr) {
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total+=arr[i];
		}
		return total;
	}
	

}



public class MethodEx17 {

	public static void main(String[] args) {
		
		MethodOveroadintEx e = new MethodOveroadintEx();
		
		int[]arr= {1,2,3,4,5};
		
		int r1=e.add(10, 3);
		int r2=e.add(10, 3, 1);
		double r3=e.add(3.14, 7.14);
		int r4=e.add(arr);
		
		System.out.println("r1 "+r1);
		System.out.println("r2 "+r2);
		System.out.println("r3 "+r3);
		System.out.println("r4 "+r4);
		
	}

}
