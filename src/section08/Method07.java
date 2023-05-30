package section08;

public class Method07 {
	public static void main(String[] args) {
		int result = add(10,5);
		System.out.println("result: " +result);
	}
	
	//7. 인자 ㅇ 리턴 x -> 인자값을 받아 실행한 뒤 반환값을 준다.
	public static int add(int a, int b) {
		int result = a+b;
		return result;
		
	}
}
