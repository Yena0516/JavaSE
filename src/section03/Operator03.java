package section03;

import java.util.Scanner;

/*
 * 3.비교연산자 
 * 연산결과를 비교하여 booleam으로 반환한다.
 * 
 * > : 크다
 * >= : 크거나 같다
 * < : 작다
 * <= : 작거나 같다
 * == :같다
 * != : 다르다
 * 
 * Ctrl + Shift + o
 */
public class Operator03 {
	public static void main(String[] args) {
		boolean result = 10 < 20;
		System.out.println(result);
		
		if(result) {
			System.out.println("10은 20보다 작다.");	
		}else {
			System.out.println("10은 20보다 크거나 같다.");
		}
		
		Scanner scan = new Scanner(System.in);
			System.out.println("나이를 입력하세요 >>>");
			int age = scan.nextInt();
			if(age >= 19) {
				System.out.println("만 19세 이상입니다");
			}else {
				System.out.println("미성년자 입니다.");
			}
}
}
