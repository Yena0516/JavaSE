package section02;
/*
 * 출력문
 *  데이터를 화면에 출력하는 방법
 *  
 * System.out.println() : 괄호 안 내용 출력 후 행 바꿈
 * System.out.prit() : 괄호 안 내용 출력 행 바꿈X
 * System.out.pritf() : 문자열 서식 문자를 이용해 형식화 된 내용 출력 행 바꿈
 * 
 * 
 * 서식문자
 * %d : 정수 (10진수)
 * %o : 정수 (8진수)
 * %x : 정수 (16진수)
 * %f : 실수
 * %x : 정수 (16진수)
 * %e : 지수 (e표기 기반)
 * %g :
 * %s : 
 * %c : 
 * 
 * 
 * 
 * 실행단축기 ctrl+ F11
 * 
 * ctrl shift f 누르면 자동정렬 only in java
 * 
 * 
 */

public class consolePrint {
	public static void main(String[] args) {
		System.out.print("Welcom.");

		System.out.println("Java World");

		System.out.printf("오늘은 %d월 %d일 입니다.\n", 5, 16);

		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째.\n", 1, 2.0, "셋");

	}

}
