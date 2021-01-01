package step9_03.bookshop;

import java.util.Date;

public class BookShop {

	public static void main(String[] args) {
		
		BookList bookList = new BookList(); //bookList클래스를 어디서 쓸려고 객체생성??밑에 bookList를 add하고 출력하기 위해서
		
		BookVO book1 = new BookVO("자바1", "홍길동", "코리아출판사", new Date(), 18000);
		BookVO book2 = new BookVO("자바2", "홍길자", "코리아출판사", new Date(), 17000);
		BookVO book3 = new BookVO("자바3", "홍길숙", "코리아출판사", new Date(), 21000);
		BookVO book4 = new BookVO("자바4", "홍길희", "코리아출판사", new Date(), 35000);
		BookVO book5 = new BookVO("자바5", "홍길영", "코리아출판사", new Date(), 12000);
		BookVO book6 = new BookVO("자바6", "홍길도", "코리아출판사", new Date(), 15000);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);
		
	}
	
}








