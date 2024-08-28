package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		
		
		byte byteNumber = 127; // 128 넣는 순간 에러
		// 메모리에 정수값을 저장할 공간을 1byte에 할당하고
		// 할당된 공간을 byteNumber 라고 부르겠다
		// 선언된 byteNumber 변수에 처음으로 127을 넣음.
		//-> 초기화 : 처음 변수에 값을 대입
		short shortNumber = 32767;
		
		// 정수 자료형 기본형! (short, byte 는 옛날코드 잔재)
		int intNumber = 2147483647;
	// 자료형 변수명 = 리터럴;
		
		// 프로그래밍에서 대입되는 이 데이터(값자체)를 리터럴 이라는 단어로도 표현
		
		// ** 리터럴 : 변수에 대입되거나 작성되어지는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000L; // L 또는 l
		// The literal 10000000000 of type int is out of range
		// -> 100억이라는 값은 int의 범위를 벗어났다!
		// 뒤에 L 을 붙여줌으로써 long 자료형인것을 나타냄.
		
		float floatNumber = 1.2345f; // F 또는 f
		// 1.2345 까지만 쓰면 double 자료형으로 인식함
		
		double doubleNumber = 3.141592;
		// double이 실수형 중에서 기본형!
		// 리터럴 표기법 없는 실수는 double 로 인식
		// d를 뒤에 쓸 수는 있다!
		
		
		// 문자형 리터럴 표기법 : '' (홑따옴표)
		// -> 문자 하나
		char ch = 'A';
		char ch2 = 66;
		
		/* char 자료형에 숫자가 대입될 수 있는 이유!
		 * - 컴퓨터에는 문자표가 존재하고 있음
		 * 	 숫자에 따라 지정된 문자 모양이 매핑되고
		 *   'B' 문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 * -> 반대로 생각하면 변수에 애총 ㅔ66이라는 숫자를
		 * 저장하는 것이 가능함
		 * */
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 X
		int abcdefg123456789; // G 다름
		
		// 2. 예약어 사용 X
		//double final;
		
		
		// 3. 숫자 시작 X
		// char 1abc;
		char a1bc;
		
		// 4. 특수문자 $, _ 만 사용 가능 (하지만 쓰지 않는다)
		int $intNumber; // 문제는 없지만 개발자가 직접 이렇게 작성 안함..
		int int_Number; // 자바는 카멜표기법 사용
						// _ 작성 표기법은 DB에서 사용
						// MEMBER_NAME
		
		// 5. 카멜표기법(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않음
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		
		// ---------------------------------
		
		final double PI_VALUE = 3.14;
		
		// PI_VALUE = 2.33; // 에러! 재대입 불가
		
		/* 상수 (항상 같은 수)
		 * - 변수 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입 할 수 없음!
		 * - 자료형 앞에 final 키워드를 작성
		 * 
		 * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성 시 _ 사용
		 * 
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 
		 * 
		 * */
		
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		System.out.println(1 + 1.3);
	}
	
}