package step9_05.student_2;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
			
		while (true) {
			
			System.out.print("[1]추가 [2]삭제 [3]수정 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.println("아이디입력");
				String id =scan.next();
				System.out.println("번호 입력");
				int num = scan.nextInt();
				System.out.println("이름 입력");
				String name = scan.next();
				StudentInsert stInsert=controller.getInsert();
				stInsert.insert(new StudentVO(id, num, name));
			}
			
			else if (selectMenu == 2) {
				System.out.println("삭제할 아이디 입력");
				String id = scan.next();
				StudentDelete stDelete = controller.getDelete();
				stDelete.delete(id);
			}
			else if (selectMenu == 3) {
				System.out.println("아이디입력");
				String id =scan.next();
				System.out.println("수정할 번호 입력");
				int num = scan.nextInt();
				System.out.println("수정할 이름 입력");
				String name = scan.next();
				StudentUpdate stUpdate=controller.getUpdate();
				stUpdate.update(new StudentVO(id,num,name));
				
			}
			else if (selectMenu == 4) {
				System.out.println("아이디입력");
				String id = scan.next();
				StudentSelect stSelect = controller.getSelect();
				StudentVO st= stSelect.select(id);
				
				if(st!=null) st.printOneInfo();
			}
			else if (selectMenu == 5) {
				StudentSelectAll stSelectAll=controller.getSelectAll();
				stSelectAll.printAll();
			}
			else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			
			}
			
		}
		
	}

}
