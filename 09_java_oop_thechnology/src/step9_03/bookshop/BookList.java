package step9_03.bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

//	여러권의 책 정보(BookVO 클래스)를 기억하는 클래스
public class BookList {

	private ArrayList<BookVO> bookList = new ArrayList<>();		// 여러권의 책 정보를 기억하는 ArrayList를 선언한다.
	
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		String str = "";
		
		str += "==========================================================\n";
		str += "  도서명  저자  출판사  출판일  가격  \n";
		str += "==========================================================\n";
		
		int total = 0;
		
		for(int i=0 ; i<bookList.size() ; i++) { //bookList는 bookvo에서 만든것을 가져다가 쓴 것임을 어떻게 알수있나??<bookvo>에서 알수있고 여기서 추가하면서 보여지게됨.
			str += bookList.get(i) + "\n";
			total += bookList.get(i).getPrice();
		}
			
		
//		for(BookVO book : bookList) {
//			str += book + "\n";
//			total += book.getPrice();
//		}
		
		str += "==========================================================\n";
		DecimalFormat df = new DecimalFormat("#,##0원");
		str += "                      합계 금액 : " + df.format(total) + "\n";
		str += "==========================================================\n";
		
		return str;
	}

//	책 1권의 정보(BookVO 클래스 객체)를 인수로 넘겨받아 bookList ArrayList에 저장하는 메소드
	public void addBook(BookVO vo) {  //여기서 tostring이 이미 들어가있음 단지 보이지만 않을 뿐
		bookList.add(vo);    
	}
	
}













