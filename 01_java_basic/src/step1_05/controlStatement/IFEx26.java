package step1_05.controlStatement;
/*
 * switch~case문
 * <형식>
 * switch(변수){
 *  	case 값:
 *  		명령어;
 *  		break;
 *  	case 값:
 *  		명령어;
 *  		break;
 *  	case 값:
 *  		명령어;
 *  		break;
 *  	default:
 *  		명령어;
 * }
 * 1. if문과 다르게 범위형태(조건식)으로 분기할 수 없고 일차적으로 값을 기준으로 분기한다.
 * 2. switch의 기준변수에는 정수,문자,문자열 자료형을 사용할 수 있다.
 * 3. 분기되는 case뿐만 아니라 그case의 아래 case까지 모두 수행한다.
 * 	 이것을 원치 않을 경우 의도적으로 보조제어문 break 명령어를 함께 작성한다.
 * 4. default는 case에 해당하는 값이 없을 경우 분기하는 구문이다.
 * 
 */
public class IFEx26 {

	public static void main(String[] args) {
		
		char chrVar = 'A'; //B,나 C로 대입해서 확인해보자.

		switch(chrVar) {
			case'A':
				System.out.println("A로 분기합니다");
				//break;
			case'B':
				System.out.println("B로 분기합니다");
			case'C':
				System.out.println("C로 분기합니다");
			default:
				System.out.println("default로 분기합니다");
		}
		

	}

}
