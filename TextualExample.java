package basic;

public class TextualExample {

	public static void main(String[] args) {

		char c1 = 'A';
		System.out.println(c1);
//		""String 사용, 두글자 이상X 단일문자만
		
	    char c2 = 65;
	    System.out.println(c2);
//	    아스키코드 65번이 A, 66번이 B(10진법 127번까지)
	    
	    char c3 = 66;
	    System.out.println(c3);
		
		char c4 = 44032;
		System.out.println(c4);
//		유니코드 44032번이 '가'
		
	  /*
	   * #문자열을 저장할 수 있는 데이터 타입 String
	   * -저장하고 싶은 문자열을 겹따옴표 ("")에 담아 대입한다.
	   * -String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
	   * 기본 데이터 타입처럼 사용한다. (사실은 객체 타입)
	   */
		
		String s1 = "my dream";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
//		자바에서는 문자열의 덧셈 연산을 지원한다.
//		연산 결과로는 문자열을 연결해서 결합한 결과가 도출된다.
		System.out.println(s1 + s2);
//		덧셈 이외에는 지원 안됨 (-*/)
		
//		문자열과 다른 데이터 타입간의 연산
//		결과는 무조건 문자열의 덧셈 연산과 같다.
		System.out.println("-----------------------");
		
		System.out.println(100 + 100);    //int + int
		System.out.println("100" + "100");   //String + String
		System.out.println("100" + 100);     //String + int
		System.out.println(3.14 + "hi");    //double + String
		
		int month = 10;
		int day = 13;
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 " + month + "월 " + day + "일 입니다.");
//		띄어쓰기 하고 "" 닫기
		
		
	}

}
