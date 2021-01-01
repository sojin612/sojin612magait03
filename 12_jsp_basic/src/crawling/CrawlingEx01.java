package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CrawlingEx01 {

	public static void main(String[] args) {
	//최초 한번) lib폴더에 jsoup.jar파일을 저장한다.
		
		try {
		String url ="http://www.naver.com";
		
		//1)연결객체를 생성한다.
		Connection conn=Jsoup.connect(url);
		
		//2)get메서드를 통해 Document객체에 저장한다.
			Document getHtml=conn.get();
			System.out.println(getHtml); //확인(java 애플리케이션으로 돌려야함)
				
		//3)원하는 데이터를 크롤링 한다.
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
