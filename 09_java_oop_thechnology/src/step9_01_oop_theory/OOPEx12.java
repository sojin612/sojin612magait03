package step9_01_oop_theory;
/*
 * 
 * 제네릭(Generic)
 * 
 * -클래스 내부에서 사용하는 데이터의 타입을 클래스의 인스턴스를 생성할때 결정하는 것을 의미한다.(this와 같다)
 * 
 * -객체의 타입을 컴파일 시점(만드는 시점)에 체크하기 때문에 타입의 안정성을 높이고 형변환의 번거로움을 줄일 수 있다.
 * -객체의 타입을 미리 만들어놓지 않음.
 * 
 * 
 * 
 */

class MyVector<T> {
	
	Object arr[] = null;
	int elementCnt =0;
	
	void add(T data) {
		
		if(elementCnt==0) {
			arr= new Object[1];
			
		}
		else {
			Object[] temp= arr;
			arr= new Object[elementCnt+1];
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
			}
			temp=null;
		}
		arr[elementCnt++]=data;
	}
	T get(int index){
		return (T)arr[index]; //형변환 
		
	}
	
	
	
}




class Client {
	
	String name;
	
	void printName() {
		System.out.println(name);
	}
	
}


class Manager {
	
	String name;
	
	void printName() {
		System.out.println(name);
	}
	
}

class Supervisor {
	
	String name;
	
	void printName() {
		System.out.println(name);
	}
	
}






public class OOPEx12 {

	public static void main(String[] args) {
		
		MyVector<Client> clientList = new MyVector<>();
		MyVector<Manager> managerList = new MyVector<>();
		MyVector<Supervisor> supervisorList = new MyVector<>();
		
		Client client = new Client();
		client.name = "Client";
		clientList.add(client);
		
		Manager manager = new Manager();
		manager.name = "Manager";
		managerList.add(manager);
		
		Supervisor supervisor = new Supervisor();
		supervisor.name = "Supervisor";
		supervisorList.add(supervisor);
		
		clientList.get(0).printName();
		managerList.get(0).printName();
		supervisorList.get(0).printName();
		
		
	}

}
