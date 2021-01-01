package step9_01_oop_theory;
/*
 * 
 * 쓰레드 (동시에 실행되는 작업을 만들때 사용)
 * -작업의 단위
 * -운영체제에 의해서 관리되는 하나의 작업 혹은 테스크를 의미
 * ex) main()함수도 하나의 쓰레드
 * 
 * 
 * -main() 이외의 다른 쓰레드를 만들려면
 * Thread 클래스를 상속받거나 Runnable 인터페이스를 구현한다.
 * 
 */
class Game extends Thread{
	boolean isPlayGame = true;
	@Override
		public void run() {
			while(isPlayGame) {
				System.out.println("신나게 게임을 하는 중");
				try {Thread.sleep(500);} catch (InterruptedException e) {	e.printStackTrace();}
			}
			
		}
}
class Music extends Thread{ //Thread클래스를 상속받아서 사용할 수 있다.
	
	boolean isPlayMusic = true;
	
	@Override			//Thread클래스로부터 제공되는 run()메서드
	public void run() { //Thread가 실행할 명령어 기술
		while(isPlayMusic) {
			System.out.println("배경음악이 연주되는 중");
			//명령어를 딜레이 해주는 기능(쓰레드기능과는 상관없음)
			//1000>1초, 500>0.5초, 100>0.1초} 
			try {Thread.sleep(500); }catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
	
	
	
	
	
}




public class OOPEx15 {

	public static void main(String[] args) {
	
		Music musicPlay = new Music();
		musicPlay.start(); //쓰레드를 시작하는 메서드, 쓰레드의 run()메서드를 호출.
		
		Game gamePlay = new Game();
		gamePlay.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("신나게 카톡을 하는 중");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}	
			
			if(i==7) {
				System.out.println("앗 엄마다!!!");
				System.out.println("엄마가 오셔서 음악을 종료합니다");
				musicPlay.isPlayMusic = false;
				gamePlay.isPlayGame = false;
				break;
			}
		}
		
		

	}

}
