package basic.switch_;

import java.util.Scanner;
/**
 * 230222 switch 조건문1
 * 기준 명확하면(case 적으면), 입력값이 명확하면 좋다.
 */
public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("성별을 입력하세요. (M/F): ");
		System.out.print("> ");
		String gender = sc.next();

		/*
		  -switch 키워드 뒤에 나오는 괄호는 boolean형 조건식이 아닌
		   변수나, 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능하다. 
		 */

		switch(gender) {
		
		/*
		 switch 괄호 안에 지정한 기준값에 따라 만족하는 case문을 순서대로 탐색한다.
		 적합한 case가 존재하는 경우, 해당 case에 종속된 문장을 실행.
		 따로 조치가 없다면 나머지 케이스들 연속적으로 실행.
		 */
		
		case "남자": case "ㅡ": case "m": case "M":
			System.out.println("남자입니다.");
			break;  //해당 case만 실행하고 switch문을 종료해라!

		case "여자": case "ㄹ": case "f": case "F":
			System.out.println("여자입니다.");
			break;
			
			
		default:  //case를 설정하지 않은 값들은 모두 default로 온다.
			System.out.println("잘못된 입력입니다.");
		}

		sc.close();

	}

}
